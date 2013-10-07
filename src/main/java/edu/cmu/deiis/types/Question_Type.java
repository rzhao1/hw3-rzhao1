
/* First created by JCasGen Wed Sep 11 13:44:28 EDT 2013 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Mon Sep 30 22:50:14 EDT 2013
 * @generated */
public class Question_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Question_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Question_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Question(addr, Question_Type.this);
  			   Question_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Question(addr, Question_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Question.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.Question");



  /** @generated */
  final Feature casFeat_tokens;
  /** @generated */
  final int     casFeatCode_tokens;
  /** @generated */ 
  public int getTokens(int addr) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokens);
  }
  /** @generated */    
  public void setTokens(int addr, int v) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokens, v);}
    
   /** @generated */
  public int getTokens(int addr, int i) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.Question");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i);
  }
   
  /** @generated */ 
  public void setTokens(int addr, int i, int v) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.Question");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_gsAnswerNum;
  /** @generated */
  final int     casFeatCode_gsAnswerNum;
  /** @generated */ 
  public int getGsAnswerNum(int addr) {
        if (featOkTst && casFeat_gsAnswerNum == null)
      jcas.throwFeatMissing("gsAnswerNum", "edu.cmu.deiis.types.Question");
    return ll_cas.ll_getIntValue(addr, casFeatCode_gsAnswerNum);
  }
  /** @generated */    
  public void setGsAnswerNum(int addr, int v) {
        if (featOkTst && casFeat_gsAnswerNum == null)
      jcas.throwFeatMissing("gsAnswerNum", "edu.cmu.deiis.types.Question");
    ll_cas.ll_setIntValue(addr, casFeatCode_gsAnswerNum, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answerScores;
  /** @generated */
  final int     casFeatCode_answerScores;
  /** @generated */ 
  public int getAnswerScores(int addr) {
        if (featOkTst && casFeat_answerScores == null)
      jcas.throwFeatMissing("answerScores", "edu.cmu.deiis.types.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answerScores);
  }
  /** @generated */    
  public void setAnswerScores(int addr, int v) {
        if (featOkTst && casFeat_answerScores == null)
      jcas.throwFeatMissing("answerScores", "edu.cmu.deiis.types.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_answerScores, v);}
    
   /** @generated */
  public int getAnswerScores(int addr, int i) {
        if (featOkTst && casFeat_answerScores == null)
      jcas.throwFeatMissing("answerScores", "edu.cmu.deiis.types.Question");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerScores), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerScores), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerScores), i);
  }
   
  /** @generated */ 
  public void setAnswerScores(int addr, int i, int v) {
        if (featOkTst && casFeat_answerScores == null)
      jcas.throwFeatMissing("answerScores", "edu.cmu.deiis.types.Question");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerScores), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerScores), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerScores), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_numOfAnswerScore;
  /** @generated */
  final int     casFeatCode_numOfAnswerScore;
  /** @generated */ 
  public int getNumOfAnswerScore(int addr) {
        if (featOkTst && casFeat_numOfAnswerScore == null)
      jcas.throwFeatMissing("numOfAnswerScore", "edu.cmu.deiis.types.Question");
    return ll_cas.ll_getIntValue(addr, casFeatCode_numOfAnswerScore);
  }
  /** @generated */    
  public void setNumOfAnswerScore(int addr, int v) {
        if (featOkTst && casFeat_numOfAnswerScore == null)
      jcas.throwFeatMissing("numOfAnswerScore", "edu.cmu.deiis.types.Question");
    ll_cas.ll_setIntValue(addr, casFeatCode_numOfAnswerScore, v);}
    
  
 
  /** @generated */
  final Feature casFeat_precision;
  /** @generated */
  final int     casFeatCode_precision;
  /** @generated */ 
  public double getPrecision(int addr) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "edu.cmu.deiis.types.Question");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_precision);
  }
  /** @generated */    
  public void setPrecision(int addr, double v) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "edu.cmu.deiis.types.Question");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_precision, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ngram2Tokens;
  /** @generated */
  final int     casFeatCode_ngram2Tokens;
  /** @generated */ 
  public int getNgram2Tokens(int addr) {
        if (featOkTst && casFeat_ngram2Tokens == null)
      jcas.throwFeatMissing("ngram2Tokens", "edu.cmu.deiis.types.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ngram2Tokens);
  }
  /** @generated */    
  public void setNgram2Tokens(int addr, int v) {
        if (featOkTst && casFeat_ngram2Tokens == null)
      jcas.throwFeatMissing("ngram2Tokens", "edu.cmu.deiis.types.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_ngram2Tokens, v);}
    
   /** @generated */
  public int getNgram2Tokens(int addr, int i) {
        if (featOkTst && casFeat_ngram2Tokens == null)
      jcas.throwFeatMissing("ngram2Tokens", "edu.cmu.deiis.types.Question");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngram2Tokens), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ngram2Tokens), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngram2Tokens), i);
  }
   
  /** @generated */ 
  public void setNgram2Tokens(int addr, int i, int v) {
        if (featOkTst && casFeat_ngram2Tokens == null)
      jcas.throwFeatMissing("ngram2Tokens", "edu.cmu.deiis.types.Question");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngram2Tokens), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ngram2Tokens), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngram2Tokens), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_ngram3Tokens;
  /** @generated */
  final int     casFeatCode_ngram3Tokens;
  /** @generated */ 
  public int getNgram3Tokens(int addr) {
        if (featOkTst && casFeat_ngram3Tokens == null)
      jcas.throwFeatMissing("ngram3Tokens", "edu.cmu.deiis.types.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ngram3Tokens);
  }
  /** @generated */    
  public void setNgram3Tokens(int addr, int v) {
        if (featOkTst && casFeat_ngram3Tokens == null)
      jcas.throwFeatMissing("ngram3Tokens", "edu.cmu.deiis.types.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_ngram3Tokens, v);}
    
   /** @generated */
  public int getNgram3Tokens(int addr, int i) {
        if (featOkTst && casFeat_ngram3Tokens == null)
      jcas.throwFeatMissing("ngram3Tokens", "edu.cmu.deiis.types.Question");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngram3Tokens), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ngram3Tokens), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngram3Tokens), i);
  }
   
  /** @generated */ 
  public void setNgram3Tokens(int addr, int i, int v) {
        if (featOkTst && casFeat_ngram3Tokens == null)
      jcas.throwFeatMissing("ngram3Tokens", "edu.cmu.deiis.types.Question");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngram3Tokens), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ngram3Tokens), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngram3Tokens), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_nameEntityMentions;
  /** @generated */
  final int     casFeatCode_nameEntityMentions;
  /** @generated */ 
  public int getNameEntityMentions(int addr) {
        if (featOkTst && casFeat_nameEntityMentions == null)
      jcas.throwFeatMissing("nameEntityMentions", "edu.cmu.deiis.types.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_nameEntityMentions);
  }
  /** @generated */    
  public void setNameEntityMentions(int addr, int v) {
        if (featOkTst && casFeat_nameEntityMentions == null)
      jcas.throwFeatMissing("nameEntityMentions", "edu.cmu.deiis.types.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_nameEntityMentions, v);}
    
   /** @generated */
  public int getNameEntityMentions(int addr, int i) {
        if (featOkTst && casFeat_nameEntityMentions == null)
      jcas.throwFeatMissing("nameEntityMentions", "edu.cmu.deiis.types.Question");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nameEntityMentions), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_nameEntityMentions), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nameEntityMentions), i);
  }
   
  /** @generated */ 
  public void setNameEntityMentions(int addr, int i, int v) {
        if (featOkTst && casFeat_nameEntityMentions == null)
      jcas.throwFeatMissing("nameEntityMentions", "edu.cmu.deiis.types.Question");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nameEntityMentions), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_nameEntityMentions), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nameEntityMentions), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Question_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokens = jcas.getRequiredFeatureDE(casType, "tokens", "uima.cas.FSArray", featOkTst);
    casFeatCode_tokens  = (null == casFeat_tokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokens).getCode();

 
    casFeat_gsAnswerNum = jcas.getRequiredFeatureDE(casType, "gsAnswerNum", "uima.cas.Integer", featOkTst);
    casFeatCode_gsAnswerNum  = (null == casFeat_gsAnswerNum) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gsAnswerNum).getCode();

 
    casFeat_answerScores = jcas.getRequiredFeatureDE(casType, "answerScores", "uima.cas.FSArray", featOkTst);
    casFeatCode_answerScores  = (null == casFeat_answerScores) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerScores).getCode();

 
    casFeat_numOfAnswerScore = jcas.getRequiredFeatureDE(casType, "numOfAnswerScore", "uima.cas.Integer", featOkTst);
    casFeatCode_numOfAnswerScore  = (null == casFeat_numOfAnswerScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_numOfAnswerScore).getCode();

 
    casFeat_precision = jcas.getRequiredFeatureDE(casType, "precision", "uima.cas.Double", featOkTst);
    casFeatCode_precision  = (null == casFeat_precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precision).getCode();

 
    casFeat_ngram2Tokens = jcas.getRequiredFeatureDE(casType, "ngram2Tokens", "uima.cas.FSArray", featOkTst);
    casFeatCode_ngram2Tokens  = (null == casFeat_ngram2Tokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ngram2Tokens).getCode();

 
    casFeat_ngram3Tokens = jcas.getRequiredFeatureDE(casType, "ngram3Tokens", "uima.cas.FSArray", featOkTst);
    casFeatCode_ngram3Tokens  = (null == casFeat_ngram3Tokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ngram3Tokens).getCode();

 
    casFeat_nameEntityMentions = jcas.getRequiredFeatureDE(casType, "nameEntityMentions", "uima.cas.FSArray", featOkTst);
    casFeatCode_nameEntityMentions  = (null == casFeat_nameEntityMentions) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nameEntityMentions).getCode();

  }
}



    