package org.homework.one.taskThree;

/**
 * A class that calculates the max sum of sub array.
 * 
 * @author GeCa
 */
public final class MaxSubarray {

	/**
	 * private constructor. not called.
	 */
	private MaxSubarray() {

	}

	/**
	 * A method that makes the largest sub array.
	 * 
	 * @return maxSum the max sum of sub arrays.
	 */
	public static int subArray() {

		int[] array = { 0, -1, 2, 3, 8, -10 };
		int sum = array[0];
		int maxSum = array[0];

		for (int i = 0; i < array.length; i++) {
			sum = Math.max(sum + array[i], array[i]);
			maxSum = Math.max(maxSum, sum);
		}
		return maxSum;
	}
}
