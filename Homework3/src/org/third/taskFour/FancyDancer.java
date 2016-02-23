package org.third.taskFour;

import kareltherobot.Directions;
import kareltherobot.Robot;

/**
 * A class that handles the robot.
 * 
 * @author GeCa
 */
public class FancyDancer extends Robot {

	/**
	 * @param street
	 *            which street.
	 * @param avenue
	 *            which avenue.
	 */
	public FancyDancer(int street, int avenue) {
		super(street, avenue, Directions.East, 0);
	}

	/**
	 * A method for moving the robot.
	 * 
	 * @throws WallException
	 *             exception if the robot reach a wall.
	 * @throws EastException
	 *             exception if the robot turns east and gets blind.
	 */
	public void carefulMove() throws WallException, EastException {
		if (!frontIsClear()) {
			throw new WallException("The robot found a wall");

		} else if (facingEast()) {
			throw new EastException("The robot is blinded! ");
		}
		super.move();
	}

}
