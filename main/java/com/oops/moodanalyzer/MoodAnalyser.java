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
     * Parameterized constructor to initialize the mood message.
     *
     * @param message the mood message
     */
    public MoodAnalyser(String message) {
        this.message = message;
    }

    /**
     * Analyzes the stored message and returns the detected mood.
     *
     * @return "Sad" if the message contains "Sad", otherwise "Happy"
     */
    public String analyseMood() {

        // Check whether the message contains the word "Sad"
        if (message.contains("Sad")) {
            return "Sad";
        }

        // Return Happy for all other messages
        return "Happy";
    }
}