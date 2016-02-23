package org.third.taskTwo;

/**
 * @author GeCa A class for the implemented exception.
 */
public class BoundriesException extends Exception {

	/**
	 * Comment for serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * constructor for the exception.
	 */
	public BoundriesException() {
		super();
	}

	/**
	 * constructor for the exception with message.
	 * 
	 * @param message
	 *            if you want to input a message into your exeption.
	 */
	public BoundriesException(String message) {
		super(message);
	}

}
