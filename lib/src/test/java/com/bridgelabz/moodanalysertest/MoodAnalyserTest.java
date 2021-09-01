package com.bridgelabz.moodanalysertest;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import com.bridgelabz.moodanalyser.MoodAnalyser;
import com.bridgelabz.moodanalyser.MoodAnalysisException;

public class MoodAnalyserTest {
	
	@Test
	public void givenMood_WhenHappy_ShouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in happy mood");
		String mood = moodanalyser.analyseMood();
		Assert.assertEquals("happy",mood);
	}
	
	@Test
	public void givenMood_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in sad mood");
		String mood = moodanalyser.analyseMood();
		Assert.assertEquals("sad",mood);
	}
	
	@Test
	public void givenMood_WhenAnyMood_ShouldReturnSad() throws MoodAnalysisException {
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in any mood");
		String mood = moodanalyser.analyseMood();
		Assert.assertEquals("happy",mood);
	}
	
	@Test
	public void givenMood_WhenNull_ShouldReturnHappy() {
		MoodAnalyser moodanalyser = new MoodAnalyser(null);
		try {
			String mood = moodanalyser.analyseMood();
		}
		catch (MoodAnalysisException e){
			Assert.assertEquals("mood cannot be null",e.getMessage());
		}		
	}
	
	@Test
	public void givenMood_WhenEmpty_ShouldReturnHappy() {
		MoodAnalyser moodanalyser = new MoodAnalyser("");
		try {
			String mood = moodanalyser.analyseMood();
		}
		catch (MoodAnalysisException e){
			Assert.assertEquals("mood cannot be empty",e.getMessage());
		}		
	}
	
}
