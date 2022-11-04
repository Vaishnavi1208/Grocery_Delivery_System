package com.project.grocery_delivery_system.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.grocery_delivery_system.entities.User;

import com.project.grocery_delivery_system.repository.IUserRepository;
import com.project.grocery_delivery_system.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	
	
	@Autowired
	private IUserRepository userRepository;



	@Override
	public List<User> allUsers() {
		return userRepository.findAll();
	}


}
