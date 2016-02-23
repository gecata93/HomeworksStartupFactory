package org.homework.two.taskOne;

import kareltherobot.Directions;
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
	 * Main method.
	 * 
	 * @param args
	 *            main variable.
	 */
	public static void main(String[] args) {

		World.setSize(23, 23);
		World.setVisible(true);
		World.setDelay(1);

		MasonRobot basis = new MasonRobot(1, 1, Directions.East, 60);
		RoofBuilder roof = new RoofBuilder(15, 1, Directions.East, 30);
		WindowAndDoorBuilder firstWindow = new WindowAndDoorBuilder(12, 3, Directions.East, 25);
		WindowAndDoorBuilder secondWindow = new WindowAndDoorBuilder(12, 9, Directions.East, 25);
		WindowAndDoorBuilder door = new WindowAndDoorBuilder(5, 1, Directions.East, 25);

		basis.build();
		roof.build();
		firstWindow.build();
		secondWindow.build();
		door.build();
	}
}
