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
    public void givenSadMoodMessage_ShouldReturnSad() throws MoodAnalyserException {

        // Arrange
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");

        // Act
        String actualMood = moodAnalyser.analyseMood();

        // Assert
        Assertions.assertEquals("Sad", actualMood);
    }

    /**
     * TC 1.2
     * Given "I am in Any Mood"
     * Should return "Happy".
     */
    @Test
    public void givenAnyMoodMessage_ShouldReturnHappy() throws MoodAnalyserException {

        // Arrange
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");

        // Act
        String actualMood = moodAnalyser.analyseMood();

        // Assert
        Assertions.assertEquals("Happy", actualMood);
    }

    /**
     * TC 1.3
     * Given "I am in Sad Mood" message in the constructor,
     * analyseMood() should return "Sad".
     */
    @Test
    public void givenSadMoodMessage_WhenPassedInConstructor_ShouldReturnSad() throws MoodAnalyserException {

        // Arrange
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");

        // Act
        String actualMood = moodAnalyser.analyseMood();

        // Assert
        Assertions.assertEquals("Sad", actualMood);
    }

    /**
     * TC 1.4
     * Given "I am in Happy Mood" message in the constructor,
     * analyseMood() should return "Happy".
     */
    @Test
    public void givenHappyMoodMessage_WhenPassedInConstructor_ShouldReturnHappy() throws MoodAnalyserException {

        // Arrange
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");

        // Act
        String actualMood = moodAnalyser.analyseMood();

        // Assert
        Assertions.assertEquals("Happy", actualMood);
    }
    
    /**
     * TC2.1
     * Given a null mood message,
     * should return "Happy".
     */
    @Test
    public void givenNullMoodMessage_ShouldReturnHappy() throws MoodAnalyserException {

        // Arrange
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);

        // Act
        String actualMood = moodAnalyser.analyseMood();

        // Assert
        Assertions.assertEquals("Happy", actualMood);
    }



    /**
     * TC3.1
     * Given a null mood,
     * should throw MoodAnalyserException.
     */
    @Test
    public void givenNullMood_ShouldThrowMoodAnalyserException() {

        MoodAnalyser moodAnalyser = new MoodAnalyser(null);

        MoodAnalyserException exception = Assertions.assertThrows(
                MoodAnalyserException.class,
                moodAnalyser::analyseMood);

        Assertions.assertEquals(
                MoodAnalyserException.ExceptionType.ENTERED_NULL,
                exception.getType());
    }

    /**
     * TC3.2
     * Given an empty mood,
     * should throw MoodAnalyserException.
     */
    @Test
    public void givenEmptyMood_ShouldThrowMoodAnalyserException() {

        MoodAnalyser moodAnalyser = new MoodAnalyser("");

        MoodAnalyserException exception = Assertions.assertThrows(
                MoodAnalyserException.class,
                moodAnalyser::analyseMood);

        Assertions.assertEquals(
                MoodAnalyserException.ExceptionType.ENTERED_EMPTY,
                exception.getType());
    }
}