package com.project.grocery_delivery_system.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.grocery_delivery_system.entities.Product;
import com.project.grocery_delivery_system.repository.ProductRepository;
import com.project.grocery_delivery_system.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);

	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	@Override
	public String deleteProduct(long productId) {
		productRepository.findById(productId);
        productRepository.deleteById(productId);
        return "Product Deleted Succesfully";
	}

	@Override
	public Product updateProduct(Product product, long productId) {
        Optional<Product> oproduct = productRepository.findById(productId);
		if(oproduct.get()!=null) {
			return productRepository.save(product);
		}
		else {
			return null;
		}

	}
}
