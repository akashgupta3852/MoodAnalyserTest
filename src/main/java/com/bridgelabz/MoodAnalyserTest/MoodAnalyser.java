package com.bridgelabz.MoodAnalyserTest;

public class MoodAnalyser {
	private String message;
	
	public MoodAnalyser() {
	}
	
	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
			if(message.contains("Sad"))
				return "SAD";
		}catch(NullPointerException e){
		}
		return "HAPPY";
			
	}

	public void printWelcome() {
        System.out.println( "Welcome to Mood Analyser Problem" );
    }

}
    
    
