package com.project.grocery_delivery_system.service;

import com.project.grocery_delivery_system.entities.Order;
import com.project.grocery_delivery_system.exceptions.OrderNotFoundException;

public interface IOrderService {
	
	public Order addOrder(Order order);
	
	public Order viewOrder(Order order) throws OrderNotFoundException;
	
	public Order updateOrder(Order order) throws OrderNotFoundException;

	public Order cancelOrder(long orderId) throws OrderNotFoundException;
}
