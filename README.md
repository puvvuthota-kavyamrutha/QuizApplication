## QuizApplication
The Java Quiz Application is a simple Swing-based desktop app that tests users' Java knowledge through 10 multiple-choice questions. It features a clean GUI, navigation with Next and Result buttons, and displays the final score. Ideal for beginners to practice OOP, exceptions, and Java fundamentals interactively.

## Java Quiz Application

This is a simple **Java Quiz Application** built using **Java Swing** for GUI. It allows users to take a 10-question multiple-choice quiz and shows the total score at the end.

## Features

- GUI-based quiz with 10 Java-related multiple-choice questions
- Radio buttons to select one option per question
- "Next" button to navigate through the quiz
- "Result" button to display the total number of correct answers
- Automatic termination of the application after showing results

## Technologies Used

- Java SE
- Java Swing for GUI (JFrame, JButton, JLabel, JRadioButton)
- Basic object-oriented programming

## How to Run

1. Clone or download the repository.
2. Open the project in any Java IDE (e.g., IntelliJ, Eclipse, NetBeans).
3. Compile and run the `QuizTest.java` file.
4. The GUI window will appear and you can start the quiz.

## Correct Answer Checking

The application tracks user answers and validates them using a method `check()` which compares the selected option against the correct one for each question.

## End of Quiz

Once all questions are answered:
- The **Next** button is disabled
- The **Result** button appears
- A popup shows the number of correct answers
- The application exits after displaying the result

Feel free to modify or expand this application as needed!
