package com.project.grocery_delivery_system.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//sending custom response for requested source
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Product Not Found")
public class ProductNotFoundException extends Exception {
	
	public ProductNotFoundException(String msg) {
		super(msg);
	}

}
