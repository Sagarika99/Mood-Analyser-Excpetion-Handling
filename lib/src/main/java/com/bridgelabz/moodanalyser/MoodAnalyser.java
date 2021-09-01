package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

	public String analyseMood(String message) {
		if(message.contains("Happy")) {
			return "happy";
		}
		else if (message.contains("Sad")){
			return "sad";
		}
		return "happy";
	}
}
