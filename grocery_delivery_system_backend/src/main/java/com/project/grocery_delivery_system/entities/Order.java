package com.project.grocery_delivery_system.entities;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;

//entity class for order
@Entity
@Table(name = "orders")
public class Order {
	
	// auto generated id
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private long orderId;
	
	@Column(name = "order_date", nullable = false)
	private LocalDate orderDate;
	
	@Column(name = "dispatch_date", nullable = false)
	private LocalDate dispatchDate;
	
	@Column(name = "total_cost", nullable = false)
	private float totalCost;
	
	@Column(name = "product_quantity", nullable = false)
	private float productQuantity;
	
	@ManyToMany
	private List <Product> products;
	
	@ManyToOne
	private User user;
	
	
	//default constructor
	public Order() {
		
	}

	//parameterized constructor
	public Order(long orderId, LocalDate orderDate, LocalDate dispatchDate, float totalCost, float productQuantity,
			List<Product> products, User user) {
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.dispatchDate = dispatchDate;
		this.totalCost = totalCost;
		this.productQuantity = productQuantity;
		this.products = products;
		this.user = user;
	}

	//getters and setters
	public long getOrderId() {
		return orderId;
	}

	

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getDispatchDate() {
		return dispatchDate;
	}

	public void setDispatchDate(LocalDate dispatchDate) {
		this.dispatchDate = dispatchDate;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public float getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(float productQuantity) {
		this.productQuantity = productQuantity;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	
	
	
	

}
