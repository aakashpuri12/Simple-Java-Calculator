# Simple Java Calculator

A menu-driven console calculator developed using Java.  
The application performs basic arithmetic operations and includes input validation and exception handling for a better user experience.

## Features

- Addition
- Subtraction
- Multiplication
- Division
- Modulus
- Power calculation
- Menu-driven console interface
- Handles division by zero
- Handles modulus by zero
- Handles invalid numeric input
- Allows multiple calculations until the user exits

## Technologies Used

- Java
- Scanner Class
- Math Class
- Exception Handling
- Object-Oriented Programming (OOP)
- Switch Case
- Loops

## Supported Operations

| Option | Operation | Symbol |
|--------|-----------|--------|
| 1 | Addition       | `+` |
| 2 | Subtraction    | `-` |
| 3 | Multiplication | `*` |
| 4 | Division       | `/` |
| 5 | Modulus        | `%` |
| 6 | Power          | `^` |
| 7 | Exit           | - |

## Sample Output

```text
=====================================
=        SIMPLE CALCULATOR          =
=====================================

Choose an operation:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Modulus (%)
6. Power
7. Exit

Enter your choice (1-7): 1

Enter first number: 20
Enter second number: 10

Result: 30.0

```

Project Structure
```
SimpleCalculator/
├── src/
│   └── SimpleCalculator.java
├── .classpath
├── .project
├── .gitignore
└── README.md
```

How to Run
1. Clone the repository
```
git clone https://github.com/aakashpuri12/Simple-Java-Calculator.git
```
2. Open the project directory
   ```
   cd Simple-Java-Calculator
   ```
4. Compile the Java program
   ```
   javac src/SimpleCalculator.java
   ```
6. Run the program
   ```
   java -cp src SimpleCalculator
   ```

Concepts Demonstrated

This project demonstrates fundamental Java programming concepts including:
```
Classes and Objects
Methods
Static Methods and Variables
Scanner for user input
Switch statements
While loops
Exception Handling
ArithmeticException
InputMismatchException
Math API
Future Improvements
Add square root calculation
Add calculation history
Add percentage calculation
Add scientific calculator operations
Improve input validation
Create a GUI version using Java Swing or JavaFX
```

Author

Aakash Puri

GitHub: [aakashpuri12](https://github.com/aakashpuri12/)

```text
C:\Users\asusm\eclipse-workspace\SimpleCalculator>
```
