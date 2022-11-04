package com.project.grocery_delivery_system.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.grocery_delivery_system.entities.Product;
import com.project.grocery_delivery_system.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private IProductService pservice;

	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return pservice.createProduct(product);
	}

	@GetMapping("/allproducts")
	public ArrayList<Product> getAllProducts() {
		return (ArrayList<Product>) pservice.getAllProducts();
	}
	
	@DeleteMapping("/deleteProduct/{product_id}")
	public String deleteProductById(@PathVariable(value = "product_id")Long product_id)
	{
		return pservice.deleteProduct(product_id);
	}
	
	@PutMapping("updateProduct/{product_id}")
	public Product updateProductById(@PathVariable(value = "product_id") Long product_id,
			@RequestBody Product product )
	{
		return pservice.updateProduct(product, product_id);
	}
}
