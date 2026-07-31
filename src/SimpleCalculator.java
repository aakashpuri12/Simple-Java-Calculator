import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {
	// Method to perform addition operation
	public double add(double a, double b) {
		return a + b;
	}

	// Method to perform subtraction operation
	public double sub(double a, double b) {
		return a - b;
	}

	// Method to perform multiplication operation
	public double mul(double a, double b) {
		return a * b;
	}

	// Method to perform division operation
	public double div(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException("Division by zero is not allowed!...");
		}
		return a / b;
	}

	// Method to perform modulus operation
	public double mod(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException("Modulus by zero is not allowed!.. ");
		}
		return a % b;
	}

	// Method to perform power operation
	public double pow(double a, double b) {
		return Math.pow(a, b);
	}

}

public class SimpleCalculator {
	public static double num1, num2;

	public static void getInput(Scanner scanner) {
		// Take first number as input
		System.out.println("Enter first number: ");
		num1 = scanner.nextDouble();

		// Take second number as input
		System.out.println("Enter second number: ");
		num2 = scanner.nextDouble();
	}

	public static void main(String[] args) {

		// Create a scanner object to take user input
		Scanner scanner = new Scanner(System.in);

		// Create a object of Calculator class
		Calculator calculator = new Calculator();

		// Variable to control the calculator loop
		boolean running = true;

		System.out.println("=====================================");
		System.out.println("=        SIMPLE CALCULATOR          =");
		System.out.println("=====================================");

		// Calculator will keep running until users select exit
		while (running) {

			try {
				// Display operation menu
				System.out.println("\n Choose an operation: ");
				System.out.println("1. Addition (+)");
				System.out.println("2. Subtraction (-)");
				System.out.println("3. Multiplication (*)");
				System.out.println("4. Division (/)");
				System.out.println("5. Modulus (%)");
				System.out.println("6. Power ");
				System.out.println("7. Exit");

				// Take user's menu choice
				System.out.println("\nEnter your choice (1-7): ");
				int choice = scanner.nextInt();

				double result;

				// Perform operation based on user's choice
				switch (choice) {

				case 1:
					getInput(scanner);
					result = calculator.add(num1, num2);
					System.out.println("Result: " + result);
					break;

				case 2:
					getInput(scanner);
					result = calculator.sub(num1, num2);
					System.out.println("Result: " + result);
					break;

				case 3:
					getInput(scanner);
					result = calculator.mul(num1, num2);
					System.out.println("Result: " + result);
					break;

				case 4:
					// Check division by 0
					getInput(scanner);
					result = calculator.div(num1, num2);
					System.out.println("Result: " + result);
					break;

				case 5:
					getInput(scanner);
					result = calculator.mod(num1, num2);
					System.out.println("Result: " + result);
					break;

				case 6:
					getInput(scanner);
					result = calculator.pow(num1, num2);
					System.out.println("Result: " + result);
					break;

				case 7:
					running = false;
					System.out.println("\nThank You ! for using Calculator..");
					break;

				default:
					System.out.println("Invalid choice!, Please select between 1 and 7.");
				}

			}
				catch (ArithmeticException e) {

				// Handles division or modulus by zero
				System.out.println("Error: " + e.getMessage());

			} catch (InputMismatchException e) {
				
				// Handles invalid input such as letters instead of numbers
				System.out.println("Error! Please enter a valid numeric values.");

				// Remove invalid value from scanner
				scanner.nextLine();
			}
			
			catch (Exception e) {
				// Handles any others unexpected error
				System.out.println("Unexpected Error: Please enter valid numeric values."+ e.getMessage());
			}
		}
		scanner.close();
	}
}
