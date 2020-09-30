package com.bridgelabz.MoodAnalyserTest;

public class MoodAnalysisException extends Exception {
	
	private static final long serialVersionUID = 1L;

	enum ExceptionType {
		ENTERED_NULL,ENTERED_EMPTY
	}
	
	ExceptionType exceptionType;
	
	public MoodAnalysisException(ExceptionType exceptionType,String message) {
		super(message);
		this.exceptionType=exceptionType;
	}

}
