package org.homework.two.taskOne;

/**
 * @author GeCa A class that builds the roof.
 */
public class RoofBuilder extends RightTurnerRobot implements HouseBuilder {

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
	public RoofBuilder(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}

	/**
	 * {@inheritDoc} A method that helps for building the roof.
	 */
	@Override
	public void build() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 7; j++) {
				putBeeper();
				move();
				turnLeft();
				move();
				turnRight();
			}
			turnRight();
		}
	}
}
