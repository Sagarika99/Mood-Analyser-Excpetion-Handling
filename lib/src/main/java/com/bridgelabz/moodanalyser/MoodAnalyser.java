package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	private String message;
	
	public MoodAnalyser() {
		
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if(message.contains("Happy")) {
			return "happy";
		}
		else if (message.contains("Sad")){
			return "sad";
		}
		return "happy";
	}
}
