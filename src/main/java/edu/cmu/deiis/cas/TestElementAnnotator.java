package edu.cmu.deiis.cas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.AnalysisComponent;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.resource.ResourceInitializationException;
import org.cleartk.ne.type.NamedEntityMention;

import edu.cmu.deiis.types.Answer;
import edu.cmu.deiis.types.Question;

public class TestElementAnnotator extends JCasAnnotator_ImplBase {

  private Pattern questionPatterns;

  private Pattern answerPatterns;

  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    // Get config. parameter values from oaqa-tutorial-ex2.yaml
    String questionString = "^Q\\s\\w.*\\?";
    String answerString = "A\\s\\d\\s.*\\.";

    // compile regular expressions
    questionPatterns = Pattern.compile(questionString);
    answerPatterns = Pattern.compile(answerString);

    String docText = aJCas.getDocumentText();

    Matcher matcher = questionPatterns.matcher(docText);
    Matcher answermatcher = answerPatterns.matcher(docText);
    while (matcher.find()) {
      FSArray answerScores = new FSArray(aJCas, 50);
      FSArray questionNE = new FSArray(aJCas, 50);
      int count = 0;
      // found one - create annotation
      Question question = new Question(aJCas);
      question.setCasProcessorId("TestElementAnnoataor");
      question.setConfidence(1.0);
      question.setBegin(matcher.start() + 2);
      question.setEnd(matcher.end());
      System.out.println("Question:" + question.getCoveredText());
      question.setAnswerScores(answerScores);
      question.setNumOfAnswerScore(0);

      while (answermatcher.find()) {
        // found one - create annotation
        Answer answer = new Answer(aJCas);
        FSArray answerNE = new FSArray(aJCas, 50);
        answer.setCasProcessorId("TestElementAnnoataor");
        answer.setConfidence(1.0);
        answer.setBegin(answermatcher.start() + 4);
        answer.setEnd(answermatcher.end());
        // System.out.println("The iscorrect is"+docText.substring(matcher.start()+2,
        // matcher.start()+3));
        // System.out.println("answer is "+answer.getCoveredText());
        if (docText.substring(answermatcher.start() + 2, answermatcher.start() + 3).trim()
                .equals("1")) {
          answer.setIsCorrect(true);
          count++;
        } else {
          answer.setIsCorrect(false);
        }
        answer.setQuestion(question);
        answer.addToIndexes();
        for (NamedEntityMention answerEntity : JCasUtil.selectCovered(NamedEntityMention.class,
                answer)) {
        
          int neCount = 0;
          answerNE.set(neCount, answerEntity);
          neCount++;
        }
        answer.setNameEntityMentions(answerNE);
      }
      question.setGsAnswerNum(count);
      question.addToIndexes();
      for (NamedEntityMention questionEntity : JCasUtil.selectCovered(NamedEntityMention.class,
              question)) {
     
        int neCount = 0;
        questionNE.set(neCount, questionEntity);
        neCount++;
      }
      question.setNameEntityMentions(questionNE);
    }

  }

}
