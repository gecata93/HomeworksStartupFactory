package org.homework.one.taskTwo;

/**
 * A class that generate a password which contains small letter, capital letter and a number.
 * 
 * @author GeCa
 */
public class PasswordGenerator {

	/**
	 * @param length
	 *            the lenght of the password.
	 * @return returns the generated password.
	 */
	public static String generate(int length) {

		String passLetters = "";
		String possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		for (int i = 0; i < length; i++) {
			passLetters += possible.charAt((int) (Math.random() * possible.length()));
		}
		return passLetters;
	}
}
