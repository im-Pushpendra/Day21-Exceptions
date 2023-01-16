package com.bridgelabz.day21.UC_Day21_Exceptions;

public class MoodAnalyser {
	public String analyseMood(String message) {
		if (message.contains("SAD"))
			return "SAD";
		else
			return "HAPPY";
	}
}
