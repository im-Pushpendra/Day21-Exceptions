package com.bridgelabz.day21.UC_Day21_Exceptions;

public class MoodAnalyserException extends Exception {
	public enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY;
	}

	ExceptionType type;

	public MoodAnalyserException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
