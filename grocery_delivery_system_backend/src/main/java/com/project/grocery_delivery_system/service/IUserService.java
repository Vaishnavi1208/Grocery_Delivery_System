package com.project.grocery_delivery_system.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.grocery_delivery_system.entities.User;
import com.project.grocery_delivery_system.exceptions.PasswordNotValidException;
import com.project.grocery_delivery_system.exceptions.UserAlreadyRegisteredException;
import com.project.grocery_delivery_system.exceptions.UserNotFoundException;

@Service
public interface IUserService {
	
	public User addUser(User user) throws UserAlreadyRegisteredException, PasswordNotValidException;
	
	public ResponseEntity<String> deleteUser(String emailId) throws UserNotFoundException;

	public User updateUser(User user, String emailId)throws UserNotFoundException;
}
