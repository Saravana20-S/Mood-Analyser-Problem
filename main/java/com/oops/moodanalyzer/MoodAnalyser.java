package com.oops.moodanalyzer;

/**
 * This class analyzes the mood from a given message.
 */
public class MoodAnalyser {

    /**
     * Analyzes the given message and returns the detected mood.
     *
     * @param message the input message
     * @return "Sad" if the message contains "Sad", otherwise "Happy"
     */
    public String analyseMood(String message) {

        // Check whether the message contains the word "Sad"
        if (message.contains("Sad")) {
            return "Sad";
        }

        // Return Happy for all other messages
        return "Happy";
    }
}