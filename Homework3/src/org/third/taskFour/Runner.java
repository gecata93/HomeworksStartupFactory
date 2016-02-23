package org.third.taskFour;

import kareltherobot.World;

/**
 * @author GeCa A class that runs the program.
 */
public final class Runner {

	/**
	 * Private constructor. not called.
	 */
	private Runner() {

	}

	/**
	 * @param args
	 *            main variable.
	 */
	public static void main(String[] args) {

		World.setVisible();
		World.setDelay(30);
		World.placeEWWall(9, 1, 9);
		RobotManager.runRobot();

	}

}
