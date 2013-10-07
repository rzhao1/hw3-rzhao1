package edu.cmu.deiis.cas;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;

import edu.cmu.deiis.types.Answer;
import edu.cmu.deiis.types.AnswerScore;
import edu.cmu.deiis.types.Question;

public class Evaluation extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas jCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    
  
    FSIterator questions = jCas.getAnnotationIndex(Question.type).iterator();
    int correctcount;
    while(questions.hasNext()){
      correctcount=0;
      Question question=(Question)questions.next();
      for(int i=0;i<question.getGsAnswerNum();i++){
         sortAnswerScore(question);
      }
     
      for(int i=0;i<question.getNumOfAnswerScore();i++){
        if((((AnswerScore) question.getAnswerScores().get(i))).getAnswer().getIsCorrect()){
          System.out.println("+"+((AnswerScore)question.getAnswerScores().get(i)).getAnswer().getCoveredText()+" "+((AnswerScore)question.getAnswerScores().get(i)).getScore());
        }
        
        else{
          System.out.println("-"+((AnswerScore)question.getAnswerScores().get(i)).getAnswer().getCoveredText()+" "+((AnswerScore)question.getAnswerScores().get(i)).getScore());
        }
        
      }
      
      for(int i=0;i<question.getGsAnswerNum();i++){
        
        if(((AnswerScore)question.getAnswerScores().get(i)).getAnswer().getIsCorrect()){
         
          correctcount++;
        }
      }
      
        question.setPrecision((double)correctcount/(question.getGsAnswerNum()));
      
      
      System.out.println("Precision "+question.getGsAnswerNum()+": "+question.getPrecision());
    }
  }

  private void sortAnswerScore(Question question) {
    AnswerScore exchange;
    for(int i=0;i<question.getNumOfAnswerScore();i++){
      AnswerScore answerScore=(AnswerScore)question.getAnswerScores().get(i);
     // System.out.println(answerScore.getAnswer().getCoveredText()+" "+answerScore.getScore());
      for(int j=i+1;j<question.getNumOfAnswerScore();j++){
        AnswerScore compareAnswerScore=(AnswerScore)question.getAnswerScores().get(j);
        if(answerScore.getScore()<compareAnswerScore.getScore()){
          exchange=compareAnswerScore;
          compareAnswerScore=answerScore;
          answerScore=exchange;
          question.setAnswerScores(i,answerScore);
          question.setAnswerScores(j, compareAnswerScore);
        }
      }
    }
    // TODO Auto-generated method stub

  }

}
