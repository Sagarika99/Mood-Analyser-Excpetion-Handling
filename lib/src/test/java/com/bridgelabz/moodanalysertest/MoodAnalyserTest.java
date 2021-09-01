package com.bridgelabz.moodanalysertest;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import com.bridgelabz.moodanalyser.MoodAnalyser;

public class MoodAnalyserTest {
	
	@Test
	public void givenMood_WhenHappy_ShouldReturnHappy() {
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in happy mood");
		String mood = moodanalyser.analyseMood();
		Assert.assertEquals("happy",mood);
	}
	
	@Test
	public void givenMood_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in Sad mood");
		String mood = moodanalyser.analyseMood();
		Assert.assertEquals("sad",mood);
	}
	
	@Test
	public void givenMood_WhenAnyMood_ShouldReturnSad() {
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in any mood");
		String mood = moodanalyser.analyseMood();
		Assert.assertEquals("happy",mood);
	}
	
	@Test
	public void givenMood_WhenNull_ShouldReturnHappy() {
		MoodAnalyser moodanalyser = new MoodAnalyser(null);
		String mood = moodanalyser.analyseMood();
		Assert.assertEquals("happy",mood);
	}
	
}
