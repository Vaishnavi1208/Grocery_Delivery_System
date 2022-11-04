package com.project.grocery_delivery_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.project.grocery_delivery_system.entities.User;
import com.project.grocery_delivery_system.exceptions.PasswordNotValidException;
import com.project.grocery_delivery_system.exceptions.UserAlreadyRegisteredException;
import com.project.grocery_delivery_system.exceptions.UserNotFoundException;
import com.project.grocery_delivery_system.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<User> saveUser(@RequestBody User user) throws UserAlreadyRegisteredException, PasswordNotValidException{
		return new ResponseEntity<> (userService.addUser(user),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{emailId}")
	public ResponseEntity<String> deleteUser(@PathVariable("emailId") String emailId) throws UserNotFoundException{
		userService.deleteUser(emailId);
		return new ResponseEntity<>("User deleted successfully",HttpStatus.OK);
	}
	
	@PutMapping("/update/{emailId}")
	public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable("emailId") String emailId) throws UserNotFoundException{
		return new ResponseEntity<>(userService.updateUser(user, emailId), HttpStatus.OK);
	}
}
