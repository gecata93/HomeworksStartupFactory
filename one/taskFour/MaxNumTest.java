package org.homework.one.taskFour;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test the summing of two string numbers.
 * 
 * @author GeCa
 */
public class MaxNumTest {

	/**
	 * Simple test.
	 */
	@Test
	public void testSimpleCase() {
		String result = MaxNum.calculate("5671", "25");
		Assert.assertEquals("8171", result);
	}

}
