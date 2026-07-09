package com.oops.moodanalyzer;

/**
 * Driver class for Mood Analyzer.
 */
public class MoodAnalyserMain {

    public static void main(String[] args) {

        // Create MoodAnalyser object
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        // Sample messages
        String message1 = "I am in Sad Mood";
        String message2 = "I am in Happy Mood";

        // Display analysed moods
        System.out.println("Message : " + message1);
        System.out.println("Mood    : " + moodAnalyser.analyseMood(message1));

        System.out.println();

        System.out.println("Message : " + message2);
        System.out.println("Mood    : " + moodAnalyser.analyseMood(message2));
    }
}