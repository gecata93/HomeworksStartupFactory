package org.homework.one.taskFour;

/**
 * A class that can sum two string numbers.
 * 
 * @author GeCa
 */
public class MaxNum {

	/**
	 * @return result of the summing two numbers.
	 */
	public static String calculate(String firstNumber, String secondNumber) {

		int carry = 0;
		String result = "";

		// Makes the numbers equal
		if (firstNumber.length() <= secondNumber.length()) {
			for (int i = firstNumber.length(); i < secondNumber.length(); i++) {
				firstNumber += "0";
			}
		} else {
			for (int i = secondNumber.length(); i < firstNumber.length(); i++) {
				secondNumber += "0";
			}
		}

		// Summing the numbers and calculating the carry.
		for (int i = firstNumber.length() - 1; i >= 0; i--) {
			int temp = Character.getNumericValue(firstNumber.charAt(i))
					+ Character.getNumericValue(secondNumber.charAt(i)) + carry;
			result = (temp % 10) + result;
			carry = temp / 10;
		}
		return result;
	}

}
