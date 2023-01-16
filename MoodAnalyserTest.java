package com.bridgelabz.day21.UC_Day21_Exceptions;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
		@Test
	    public void testMoodAnalyse() {
	        MoodAnalyser md = new MoodAnalyser();
	        String mood = md.analyseMood("This is a SAD message");
	        Assert.assertEquals("SAD", mood);
	    }

	    @Test
	    public void testHappyMood() {
	        MoodAnalyser md = new MoodAnalyser();
	        String mood = md.analyseMood("This is a HAPPY message");
	        Assert.assertEquals("HAPPY", mood);
	    }
}
