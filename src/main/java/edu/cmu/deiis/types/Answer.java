

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
public class Answer extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
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
  //* Feature: isCorrect

  /** getter for isCorrect - gets 
   * @generated */
  public boolean getIsCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "edu.cmu.deiis.types.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect);}
    
  /** setter for isCorrect - sets  
   * @generated */
  public void setIsCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "edu.cmu.deiis.types.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect, v);}    
   
    
  //*--------------*
  //* Feature: tokens

  /** getter for tokens - gets The tokens are included in the answer.
   * @generated */
  public FSArray getTokens() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.Answer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets The tokens are included in the answer. 
   * @generated */
  public void setTokens(FSArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokens - gets an indexed value - The tokens are included in the answer.

   * @generated */
  public Token getTokens(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens), i)));}

  /** indexed setter for tokens - sets an indexed value - The tokens are included in the answer.

   * @generated */
  public void setTokens(int i, Token v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: question

  /** getter for question - gets Its corresponding question.
   * @generated */
  public Question getQuestion() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "edu.cmu.deiis.types.Answer");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_question)));}
    
  /** setter for question - sets Its corresponding question. 
   * @generated */
  public void setQuestion(Question v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "edu.cmu.deiis.types.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_question, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: ngram2Tokens

  /** getter for ngram2Tokens - gets The ngram2 token array.
   * @generated */
  public FSArray getNgram2Tokens() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_ngram2Tokens == null)
      jcasType.jcas.throwFeatMissing("ngram2Tokens", "edu.cmu.deiis.types.Answer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngram2Tokens)));}
    
  /** setter for ngram2Tokens - sets The ngram2 token array. 
   * @generated */
  public void setNgram2Tokens(FSArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_ngram2Tokens == null)
      jcasType.jcas.throwFeatMissing("ngram2Tokens", "edu.cmu.deiis.types.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngram2Tokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for ngram2Tokens - gets an indexed value - The ngram2 token array.

   * @generated */
  public NGram getNgram2Tokens(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_ngram2Tokens == null)
      jcasType.jcas.throwFeatMissing("ngram2Tokens", "edu.cmu.deiis.types.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngram2Tokens), i);
    return (NGram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngram2Tokens), i)));}

  /** indexed setter for ngram2Tokens - sets an indexed value - The ngram2 token array.

   * @generated */
  public void setNgram2Tokens(int i, NGram v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_ngram2Tokens == null)
      jcasType.jcas.throwFeatMissing("ngram2Tokens", "edu.cmu.deiis.types.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngram2Tokens), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngram2Tokens), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: ngram3Tokens

  /** getter for ngram3Tokens - gets The ngram3 token array.
   * @generated */
  public FSArray getNgram3Tokens() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_ngram3Tokens == null)
      jcasType.jcas.throwFeatMissing("ngram3Tokens", "edu.cmu.deiis.types.Answer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngram3Tokens)));}
    
  /** setter for ngram3Tokens - sets The ngram3 token array. 
   * @generated */
  public void setNgram3Tokens(FSArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_ngram3Tokens == null)
      jcasType.jcas.throwFeatMissing("ngram3Tokens", "edu.cmu.deiis.types.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngram3Tokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for ngram3Tokens - gets an indexed value - The ngram3 token array.
   * @generated */
  public NGram getNgram3Tokens(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_ngram3Tokens == null)
      jcasType.jcas.throwFeatMissing("ngram3Tokens", "edu.cmu.deiis.types.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngram3Tokens), i);
    return (NGram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngram3Tokens), i)));}

  /** indexed setter for ngram3Tokens - sets an indexed value - The ngram3 token array.
   * @generated */
  public void setNgram3Tokens(int i, NGram v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_ngram3Tokens == null)
      jcasType.jcas.throwFeatMissing("ngram3Tokens", "edu.cmu.deiis.types.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngram3Tokens), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngram3Tokens), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: nameEntityMentions

  /** getter for nameEntityMentions - gets The array of name entity mention of the answer.
   * @generated */
  public FSArray getNameEntityMentions() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_nameEntityMentions == null)
      jcasType.jcas.throwFeatMissing("nameEntityMentions", "edu.cmu.deiis.types.Answer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_nameEntityMentions)));}
    
  /** setter for nameEntityMentions - sets The array of name entity mention of the answer. 
   * @generated */
  public void setNameEntityMentions(FSArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_nameEntityMentions == null)
      jcasType.jcas.throwFeatMissing("nameEntityMentions", "edu.cmu.deiis.types.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_nameEntityMentions, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for nameEntityMentions - gets an indexed value - The array of name entity mention of the answer.
   * @generated */
  public NamedEntityMention getNameEntityMentions(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_nameEntityMentions == null)
      jcasType.jcas.throwFeatMissing("nameEntityMentions", "edu.cmu.deiis.types.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_nameEntityMentions), i);
    return (NamedEntityMention)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_nameEntityMentions), i)));}

  /** indexed setter for nameEntityMentions - sets an indexed value - The array of name entity mention of the answer.
   * @generated */
  public void setNameEntityMentions(int i, NamedEntityMention v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_nameEntityMentions == null)
      jcasType.jcas.throwFeatMissing("nameEntityMentions", "edu.cmu.deiis.types.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_nameEntityMentions), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_nameEntityMentions), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    