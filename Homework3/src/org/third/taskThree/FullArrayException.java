package org.third.taskThree;

/**
 * @author GeCa A class for the implemented excception.
 */
public class FullArrayException extends Exception {

	/**
	 * Comment for serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for the exception.
	 */
	public FullArrayException() {
		super();
	}

	/**
	 * Constructor for the exception with message.
	 * 
	 * @param message
	 *            inputs a message in the exception.
	 */
	public FullArrayException(String message) {
		super(message);
	}

}
