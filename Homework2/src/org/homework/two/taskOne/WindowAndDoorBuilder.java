package org.homework.two.taskOne;

/**
 * @author GeCa A class that builds the door and the windows.
 */
public class WindowAndDoorBuilder extends RightTurnerRobot implements HouseBuilder {

	/**
	 * Constructor.
	 * 
	 * @param street
	 *            which.
	 * @param avenue
	 *            which.
	 * @param direction
	 *            which.
	 * @param beepers
	 *            how many.
	 */
	public WindowAndDoorBuilder(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}

	/**
	 * {@inheritDoc} A method which builds doors and windows.
	 */
	@Override
	public void build() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				putBeeper();
				move();

			}
			turnRight();
		}
	}
}
