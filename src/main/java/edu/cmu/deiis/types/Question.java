

/* First created by JCasGen Wed Sep 11 13:44:28 EDT 2013 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



import org.apache.uima.jcas.cas.FSArray;


import org.cleartk.ne.type.NamedEntityMention;


/** 
 * Updated by JCasGen Mon Sep 30 22:50:14 EDT 2013
 * XML source: /Users/ranzhao/Documents/workspace/hw3-rzhao1/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class Question extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: tokens

  /** getter for tokens - gets The tokens are included in the question.
   * @generated */
  public FSArray getTokens() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.Question");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets The tokens are included in the question. 
   * @generated */
  public void setTokens(FSArray v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokens - gets an indexed value - The tokens are included in the question.

   * @generated */
  public Token getTokens(int i) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokens), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokens), i)));}

  /** indexed setter for tokens - sets an indexed value - The tokens are included in the question.

   * @generated */
  public void setTokens(int i, Token v) { 
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokens), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokens), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: gsAnswerNum

  /** getter for gsAnswerNum - gets The total number of correct answer.
   * @generated */
  public int getGsAnswerNum() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_gsAnswerNum == null)
      jcasType.jcas.throwFeatMissing("gsAnswerNum", "edu.cmu.deiis.types.Question");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Question_Type)jcasType).casFeatCode_gsAnswerNum);}
    
  /** setter for gsAnswerNum - sets The total number of correct answer. 
   * @generated */
  public void setGsAnswerNum(int v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_gsAnswerNum == null)
      jcasType.jcas.throwFeatMissing("gsAnswerNum", "edu.cmu.deiis.types.Question");
    jcasType.ll_cas.ll_setIntValue(addr, ((Question_Type)jcasType).casFeatCode_gsAnswerNum, v);}    
   
    
  //*--------------*
  //* Feature: answerScores

  /** getter for answerScores - gets The array of assigned answers scores.
   * @generated */
  public FSArray getAnswerScores() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answerScores == null)
      jcasType.jcas.throwFeatMissing("answerScores", "edu.cmu.deiis.types.Question");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answerScores)));}
    
  /** setter for answerScores - sets The array of assigned answers scores. 
   * @generated */
  public void setAnswerScores(FSArray v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answerScores == null)
      jcasType.jcas.throwFeatMissing("answerScores", "edu.cmu.deiis.types.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_answerScores, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answerScores - gets an indexed value - The array of assigned answers scores.
   * @generated */
  public AnswerScore getAnswerScores(int i) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answerScores == null)
      jcasType.jcas.throwFeatMissing("answerScores", "edu.cmu.deiis.types.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answerScores), i);
    return (AnswerScore)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answerScores), i)));}

  /** indexed setter for answerScores - sets an indexed value - The array of assigned answers scores.
   * @generated */
  public void setAnswerScores(int i, AnswerScore v) { 
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answerScores == null)
      jcasType.jcas.throwFeatMissing("answerScores", "edu.cmu.deiis.types.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answerScores), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answerScores), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: numOfAnswerScore

  /** getter for numOfAnswerScore - gets The number of answerscore available to a question. It is used when we add the new answer score to the question.
   * @generated */
  public int getNumOfAnswerScore() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_numOfAnswerScore == null)
      jcasType.jcas.throwFeatMissing("numOfAnswerScore", "edu.cmu.deiis.types.Question");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Question_Type)jcasType).casFeatCode_numOfAnswerScore);}
    
  /** setter for numOfAnswerScore - sets The number of answerscore available to a question. It is used when we add the new answer score to the question. 
   * @generated */
  public void setNumOfAnswerScore(int v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_numOfAnswerScore == null)
      jcasType.jcas.throwFeatMissing("numOfAnswerScore", "edu.cmu.deiis.types.Question");
    jcasType.ll_cas.ll_setIntValue(addr, ((Question_Type)jcasType).casFeatCode_numOfAnswerScore, v);}    
   
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets The precision of the question.
   * @generated */
  public double getPrecision() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "edu.cmu.deiis.types.Question");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Question_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets The precision of the question. 
   * @generated */
  public void setPrecision(double v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "edu.cmu.deiis.types.Question");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Question_Type)jcasType).casFeatCode_precision, v);}    
   
    
  //*--------------*
  //* Feature: ngram2Tokens

  /** getter for ngram2Tokens - gets The NGram2 token array.
   * @generated */
  public FSArray getNgram2Tokens() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_ngram2Tokens == null)
      jcasType.jcas.throwFeatMissing("ngram2Tokens", "edu.cmu.deiis.types.Question");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngram2Tokens)));}
    
  /** setter for ngram2Tokens - sets The NGram2 token array. 
   * @generated */
  public void setNgram2Tokens(FSArray v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_ngram2Tokens == null)
      jcasType.jcas.throwFeatMissing("ngram2Tokens", "edu.cmu.deiis.types.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngram2Tokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for ngram2Tokens - gets an indexed value - The NGram2 token array.
   * @generated */
  public NGram getNgram2Tokens(int i) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_ngram2Tokens == null)
      jcasType.jcas.throwFeatMissing("ngram2Tokens", "edu.cmu.deiis.types.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngram2Tokens), i);
    return (NGram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngram2Tokens), i)));}

  /** indexed setter for ngram2Tokens - sets an indexed value - The NGram2 token array.
   * @generated */
  public void setNgram2Tokens(int i, NGram v) { 
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_ngram2Tokens == null)
      jcasType.jcas.throwFeatMissing("ngram2Tokens", "edu.cmu.deiis.types.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngram2Tokens), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngram2Tokens), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: ngram3Tokens

  /** getter for ngram3Tokens - gets The ngram3 token array.
   * @generated */
  public FSArray getNgram3Tokens() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_ngram3Tokens == null)
      jcasType.jcas.throwFeatMissing("ngram3Tokens", "edu.cmu.deiis.types.Question");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngram3Tokens)));}
    
  /** setter for ngram3Tokens - sets The ngram3 token array. 
   * @generated */
  public void setNgram3Tokens(FSArray v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_ngram3Tokens == null)
      jcasType.jcas.throwFeatMissing("ngram3Tokens", "edu.cmu.deiis.types.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngram3Tokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for ngram3Tokens - gets an indexed value - The ngram3 token array.
   * @generated */
  public NGram getNgram3Tokens(int i) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_ngram3Tokens == null)
      jcasType.jcas.throwFeatMissing("ngram3Tokens", "edu.cmu.deiis.types.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngram3Tokens), i);
    return (NGram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngram3Tokens), i)));}

  /** indexed setter for ngram3Tokens - sets an indexed value - The ngram3 token array.
   * @generated */
  public void setNgram3Tokens(int i, NGram v) { 
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_ngram3Tokens == null)
      jcasType.jcas.throwFeatMissing("ngram3Tokens", "edu.cmu.deiis.types.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngram3Tokens), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngram3Tokens), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: nameEntityMentions

  /** getter for nameEntityMentions - gets The array of name entity metions of the question.

   * @generated */
  public FSArray getNameEntityMentions() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_nameEntityMentions == null)
      jcasType.jcas.throwFeatMissing("nameEntityMentions", "edu.cmu.deiis.types.Question");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_nameEntityMentions)));}
    
  /** setter for nameEntityMentions - sets The array of name entity metions of the question.
 
   * @generated */
  public void setNameEntityMentions(FSArray v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_nameEntityMentions == null)
      jcasType.jcas.throwFeatMissing("nameEntityMentions", "edu.cmu.deiis.types.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_nameEntityMentions, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for nameEntityMentions - gets an indexed value - The array of name entity metions of the question.

   * @generated */
  public NamedEntityMention getNameEntityMentions(int i) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_nameEntityMentions == null)
      jcasType.jcas.throwFeatMissing("nameEntityMentions", "edu.cmu.deiis.types.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_nameEntityMentions), i);
    return (NamedEntityMention)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_nameEntityMentions), i)));}

  /** indexed setter for nameEntityMentions - sets an indexed value - The array of name entity metions of the question.

   * @generated */
  public void setNameEntityMentions(int i, NamedEntityMention v) { 
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_nameEntityMentions == null)
      jcasType.jcas.throwFeatMissing("nameEntityMentions", "edu.cmu.deiis.types.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_nameEntityMentions), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_nameEntityMentions), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    