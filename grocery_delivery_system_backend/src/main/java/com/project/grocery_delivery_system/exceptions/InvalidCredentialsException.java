package com.project.grocery_delivery_system.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Invalid Credentials")
public class InvalidCredentialsException extends Exception{
	
	public InvalidCredentialsException() {
		super();
	}

	public InvalidCredentialsException(String msg) {
		super(msg);
	}
	
	public InvalidCredentialsException(Throwable cause) {
		super(cause);
	}
}
