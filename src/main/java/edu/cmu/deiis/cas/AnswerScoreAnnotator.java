package edu.cmu.deiis.cas;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;

import edu.cmu.deiis.types.Annotation;
import edu.cmu.deiis.types.Answer;
import edu.cmu.deiis.types.AnswerScore;
import edu.cmu.deiis.types.NGram;
import edu.cmu.deiis.types.Question;
import edu.cmu.deiis.types.Token;

public class AnswerScoreAnnotator extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas jCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    FSIterator answers = jCas.getAnnotationIndex(Answer.type).iterator();
    FSIterator questions = jCas.getAnnotationIndex(Question.type).iterator();

    while (answers.hasNext()) {
      int currentAnswerScore = 0;
      double tokenScore;
      double ngram2Score;
      double ngram3Score;
      double answerNameEntityScore=0.0;
      Answer answer = (Answer) answers.next();
      AnswerScore answerScore = new AnswerScore(jCas);
      answerScore.setAnswer(answer);
      tokenScore=tokenOverlap(answer.getQuestion(),answer);
      ngram2Score=ngram2Overlap(answer.getQuestion(),answer);
      ngram3Score=ngram3Overlap(answer.getQuestion(),answer);
      if(cleartkCompareFSarray(answer.getQuestion().getNameEntityMentions(),answer.getNameEntityMentions())){
        answerNameEntityScore=1.0*0.2;
      }
//      System.out.println("tokenScore"+tokenScore);
//      System.out.println("ngram2Score"+ngram2Score);
//      System.out.println("ngarm3Score"+ngram3Score);
      answerScore.setScore((tokenScore/6)+(ngram2Score/3)+(ngram3Score/2)+answerNameEntityScore);
      
    //  System.out.println(answerScore.getAnswer().getCoveredText()+" "+answerScore.getScore());
      answerScore.setConfidence(1.0);
      answerScore.setCasProcessorId("AnswerScore");
      answerScore.addToIndexes();
      currentAnswerScore = answer.getQuestion().getNumOfAnswerScore();
      answer.getQuestion().setAnswerScores(currentAnswerScore, answerScore);
      currentAnswerScore++;
      answer.getQuestion().setNumOfAnswerScore(currentAnswerScore);
     // System.out.println("###########################");
    }

  }

  private double ngram3Overlap(Question question, Answer answer) {
    // TODO Auto-generated method stub
    FSArray questionNgram3=question.getNgram3Tokens();
    FSArray answerNgram3=answer.getNgram3Tokens();
    double overlapNum = 0.0;
    double answerTokenSize = 0.0;
    int i;
    for(i=0;i<questionNgram3.size();i++){
  
      if(questionNgram3.get(i)==null){
//        System.out.println("element1---->"+overlapNum);
//        System.out.println("element2---->"+answerTokenSize);
        return (double) (overlapNum / answerTokenSize);
        
      }
      NGram questionngram3=(NGram)questionNgram3.get(i);
      
      for (int j = 0; j < answerNgram3.size(); j++) {
        if (answerNgram3.get(j) == null) {
          break;
        }
        if (i == 0) {
          answerTokenSize++;
        }

        NGram  answerngram3= (NGram) answerNgram3.get(j);

        if (compareFSarray(questionngram3.getElements(),answerngram3.getElements())) {
         
          overlapNum++;
        }
      }   
    }
    
    
    return 0;
  }


  private boolean compareFSarray(FSArray elements, FSArray elements2) {
  
    for(int i=0;i<elements.size();i++){
      if(elements.get(i)==null){
        return true;
      }
      else{
        if (((Annotation) (elements.get(i))).getCoveredText().equals(((Annotation) (elements2.get(i))).getCoveredText())){
        
         continue;
        }
        else{
          return false;
        }
      }
    }
    // TODO Auto-generated method stub
    return true;
  }

  private boolean cleartkCompareFSarray(FSArray elements, FSArray elements2) {
    
    for(int i=0;i<elements.size();i++){
      if(elements.get(i)==null){
        return true;
      }
      else{
      
        for(int j=0;j<elements2.size();j++){
          if(elements2.get(j)==null){
            return false;
          }
          if(((org.apache.uima.jcas.tcas.Annotation) (elements.get(i))).getCoveredText().equals(((org.apache.uima.jcas.tcas.Annotation) (elements2.get(j))).getCoveredText())){
            break;
          }
         
        }
//        if (((org.apache.uima.jcas.tcas.Annotation) (elements.get(i))).getCoveredText().equals(((org.apache.uima.jcas.tcas.Annotation) (elements2.get(i))).getCoveredText())){
//        
//         continue;
//        }
//        else{
//          return false;
//        }
      }
    }
    // TODO Auto-generated method stub
    return true;
  }
  
  
  private double ngram2Overlap(Question question, Answer answer) {
    // TODO Auto-generated method stub
    
    FSArray questionNgram2=question.getNgram2Tokens();
    FSArray answerNgram2=answer.getNgram2Tokens();
    double overlapNum = 0.0;
    double answerTokenSize = 0.0;
    int i;
    for(i=0;i<questionNgram2.size();i++){
      if(questionNgram2.get(i)==null){
        return (double) (overlapNum / answerTokenSize);
      }
      NGram questionngram2=(NGram)questionNgram2.get(i);
      
      for (int j = 0; j < answerNgram2.size(); j++) {
        if (answerNgram2.get(j) == null) {
          break;
        }
        if (i == 0) {
          answerTokenSize++;
        }

        NGram  answerngram2= (NGram) answerNgram2.get(j);

        if (compareFSarray(questionngram2.getElements(),answerngram2.getElements())) {
          overlapNum++;
        }
      }   
    }
    return 0;
  }

  private double tokenOverlap(Question question, Answer answer) {
    // TODO Auto-generated method stub
    FSArray questionTokens = question.getTokens();
    FSArray answerTokens = answer.getTokens();
    double overlapNum = 0.0;
    double answerTokenSize = 0.0;
    int i;
    for (i = 0; i < questionTokens.size(); i++) {
      if (questionTokens.get(i) == null) {
        return (double) (overlapNum / answerTokenSize);
      }
      Token currentQuestionToken = (Token) questionTokens.get(i);
      for (int j = 0; j < answerTokens.size(); j++) {
        if (answerTokens.get(j) == null) {
          break;
        }
        if (i == 0) {
          answerTokenSize++;
        }

        Token currentAnswerToken = (Token) answerTokens.get(j);

        if (currentQuestionToken.getCoveredText().equals(
                (String) currentAnswerToken.getCoveredText())) {
          overlapNum++;
        }
      }
      // System.out.println("question is "+((Token)questionTokens.get(i)).getCoveredText());
    }
    return 0;
  }

}
