package com.project.grocery_delivery_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.grocery_delivery_system.entities.User;

public interface IUserRepository extends JpaRepository<User, Long>{
	
	public List<User> findByEmailIdAndPassword(String emailId , String password);
	
	public User findByEmailId(String emailId);
	
	public boolean existsByEmailId(String emailId);

}