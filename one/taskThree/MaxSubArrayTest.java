package org.homework.one.taskThree;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test the methods for max sum in a sub array.
 * 
 * @author GeCa
 */
public class MaxSubArrayTest {
	/**
	 * Test the simple case when calculating the sub array.
	 */
	@Test
	public void testSimpleCase() {
		int result = MaxSubarray.subArray();
		int expected = 13;

		Assert.assertEquals(expected, result);
	}

}
