package com.oops.moodanalyzer;

/**
 * Driver class for Mood Analyzer.
 */
public class MoodAnalyserMain {

    public static void main(String[] args) {

        try {

            MoodAnalyser moodAnalyser =
                    new MoodAnalyser("I am in Happy Mood");

            System.out.println(moodAnalyser.analyseMood());

        } catch (MoodAnalysisException exception) {

            System.out.println(exception.getMessage());
        }
    }
}