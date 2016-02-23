package org.third.taskThree;

/**
 * @author GeCa
 */
public final class ArrayMain {
	/**
	 * private constructor. not called.
	 */
	private ArrayMain() {

	}

	/**
	 * Main method.
	 * 
	 * @param args
	 *            main variable.
	 */
	public static void main(String[] args) {

		ArrayEdit print = new ArrayEdit();
		try {
			print.add(2);
			print.add(5);
		} catch (FullArrayException e) {
			e.printStackTrace();
		}

		for (int j = 0; j < print.getI(); j++) {
			System.out.println(print.getArray()[j]);
		}
	}
}
