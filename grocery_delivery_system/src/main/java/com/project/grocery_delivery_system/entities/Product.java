package com.project.grocery_delivery_system.entities;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private long product_id;
	
	@Column(name = "product_category")
	private String product_category;
	
	@Column(name = "product_name")
	private String product_name;
	
	@Column(name = "product_price")
	private String product_price;

	//default constructor
	public Product() {
		
	}
	
	//parameterized constructor
	public Product(long product_id, String product_category, String product_name, String product_price) {
		this.product_id = product_id;
		this.product_category = product_category;
		this.product_name = product_name;
		this.product_price = product_price;
	}

	//getters and setters
	public long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}

	public String getProduct_category() {
		return product_category;
	}

	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_price() {
		return product_price;
	}

	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}
	
	
}
