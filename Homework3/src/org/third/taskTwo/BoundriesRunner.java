package org.third.taskTwo;

/**
 * @author GeCa A class that runs the program.
 */
public final class BoundriesRunner {

	/**
	 * private constructor. not called.
	 */
	private BoundriesRunner() {

	}

	/**
	 * @param args
	 *            main method variable.
	 */
	public static void main(String[] args) {
		try {
			Boundries.boundryFit();
		} catch (BoundriesException e) {
			e.printStackTrace();
		}
	}

}
