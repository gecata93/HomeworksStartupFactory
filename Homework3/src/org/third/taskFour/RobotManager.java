package org.third.taskFour;

/**
 * @author GeCa A class that managing the robot moves.
 */
public final class RobotManager {
	/**
	 * Private class. not called.
	 */
	private RobotManager() {

	}

	/**
	 * Method that maks the robot runs.
	 */
	public static void runRobot() {
		FancyDancer robot = new FancyDancer(5, 5);

		while (true) {

			try {
				robot.carefulMove();
			} catch (WallException | EastException e) {

				robot.turnLeft();

				e.printStackTrace();
			}

		}
	}

}
