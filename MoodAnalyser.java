package com.bridgelabz.day21.UC_Day21_Exceptions;

public class MoodAnalyser extends Throwable {

    String message;

    public MoodAnalyser(String message) {
        this.message=message;
    }

    public MoodAnalyser() {

    }
    String MoodAnalyser(){
        return "SAD";
    }

    public String analyseMood(String message) throws MoodAnalyser, MoodAnalyserException {
        try {
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException e) {
            throw new MoodAnalyserException("please enter proper message");
        }
    }
}
