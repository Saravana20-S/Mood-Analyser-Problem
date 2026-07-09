package com.oops.moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test cases for MoodAnalyser.
 */
public class MoodAnalyserTest {

    /**
     * TC 1.1
     * Given "I am in Sad Mood"
     * Should return "Sad".
     */
    @Test
    public void givenSadMoodMessage_ShouldReturnSad() {

        // Arrange
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        // Act
        String actualMood = moodAnalyser.analyseMood("I am in Sad Mood");

        // Assert
        Assertions.assertEquals("Sad", actualMood);
    }



    /**
     * TC 1.2
     * Given "I am in Any Mood"
     * Should return "Happy".
     */
    @Test
    public void givenAnyMoodMessage_ShouldReturnHappy() {

        // Arrange
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        // Act
        String actualMood = moodAnalyser.analyseMood("I am in Any Mood");

        // Assert
        Assertions.assertEquals("Happy", actualMood);
    }
}