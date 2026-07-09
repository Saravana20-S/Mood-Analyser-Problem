package com.oops.moodanalyzer;

/**
 * Custom exception class for Mood Analyzer.
 */
public class MoodAnalyserException extends Exception {

    /**
     * Enum representing different types of mood analysis errors.
     */
    public enum ExceptionType {
        ENTERED_NULL,
        ENTERED_EMPTY
    }

    private final ExceptionType type;

    /**
     * Creates a MoodAnalyserException.
     *
     * @param type    Type of exception.
     * @param message Exception message.
     */
    public MoodAnalyserException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

    /**
     * Returns the exception type.
     *
     * @return exception type.
     */
    public ExceptionType getType() {
        return type;
    }
}