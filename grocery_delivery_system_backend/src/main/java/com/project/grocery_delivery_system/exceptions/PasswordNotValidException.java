package com.project.grocery_delivery_system.exceptions;

public class PasswordNotValidException extends Exception {
	
	private final String message;

	/**
	 * @param message
	 */
	public PasswordNotValidException(String message) {
		this.message=message;
	}

	/**
	 * @return the message
	 */
	@Override
	public String getMessage() {
		return message;
	}
}
