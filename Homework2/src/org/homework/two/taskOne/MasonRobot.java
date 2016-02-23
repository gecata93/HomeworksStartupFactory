package org.homework.two.taskOne;

/**
 * @author GeCa A class that builds a robot that makes the mason.
 */
public class MasonRobot extends RightTurnerRobot implements HouseBuilder {

	/**
	 * @param street
	 *            which.
	 * @param avenue
	 *            which.
	 * @param direction
	 *            which.
	 * @param beepers
	 *            how many.
	 */
	public MasonRobot(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}

	/**
	 * A method that builds the mason.
	 */
	@Override
	public void build() {
		for (int i = 1; i < 57; i++) {

			move();
			putBeeper();
			if (i == 14) {
				turnLeft();
			}
			if (i == 28) {
				turnLeft();
			}
			if (i == 42) {
				turnLeft();
			}

		}
		turnLeft();
	}
}
