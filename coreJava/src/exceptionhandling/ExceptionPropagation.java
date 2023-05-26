package exceptionhandling;

import java.io.IOException;
import java.util.Random;

public class ExceptionPropagation {

	public static void main(String[] args) {
		try {
			callTheException();
		} catch (userDefiendCheckedException e) {
			System.out.println(e.getMessage());
		} 
		
	}

	private static void callTheException() throws userDefiendCheckedException {

		boolean value = new Random().nextBoolean();
		if (value)
			throw new userDefiendCheckedException("checked exception occured");
		else
			throw new userDefiendUnCheckedException("unchecked Exception Occured");
	}
}

class userDefiendCheckedException extends IOException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public userDefiendCheckedException(String msg) {
		super(msg);
	}

}

class userDefiendUnCheckedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public userDefiendUnCheckedException(String msg) {
		super(msg);
	}

}
