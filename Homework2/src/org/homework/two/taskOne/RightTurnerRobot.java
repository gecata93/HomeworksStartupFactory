package org.homework.two.taskOne;

import kareltherobot.Robot;

/**
 * @author GeCa A class that makes the robot turn right.
 */
public class RightTurnerRobot extends Robot {

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
	public RightTurnerRobot(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Turns the robot right.
	 */
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
}
