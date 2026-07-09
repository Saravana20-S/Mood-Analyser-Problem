package com.oops.moodanalyzer;

/**
 * This class analyses the mood of a given message.
 */
public class MoodAnalyser {

    /**
     * Analyses the given message and returns the detected mood.
     *
     * @param message Input message to analyse.
     * @return "Sad" if the message contains "Sad", otherwise "Happy".
     */
    public String analyseMood(String message) {

        // Check whether the message contains the word "Sad"
        if (message.contains("Sad")) {
            return "Sad";
        }

        // Default mood
        return "Happy";
    }
}