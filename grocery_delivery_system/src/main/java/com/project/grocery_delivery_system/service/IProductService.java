package com.project.grocery_delivery_system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.grocery_delivery_system.entities.Product;

@Service
public interface IProductService {
	public Product createProduct(Product product);

	public List<Product> getAllProducts();
	
	public Product updateProduct(Product product, long productId);

	String deleteProduct(long productId);
}
