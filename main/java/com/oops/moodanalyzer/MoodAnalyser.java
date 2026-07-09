package com.oops.moodanalyzer;

/**
 * This class analyzes the mood from a given message.
 */
public class MoodAnalyser {

    /**
     * Stores the mood message.
     */
    private String message;

    /**
     * Default constructor.
     */
    public MoodAnalyser() {
    }

    /**
     * Parameterized constructor.
     *
     * @param message Mood message.
     */
    public MoodAnalyser(String message) {
        this.message = message;
    }

    /**
     * Analyzes the mood.
     *
     * @return "Sad" or "Happy"
     * @throws MoodAnalyserException if message is null or empty.
     */
    public String analyseMood() throws MoodAnalyserException {

        // Check for null message
        if (message == null) throw new MoodAnalyserException(
                MoodAnalyserException.ExceptionType.ENTERED_NULL,
                "Mood should not be null");

        // Check for empty message
        if (message.trim().isEmpty()) {
            throw new MoodAnalyserException(
                    MoodAnalyserException.ExceptionType.ENTERED_EMPTY,
                    "Mood should not be empty");
        }

        // Check for Sad mood
        if (message.contains("Sad")) {
            return "Sad";
        }

        // Default mood
        return "Happy";
    }
}