package com.bridgelabz.MoodAnalyserTest;

public class MoodAnalyser {
	private String message;
	
	public MoodAnalyser() {
	}
	
	public MoodAnalyser(String message) {
		this.message = message;
	}
 
	public void checkEmpty() throws MoodAnalysisException {
		if(message.length()==0)
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY ,"Enter Proper Mood");
	}
	
	public void checkNull() throws MoodAnalysisException {
		if(message==null)
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL ,"Enter Proper Mood");
	}
	
	
	public String analyseMood() throws MoodAnalysisException {
			checkNull();
			checkEmpty();
			if(message.contains("Sad"))
				return "SAD";
			return "HAPPY";			
	}

	public void printWelcome() {
        System.out.println( "Welcome to Mood Analyser Problem" );
    }

}
    
    
