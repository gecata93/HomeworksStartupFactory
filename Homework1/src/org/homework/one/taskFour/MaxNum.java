package org.homework.one.taskFour;

/**
 * A class that can sum two string numbers.
 * 
 * @author GeCa
 */
public final class MaxNum {
	/**
	 * private constructor for utility class. not called.
	 */
	private MaxNum() {

	}

	/**
	 * @return result of the summing two numbers.
	 * @param firstNumber
	 *            input the first number
	 * @param secondNumber
	 *            input the second number.
	 */
	public static String calculate(String firstNumber, String secondNumber) {

		int carry = 0;
		String result = "";

		String localFirst = firstNumber;
		String localTwo = secondNumber;
		// Makes the numbers equal
		if (localFirst.length() <= localTwo.length()) {
			for (int i = localFirst.length(); i < localTwo.length(); i++) {
				localFirst += "0";
			}
		} else {
			for (int i = localTwo.length(); i < localFirst.length(); i++) {
				localTwo += "0";
			}
		}

		// Summing the numbers and calculating the carry.
		for (int i = localFirst.length() - 1; i >= 0; i--) {
			int temp = Character.getNumericValue(localFirst.charAt(i))
					+ Character.getNumericValue(localTwo.charAt(i)) + carry;
			result = (temp % 10) + result;
			carry = temp / 10;
		}
		return result;
	}

}
