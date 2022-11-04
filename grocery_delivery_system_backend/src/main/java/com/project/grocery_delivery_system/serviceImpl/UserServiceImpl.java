package com.project.grocery_delivery_system.serviceImpl;

import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.google.common.hash.Hashing;
import com.project.grocery_delivery_system.entities.PasswordValidation;
import com.project.grocery_delivery_system.entities.User;
import com.project.grocery_delivery_system.exceptions.PasswordNotValidException;
import com.project.grocery_delivery_system.exceptions.UserAlreadyRegisteredException;
import com.project.grocery_delivery_system.exceptions.UserNotFoundException;
import com.project.grocery_delivery_system.repository.IUserRepository;
import com.project.grocery_delivery_system.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserRepository userRepository;

	@Override
	public User addUser(User user) throws UserAlreadyRegisteredException, PasswordNotValidException {
		if(userRepository.existsByEmailId(user.getEmailId()))
		{
			System.out.println("User is already registered with email id : "+user.getEmailId());
			throw new UserAlreadyRegisteredException("User already registered with email id :"+user.getEmailId());
		}
		
		if(PasswordValidation.passwordValid(user.getPassword()))
			user.setPassword(Hashing.sha256().hashString(user.getPassword(),StandardCharsets.UTF_8).toString());
		else 
		{
			System.out.println("Password should have atleast 8 characters, atleast 1 uppercase, atleast 1 lowercase, atleast 1 number & atleast 1 special character.");
			throw new PasswordNotValidException("Password should have atleast 8 characters, atleast 1 uppercase, atleast 1 lowercase, atleast 1 number & atleast 1 special character.");
		}
		
		userRepository.save(user);
		System.out.println("User is added successfully");
		return user;
	}
	
	
	@Override
	public ResponseEntity<String> deleteUser(String emailId) throws UserNotFoundException{
		if(userRepository.existsByEmailId(emailId))
		{
			User user = userRepository.findByEmailId(emailId);
			userRepository.delete(user);
			System.out.println("User has been deleted successfully");
			return new ResponseEntity<>("User deleted successfully",HttpStatus.OK);
		}
		System.out.println("User not found with the email id : "+emailId);
		throw new UserNotFoundException("User not found with email id :"+emailId);
	}
	
	@Override
	public User updateUser(User user,String emailId) throws UserNotFoundException{
		if(userRepository.existsByEmailId(emailId))
		{
			
			User existingUser = userRepository.findByEmailId(emailId);
			existingUser.setEmailId(user.getEmailId());
			String encryptedPassword = Hashing.sha256().hashString(user.getPassword(),StandardCharsets.UTF_8).toString();
	        existingUser.setPassword(encryptedPassword);
		 	existingUser.setFirstName(user.getFirstName());
			existingUser.setLastName(user.getLastName());
			existingUser.setPhoneNumber(user.getPhoneNumber());
			userRepository.save(existingUser);
			System.out.println("User has been updated successfully");
			return existingUser;
			
		}
		System.out.println("User not found with email id : "+emailId);
		throw new UserNotFoundException("User not found with email id : "+emailId);
		
	}
}
