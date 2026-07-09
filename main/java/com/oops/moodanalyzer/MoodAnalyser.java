package com.oops.moodanalyzer;

/**
 * Analyses the mood of a given message.
 */
public class MoodAnalyser {

    /**
     * Returns the detected mood from the given message.
     *
     * @param message Input message
     * @return "Sad" if the message contains "Sad", otherwise "Happy"
     */
    public String analyseMood(String message) {

        if (message.contains("Sad")) {
            return "Sad";
        }

        return "Happy";
    }
}