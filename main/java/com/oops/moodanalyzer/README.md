# Mood Analyzer Problem

A Java-based Mood Analyzer application developed using Object-Oriented Programming principles. The project demonstrates mood analysis using JUnit 5 test cases, exception handling, custom exceptions, and constructor-based object initialization.

## Project Structure

```text
MoodAnalyzer
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── oops
│   │               └── moodanalyzer
│   │                   ├── MoodAnalyser.java
│   │                   ├── MoodAnalysisException.java
│   │                   └── MoodAnalyserMain.java
│   │
│   └── test
│       └── java
│           └── com
│               └── oops
│                   └── moodanalyzer
│                       └── MoodAnalyserTest.java
│
├── pom.xml
└── README.md
```

## Features

* Analyze mood from a given message.
* Return **Sad** when the message contains `"Sad"`.
* Return **Happy** for all other valid mood messages.
* Constructor-based mood initialization.
* JUnit 5 test cases for mood analysis.
* Handle invalid inputs using exception handling.
* Custom `MoodAnalysisException` for invalid mood scenarios.
* Enum-based exception types for differentiating:

    * `ENTERED_NULL`
    * `ENTERED_EMPTY`

## Use Cases Implemented

### UC1 – Mood Analysis

* Analyze mood from a given message.
* Support constructor-based initialization.
* Return:

    * `Sad` for `"I am in Sad Mood"`
    * `Happy` for `"I am in Happy Mood"` and other valid messages.

### UC2 – Exception Handling

* Handle `null` mood messages.
* Prevent application failure using exception handling.

### UC3 – Custom Exception Handling

* Throw `MoodAnalysisException` when:

    * Mood message is `null`
    * Mood message is empty
* Differentiate exception types using an `ExceptionType` enum.

## Test Cases

* TC1.1 – Given `"I am in Sad Mood"` should return `Sad`.
* TC1.2 – Given `"I am in Any Mood"` should return `Happy`.
* TC1.3 – Given `"I am in Sad Mood"` through constructor should return `Sad`.
* TC1.4 – Given `"I am in Happy Mood"` through constructor should return `Happy`.
* TC2.1 – Given `null` mood should handle the scenario appropriately.
* TC3.1 – Given `null` mood should throw `MoodAnalysisException`.
* TC3.2 – Given empty mood should throw `MoodAnalysisException` indicating empty mood.

## Technologies Used

* Java
* Maven
* JUnit 5
* IntelliJ IDEA

## Branch Strategy

```text
main
│
└── dev
    ├── feature/UC1-message
    ├── feature/UC2-exception-handling
    ├── feature/UC3-custom-exception
    └── ...
```

## Author

**Saravanan S**
