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
     * @param message the mood message
     */
    public MoodAnalyser(String message) {
        this.message = message;
    }

    /**
     * Analyzes the stored mood message.
     *
     * @return "Sad" if the message contains "Sad",
     *         otherwise "Happy".
     */
    public String analyseMood() {

        try {

            // Check for Sad mood
            if (message.contains("Sad")) {
                return "Sad";
            }

            // Default mood
            return "Happy";

        } catch (NullPointerException e) {

            // Handle null message by returning Happy
            return "Happy";
        }
    }
}