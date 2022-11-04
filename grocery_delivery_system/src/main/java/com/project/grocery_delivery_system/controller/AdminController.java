package com.project.grocery_delivery_system.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.grocery_delivery_system.entities.Product;
import com.project.grocery_delivery_system.entities.User;
import com.project.grocery_delivery_system.service.AdminService;
import com.project.grocery_delivery_system.service.IProductService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private IProductService productService;
	
	@GetMapping("/view/users")
	public List<User> allUsers()
	{
		return adminService.allUsers();
	}
	
	@GetMapping("view/products")
	public List<Product> allProducts(){
		return productService.getAllProducts();
	}
	
	
	
}
