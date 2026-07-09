package com.oops.moodanalyzer;

/**
 * Analyzes the mood from a given message.
 */
public class MoodAnalyser {

    private String message;

    /**
     * Default constructor.
     */
    public MoodAnalyser() {
    }

    /**
     * Parameterized constructor.
     *
     * @param message mood message
     */
    public MoodAnalyser(String message) {
        this.message = message;
    }

    /**
     * Returns the detected mood.
     *
     * @return "Sad" if the message contains "Sad", otherwise "Happy"
     */
    public String analyseMood() {

        if (message.contains("Sad")) {
            return "Sad";
        }

        return "Happy";
    }
}