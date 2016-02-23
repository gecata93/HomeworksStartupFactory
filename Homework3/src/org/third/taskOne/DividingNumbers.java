package org.third.taskOne;

import java.util.Scanner;

/**
 * @author GeCa
 */
public final class DividingNumbers {

	/**
	 * Private constructor. not called.
	 */
	private DividingNumbers() {

	}

	/**
	 * A method that divides two numbers from the console.
	 */
	public static void numbers() {

		Scanner input = new Scanner(System.in);

		float firstNumber;
		float secondNumber;
		float result = 0;

		try {

			System.out.print("Enter first number: ");
			firstNumber = input.nextFloat();

			System.out.print("Enter second number: ");
			secondNumber = input.nextFloat();

			if (secondNumber == 0) {
				System.out.println("Division by zero is not allowed! ");

			} else {
				result = firstNumber / secondNumber;
				System.out.println(result);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			input.close();
			System.out.println("Goodbye!");
		}

	}

}
