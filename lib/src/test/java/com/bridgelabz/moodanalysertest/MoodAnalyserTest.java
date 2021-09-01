package com.bridgelabz.moodanalysertest;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import com.bridgelabz.moodanalyser.MoodAnalyser;

public class MoodAnalyserTest {
	
	@Test
	public void givenMood_WhenHappy_ShouldReturnHappy() {
		MoodAnalyser moodanalyser = new MoodAnalyser();
		String mood = moodanalyser.analyseMood("I am in happy mood");
		Assert.assertEquals("happy",mood);
	}
	
	@Test
	public void givenMood_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodanalyser = new MoodAnalyser();
		String mood = moodanalyser.analyseMood("I am in Sad mood");
		Assert.assertEquals("sad",mood);
	}
	
	@Test
	public void givenMood_WhenAnyMood_ShouldReturnSad() {
		MoodAnalyser moodanalyser = new MoodAnalyser();
		String mood = moodanalyser.analyseMood("I am in any mood");
		Assert.assertEquals("happy",mood);
	}
}
