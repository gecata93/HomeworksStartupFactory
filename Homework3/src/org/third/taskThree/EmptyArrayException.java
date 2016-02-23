package org.third.taskThree;

/**
 * @author GeCa A class for the implemented exception.
 */
public class EmptyArrayException extends Exception {

	/**
	 * Comment for serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for the exception.
	 */
	public EmptyArrayException() {
		super();
	}

	/**
	 * Constructor for the exception.
	 * 
	 * @param message
	 *            input the message for the exception.
	 */
	public EmptyArrayException(String message) {
		super(message);
	}

}
