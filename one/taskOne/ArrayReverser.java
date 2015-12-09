package org.homework.one.taskOne;

/**
 * A class for reversing an array.
 * 
 * @author GeCa
 */
public class ArrayReverser {
	/**
	 * @param array
	 *            input array with some numbers in it.
	 */
	public static void reverse(int[] array) {

		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];

			array[i] = array[array.length - (1 + i)];
			array[array.length - (1 + i)] = temp;
		}
	}
}
