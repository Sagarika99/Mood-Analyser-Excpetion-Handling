package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	private String message;
	
	public MoodAnalyser() {
		
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		try {
			if(message.length()<=0) {
				throw new MoodAnalysisException("mood cannot be empty");
			}
			if(message.contains("happy")) {
				return "happy";
			}
			else if (message.contains("sad")){
				return "sad";
			}
			return "happy";
		}
		catch(NullPointerException e) {
			throw new MoodAnalysisException("mood cannot be null");
		}

	}
}
