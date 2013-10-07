package edu.cmu.deiis.cas;

import java.awt.List;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;

import com.aliasi.tokenizer.RegExTokenizerFactory;
import com.aliasi.tokenizer.TokenNGramTokenizerFactory;
import com.aliasi.tokenizer.Tokenizer;
import com.aliasi.tokenizer.TokenizerFactory;

import edu.cmu.deiis.types.Annotation;
import edu.cmu.deiis.types.Answer;
import edu.cmu.deiis.types.NGram;
import edu.cmu.deiis.types.Question;
import edu.cmu.deiis.types.Token;

public class TokenAnnotator extends JCasAnnotator_ImplBase {

  static TokenizerFactory TOKENIZER_FACTORY = new RegExTokenizerFactory("(-|'|\\d|\\p{L})+");

  static TokenizerFactory NGramToken_FACTORY_2 = new TokenNGramTokenizerFactory(TOKENIZER_FACTORY,
          2, 2);

  static TokenizerFactory NGramToken_FACTORY_3 = new TokenNGramTokenizerFactory(TOKENIZER_FACTORY,
          3, 3);

  @Override
  public void process(JCas jCas) throws AnalysisEngineProcessException {

    int count;
    // TODO Auto-generated method stub
    FSIterator answers = jCas.getAnnotationIndex(Answer.type).iterator();
    FSIterator questions = jCas.getAnnotationIndex(Question.type).iterator();
    while (questions.hasNext()) {
      Question question = (Question) questions.next();
      Tokenizer NGramtokenizer_2 = NGramToken_FACTORY_2.tokenizer(question.getCoveredText()
              .toCharArray(), 0, question.getCoveredText().length());
      Tokenizer NGramtokenizer_3 = NGramToken_FACTORY_3.tokenizer(question.getCoveredText()
              .toCharArray(), 0, question.getCoveredText().length());
      Tokenizer tokenizer = TOKENIZER_FACTORY.tokenizer(question.getCoveredText().toCharArray(), 0,
              question.getCoveredText().length());
      Iterator<String> tokenList = tokenizer.iterator();
      Iterator<String> NGramtokenList_2 = NGramtokenizer_2.iterator();
      Iterator<String> NGramtokenList_3 = NGramtokenizer_3.iterator();

      
      
  
      FSArray elements_1 = new FSArray(jCas, 50);
      FSArray ngram2Tokens=new FSArray(jCas,50);
      FSArray ngram3Tokens=new FSArray(jCas,50);


      // Add the token and NGram=1
      count = 0;
      while (tokenList.hasNext()) {
        NGram ngram_1 = new NGram(jCas);
        FSArray ngram_1_Element = new FSArray(jCas, 1);
        String currentToken = tokenList.next();
        Token newToken = new Token(jCas);
        newToken.setBegin(tokenizer.lastTokenStartPosition() + question.getBegin());
        newToken.setEnd(tokenizer.lastTokenEndPosition() + question.getBegin());
//        System.out.println("question start with " + newToken.getBegin() + " End with "
//                + newToken.getEnd());
//        System.out.println("Token is " + newToken.getCoveredText());
        newToken.setCasProcessorId("Token");
        newToken.setConfidence(1.0);
        newToken.addToIndexes();
        ngram_1.setElementType("NGram1");
        elements_1.set(count, newToken);
        count++;
        ngram_1_Element.set(0, newToken);
        ngram_1.setElements(ngram_1_Element);
        ngram_1.setCasProcessorId("Unigram");
        ngram_1.setConfidence(1.0);
        ngram_1.addToIndexes();
      }
      
      question.setTokens(elements_1);
     

      // Add NGram=2
      count = 0;
      while (NGramtokenList_2.hasNext()) {
        NGram ngram_2 = new NGram(jCas);
        FSArray ngram_2_Element = new FSArray(jCas, 2);
        String currentToken = NGramtokenList_2.next();
        Tokenizer subTokenizer = TOKENIZER_FACTORY.tokenizer(currentToken.toCharArray(), 0,
                currentToken.length());
        Iterator<String> Ngram2tokenList = subTokenizer.iterator();
        Ngram2tokenList.next();
        Annotation newAnnotation1 = new Annotation(jCas);
        newAnnotation1.setBegin(subTokenizer.lastTokenStartPosition()+question.getBegin()+ NGramtokenizer_2.lastTokenStartPosition());
        newAnnotation1.setEnd(subTokenizer.lastTokenEndPosition()+question.getBegin()+NGramtokenizer_2.lastTokenStartPosition());
        
        Ngram2tokenList.next();
        Annotation newAnnotation2 = new Annotation(jCas);
        newAnnotation2.setBegin(subTokenizer.lastTokenStartPosition()+question.getBegin()+ NGramtokenizer_2.lastTokenStartPosition());
        newAnnotation2.setEnd(subTokenizer.lastTokenEndPosition()+question.getBegin()+NGramtokenizer_2.lastTokenStartPosition());
        ngram_2_Element.set(0, newAnnotation1);
        ngram_2_Element.set(1, newAnnotation2);
        
        ngram_2.setElementType("NGram2");
        ngram_2.setElements(ngram_2_Element);
        ngram_2.setCasProcessorId("Bigram");
        ngram_2.setConfidence(1.0);
        ngram_2.addToIndexes();
        ngram2Tokens.set(count, ngram_2);
        count++;
      }
      

      // Add NGram=3
      count = 0;
      while (NGramtokenList_3.hasNext()) {
        NGram ngram_3 = new NGram(jCas);
        String currentToken = NGramtokenList_3.next();
        Tokenizer subTokenizer = TOKENIZER_FACTORY.tokenizer(currentToken.toCharArray(), 0,
                currentToken.length());
        FSArray ngram_3_Element = new FSArray(jCas,3);
        Annotation newAnnotation1 = new Annotation(jCas);
        Iterator<String> Ngram3tokenList = subTokenizer.iterator();
        Ngram3tokenList.next();
        int start=0;
        start=NGramtokenizer_3.lastTokenStartPosition();
        newAnnotation1.setBegin(subTokenizer.lastTokenStartPosition()+start+question.getBegin());
        newAnnotation1.setEnd(subTokenizer.lastTokenEndPosition()+start+question.getBegin());
        
        
        Annotation newAnnotation2 = new Annotation(jCas);
        Ngram3tokenList.next();
        newAnnotation2.setBegin(subTokenizer.lastTokenStartPosition()+question.getBegin()+ start);
        newAnnotation2.setEnd(subTokenizer.lastTokenEndPosition()+question.getBegin()+start);

        Annotation newAnnotation3 = new Annotation(jCas);
        Ngram3tokenList.next();
        newAnnotation3.setBegin(subTokenizer.lastTokenStartPosition()+question.getBegin()+ start);
        newAnnotation3.setEnd(subTokenizer.lastTokenEndPosition()+question.getBegin()+start);
       
        
        ngram_3_Element.set(0, newAnnotation1);
        ngram_3_Element.set(1, newAnnotation2);
        ngram_3_Element.set(2, newAnnotation3);
        
        ngram_3.setElementType("NGram3");
        
        ngram_3.setElements(ngram_3_Element);
        ngram_3.setConfidence(1.0);
        ngram_3.setCasProcessorId("Trigram");
        ngram_3.addToIndexes(); 
        ngram3Tokens.set(count, ngram_3);
        count++;
      }
      
      question.setNgram2Tokens(ngram2Tokens);
      question.setNgram3Tokens(ngram3Tokens);

    }
    while (answers.hasNext()) {
      Answer answer = (Answer) answers.next();
    //  System.out.println("$$$$$" + answer.getCoveredText());
      Tokenizer tokenizer = TOKENIZER_FACTORY.tokenizer(answer.getCoveredText().toCharArray(), 0,
              answer.getCoveredText().length());
      Tokenizer NGramtokenizer_2 = NGramToken_FACTORY_2.tokenizer(answer.getCoveredText()
              .toCharArray(), 0, answer.getCoveredText().length());
      Tokenizer NGramtokenizer_3 = NGramToken_FACTORY_3.tokenizer(answer.getCoveredText()
              .toCharArray(), 0, answer.getCoveredText().length());

      Iterator<String> NGramtokenList_2 = NGramtokenizer_2.iterator();
      Iterator<String> NGramtokenList_3 = NGramtokenizer_3.iterator();
      Iterator<String> tokenList = tokenizer.iterator();

     

      FSArray elements_1 = new FSArray(jCas, 50);
      FSArray ngram2Tokens=new FSArray(jCas,50);
      FSArray ngram3Tokens=new FSArray(jCas,50);
      

      // Add the token and NGram=1
      count = 0;
      while (tokenList.hasNext()) {
        NGram ngram_1 = new NGram(jCas);
        String currentToken = tokenList.next();
        FSArray ngram_1_Element = new FSArray(jCas, 1);
        Token newToken = new Token(jCas);
        newToken.setBegin(tokenizer.lastTokenStartPosition()+answer.getBegin());
        newToken.setEnd(tokenizer.lastTokenEndPosition()+answer.getBegin());
        newToken.setCasProcessorId("Token");
        newToken.setConfidence(1.0);
        newToken.addToIndexes();
        ngram_1.setElementType("NGram1");
        elements_1.set(count, newToken);
        count++;
        ngram_1_Element.set(0, newToken);
        ngram_1.setElements(ngram_1_Element);
        ngram_1.setCasProcessorId("Bigram");
        ngram_1.setConfidence(1.0);
        ngram_1.addToIndexes();
      }
      
      answer.setTokens(elements_1);
      

      // Add NGram=2
      count = 0;
      while (NGramtokenList_2.hasNext()) {
        NGram ngram_2 = new NGram(jCas);
        String currentToken = NGramtokenList_2.next();
        FSArray ngram_2_Element = new FSArray(jCas, 2);
        Tokenizer subTokenizer = TOKENIZER_FACTORY.tokenizer(currentToken.toCharArray(), 0,
                currentToken.length());
        Iterator<String> Ngram2tokenList = subTokenizer.iterator();
        Ngram2tokenList.next();
        ngram_2.setElementType("NGram2");
        
        Annotation newAnnotation1 = new Annotation(jCas);
        newAnnotation1.setBegin(subTokenizer.lastTokenStartPosition()+answer.getBegin()+ NGramtokenizer_2.lastTokenStartPosition());
        newAnnotation1.setEnd(subTokenizer.lastTokenEndPosition()+answer.getBegin()+NGramtokenizer_2.lastTokenStartPosition());
        
        Ngram2tokenList.next();
        Annotation newAnnotation2 = new Annotation(jCas);
        newAnnotation2.setBegin(subTokenizer.lastTokenStartPosition()+answer.getBegin()+ NGramtokenizer_2.lastTokenStartPosition());
        newAnnotation2.setEnd(subTokenizer.lastTokenEndPosition()+answer.getBegin()+NGramtokenizer_2.lastTokenStartPosition());
        ngram_2_Element.set(0, newAnnotation1);
        ngram_2_Element.set(1, newAnnotation2);
        ngram_2.setElements(ngram_2_Element);
        ngram_2.setCasProcessorId("Bigram");
        ngram_2.setConfidence(1.0);
        ngram_2.addToIndexes();
        ngram2Tokens.set(count,ngram_2);
        count++;
        
      }
  

      // Add NGram=3
      count = 0;
      while (NGramtokenList_3.hasNext()) {
        NGram ngram_3 = new NGram(jCas);
        String currentToken = NGramtokenList_3.next();
        Tokenizer subTokenizer = TOKENIZER_FACTORY.tokenizer(currentToken.toCharArray(), 0,
                currentToken.length());
        FSArray ngram_3_Element = new FSArray(jCas,3);
        Annotation newAnnotation1 = new Annotation(jCas);
        Iterator<String> Ngram3tokenList = subTokenizer.iterator();
        Ngram3tokenList.next();
        int start=0;
        start=NGramtokenizer_3.lastTokenStartPosition();
        newAnnotation1.setBegin(subTokenizer.lastTokenStartPosition()+start+answer.getBegin());
        newAnnotation1.setEnd(subTokenizer.lastTokenEndPosition()+start+answer.getBegin());
        
        
        Annotation newAnnotation2 = new Annotation(jCas);
        Ngram3tokenList.next();
        newAnnotation2.setBegin(subTokenizer.lastTokenStartPosition()+answer.getBegin()+ start);
        newAnnotation2.setEnd(subTokenizer.lastTokenEndPosition()+answer.getBegin()+start);

        Annotation newAnnotation3 = new Annotation(jCas);
        Ngram3tokenList.next();
        newAnnotation3.setBegin(subTokenizer.lastTokenStartPosition()+answer.getBegin()+ start);
        newAnnotation3.setEnd(subTokenizer.lastTokenEndPosition()+answer.getBegin()+start);
       
        
        ngram_3_Element.set(0, newAnnotation1);
        ngram_3_Element.set(1, newAnnotation2);
        ngram_3_Element.set(2, newAnnotation3);
        
        ngram_3.setElementType("NGram3");
        ngram_3.setElements(ngram_3_Element);
        ngram_3.setConfidence(1.0);
        ngram_3.setCasProcessorId("Trigram");
        ngram_3.addToIndexes();  
        ngram3Tokens.set(count, ngram_3);
        count++;  
      }
      
      answer.setNgram2Tokens(ngram2Tokens);
      answer.setNgram3Tokens(ngram3Tokens);

    }

  }

}
