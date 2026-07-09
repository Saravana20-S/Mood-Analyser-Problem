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
     * Analyzes the stored mood message.
     *
     * @return "Sad" if the message contains "Sad", otherwise "Happy"
     * @throws MoodAnalysisException if the message is null or empty
     */
    public String analyseMood() throws MoodAnalysisException {

        try {

            // Check for empty message
            if (message.length() == 0) {
                throw new MoodAnalysisException(
                        MoodAnalysisException.ExceptionType.ENTERED_EMPTY,
                        "Mood should not be empty");
            }

            // Check for Sad mood
            if (message.contains("Sad")) {
                return "Sad";
            }

            // Default mood
            return "Happy";

        } catch (NullPointerException exception) {

            // Throw custom exception for null message
            throw new MoodAnalysisException(
                    MoodAnalysisException.ExceptionType.ENTERED_NULL,
                    "Mood should not be null");
        }
    }
}