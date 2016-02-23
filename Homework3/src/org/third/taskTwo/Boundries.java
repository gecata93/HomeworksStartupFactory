package org.third.taskTwo;

import java.util.Scanner;

/**
 * @author GeCa A class for the exception handling.
 */
public final class Boundries {
	/**
	 * Private constructor. not called.
	 */
	private Boundries() {

	}

	/**
	 * A method that checks if the number fit into the boundries.
	 * 
	 * @throws BoundriesException
	 *             implemented exception.
	 */
	public static void boundryFit() throws BoundriesException {

		Scanner input = new Scanner(System.in);

		int firstBoundry;
		int secondBoundry;
		int number;

		try {
			System.out.print("Enter first boundry: ");
			firstBoundry = input.nextInt();

			System.out.print("Enter second boundry: ");
			secondBoundry = input.nextInt();

			System.out.println("number? ");
			number = input.nextInt();

			if ((number >= firstBoundry) && (number <= secondBoundry)) {
				System.out.println("The number fits: " + number);
			} else {

				if (number < firstBoundry) {
					throw new BoundriesException("The number is below the small boundry!");
				} else {
					throw new BoundriesException("The number is above the big boundry!");
				}
			}

		} finally {
			input.close();
		}

	}

}
