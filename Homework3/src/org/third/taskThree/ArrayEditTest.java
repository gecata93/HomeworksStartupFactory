package org.third.taskThree;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author GeCa
 */
public class ArrayEditTest {

	private ArrayEdit element = new ArrayEdit();

	/**
	 * Test adding elements into the array.
	 */
	@Test
	public void addElem() {

		try {
			element.add(2);
			element.add(3);

		} catch (FullArrayException e) {
			e.printStackTrace();
		}
		int actual = element.getI();
		int expected = 2;
		Assert.assertEquals(expected, actual);

	}

	/**
	 * Tests removing the elements from the array.
	 */
	@Test
	public void removeElem() {
		try {
			element.add(6);
			element.add(10);
		} catch (FullArrayException e1) {
			e1.printStackTrace();
		}
		try {

			element.remove();
		} catch (EmptyArrayException e) {
			e.printStackTrace();
		}

		int actual = element.getI();
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}

}
