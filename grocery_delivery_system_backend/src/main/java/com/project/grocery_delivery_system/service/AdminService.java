package com.project.grocery_delivery_system.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.project.grocery_delivery_system.entities.User;

@Service 
public interface AdminService {
	
	public List<User> allUsers();

}
