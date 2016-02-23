package org.third.taskThree;

/**
 * @author GeCa
 */
public class ArrayEdit {

	private int[] array = new int[5];
	private int i = 0;

	/**
	 * Getter method for array.
	 *
	 * @return the array
	 */
	public int[] getArray() {
		return array;
	}

	/**
	 * Setter method for array.
	 *
	 * @param array
	 *            the array to set
	 */
	public void setArray(int[] array) {
		this.array = array;
	}

	/**
	 * Getter.
	 * 
	 * @return getter for the variable.
	 */
	public int getI() {
		return i;
	}

	/**
	 * Setter.
	 * 
	 * @param i
	 *            setter for the variable.
	 */
	public void setI(int i) {
		this.i = i;
	}

	/**
	 * This method adds elements into the array.
	 * 
	 * @param number
	 *            the added number in the array.
	 * @throws FullArrayException
	 *             exception that checks if array is full.
	 */
	public void add(int number) throws FullArrayException {
		if (i < 4) {
			getArray()[i] = number;
			i++;
		} else {
			throw new FullArrayException("The array is full! ");
		}
	}

	/**
	 * This method removes elements from the array.
	 * 
	 * @throws EmptyarrayException
	 *             exception that checks if the array is empty.
	 */
	public void remove() throws EmptyArrayException {
		if (i > 0) {
			getArray()[i - 1] = 0;
			i--;
		} else {
			throw new EmptyArrayException("The array is empty! ");
		}
	}

}
