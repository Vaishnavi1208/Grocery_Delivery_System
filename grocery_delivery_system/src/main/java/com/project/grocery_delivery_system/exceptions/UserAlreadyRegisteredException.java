package com.project.grocery_delivery_system.exceptions;

public class UserAlreadyRegisteredException extends Exception {
	private final String message;



	   /**
	     * @param message
	     */
	    public UserAlreadyRegisteredException(String message) {
	        this.message = message;
	    }



	public String getMessage() {
		return message;
	}


	  


}
