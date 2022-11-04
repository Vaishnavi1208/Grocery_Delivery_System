package com.project.grocery_delivery_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.grocery_delivery_system.entities.Order;
import com.project.grocery_delivery_system.exceptions.OrderNotFoundException;
import com.project.grocery_delivery_system.serviceImpl.OrderServiceImpl;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderServiceImpl orderService;

	@PostMapping("/add")
	public Order addOrder(@RequestBody Order order) {
		return orderService.addOrder(order);
	}

	@GetMapping("/view/{orderId}")
	public Order viewOrder(@PathVariable int orderId) throws OrderNotFoundException {
		Order order = new Order();
		order.setOrderId(orderId);
		return orderService.viewOrder(order);
	}

	@PutMapping("/update")
	public Order updateOrder(@RequestBody Order order) throws OrderNotFoundException {
		return orderService.updateOrder(order);
	}

	@DeleteMapping("/remove/{orderId}")
	public Order cancelOrder(@PathVariable int orderId) throws OrderNotFoundException {
		return orderService.cancelOrder(orderId);
	}

	
	@GetMapping("/show")
	public List<Order> showAllOrder() {
		return orderService.showAllOrder();
	}
}
