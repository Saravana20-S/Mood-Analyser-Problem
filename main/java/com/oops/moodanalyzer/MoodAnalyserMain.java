package com.oops.moodanalyzer;

public class MoodAnalyserMain {

    public static void main(String[] args) {

        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String mood = moodAnalyser.analyseMood("I am in Sad Mood");

        System.out.println("Mood : " + mood);
    }
}