package com.bridgelabz.MoodAnalyserTest;

import org.junit.Assert;
import org.junit.Test;



public class MoodAnalyserTest {
	
	@Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
    	String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
    }
	
	@Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
    	String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
    }
	
	@Test
	 public void givenMessage_WhenNull_ShouldReturnEnterProperMood() {
		 MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		 try {
	    	String mood = moodAnalyser.analyseMood();
	    }catch (MoodAnalysisException e) {
	    	System.out.println(e.exceptionType);
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.exceptionType);
	    	System.out.println(e.getMessage());
	    }
	 }
	
	 @Test
	 public void givenMessage_WhenEmpty_ShouldReturnEnterProperMood() {
		 MoodAnalyser moodAnalyser = new MoodAnalyser("");
		 try {
	    	String mood = moodAnalyser.analyseMood();
	    }catch (MoodAnalysisException e) {
	    	System.out.println(e.exceptionType);
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
	    	System.out.println(e.getMessage());
	    }
	 }
	 
}
