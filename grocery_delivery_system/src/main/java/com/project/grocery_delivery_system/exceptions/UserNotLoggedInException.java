package com.project.grocery_delivery_system.exceptions;

public class UserNotLoggedInException extends Exception{

	private final String message;



	   /**
	     * @param message
	     */
	    public UserNotLoggedInException(String message) {
	        this.message = message;
	    }



	   /**
	     * @return the message
	     */
	    
	    public String getMessage() {
	        return message;
	    }
}
