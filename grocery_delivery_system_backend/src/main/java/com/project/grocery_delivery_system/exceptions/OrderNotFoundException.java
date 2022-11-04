package com.project.grocery_delivery_system.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//sending custom exception response for requested source

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Order Not Found")
public class OrderNotFoundException extends Exception {
	
	
	public OrderNotFoundException(String msg) {
		super(msg);
	}

}
