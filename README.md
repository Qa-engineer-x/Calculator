# Java Calculator

## Overview

This is a simple command-line calculator written in Java. The program allows users to perform basic arithmetic operations by entering two numbers and selecting an operation from a menu.

## Features

* Addition
* Subtraction
* Multiplication
* Division
* Division-by-zero error handling
* User-friendly command-line interface

## Technologies Used

* Java
* `Scanner` class for user input

## Project Structure

```
day3/
└── calculator.java
```

## How It Works

1. The program prompts the user to enter the first number.
2. The user enters the second number.
3. A menu of operations is displayed:

   * 1 – Addition
   * 2 – Subtraction
   * 3 – Multiplication
   * 4 – Division
4. The user selects an operation.
5. The program calculates and displays the result.
6. If division by zero is attempted, an error message is displayed.

## Example

```
Enter the first number
10

Enter the second number
5

Choose an operation
1. Addition
2. Subtraction
3. Multiplication
4. Division

3

Result: 50.0
```

## How to Run

1. Compile the program:

```bash
javac day3/calculator.java
```

2. Run the program:

```bash
java day3.calculator
```

## Error Handling

* Prevents division by zero.
* Displays **"Invalid Choice"** if the selected operation is not between 1 and 4.

## Possible Improvements

* Use a `switch` statement instead of multiple `if-else` conditions.
* Allow users to perform multiple calculations without restarting the program.
* Add support for additional operations such as modulus, exponentiation, and square root.
* Validate user input to prevent invalid entries.
* Follow Java naming conventions by renaming the class to `Calculator`.

## Author

Created as a beginner Java project to practice:

* User input with `Scanner`
* Conditional statements (`if-else`)
* Basic arithmetic operations
* Exception handling concepts (division by zero)

