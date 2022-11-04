package com.project.grocery_delivery_system.entities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
	
	public static boolean passwordValid(String password) {
		
		Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@$!%*?&])([a-zA-Z0-9@$!%*?&]{8,})$");
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
		
	}
	
	private PasswordValidation()
	{
	}
}
