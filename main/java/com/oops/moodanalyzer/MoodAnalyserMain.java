package com.oops.moodanalyzer;

/**
 * Driver class for Mood Analyzer.
 */
public class MoodAnalyserMain {

    public static void main(String[] args) {

        // Create MoodAnalyser object using parameterized constructor
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");

        // Analyze and display the mood
        System.out.println("Mood : " + moodAnalyser.analyseMood());
    }
}