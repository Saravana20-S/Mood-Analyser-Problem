package com.oops.moodanalyzer;

/**
 * Custom exception class for Mood Analyzer.
 */
public class MoodAnalysisException extends Exception {

    /**
     * Represents different types of mood analysis errors.
     */
    public enum ExceptionType {
        ENTERED_NULL,
        ENTERED_EMPTY
    }

    private final ExceptionType type;

    /**
     * Creates a MoodAnalysisException.
     *
     * @param type    Type of exception.
     * @param message Exception message.
     */
    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

    /**
     * Returns the exception type.
     *
     * @return exception type
     */
    public ExceptionType getType() {
        return type;
    }
}