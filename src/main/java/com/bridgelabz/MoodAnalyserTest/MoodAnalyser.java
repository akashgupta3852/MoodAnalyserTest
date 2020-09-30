package com.bridgelabz.MoodAnalyserTest;

public class MoodAnalyser {
	public String analyseMood(String message) {			
		if(message.contains("Sad"))
			return "SAD";
		return "HAPPY";
	}

	public void printWelcome() {
        System.out.println( "Welcome to Mood Analyser Problem" );
    }

}
    
    
