package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	private String message;
	
	public MoodAnalyser() {
		
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
			if(message.contains("Happy")) {
				return "happy";
			}
			else if (message.contains("Sad")){
				return "sad";
			}
			return "happy";
		}
		catch(NullPointerException e) {
			return "happy";
		}

	}
}
