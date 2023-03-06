package jspiders;

/**
 * 
 * @author Mohammad Mustafa
 * @since 2023
 * 
 * creating a Exception class to showing to user for insufficient Balance
 * When having user infuccient Balance in account we can invoke the object of Exception type
 */

public class InsufficientBalanceException extends RuntimeException {
	private String message;
	
	InsufficientBalanceException(String message) {
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}
