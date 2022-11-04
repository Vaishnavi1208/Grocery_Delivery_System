package com.project.grocery_delivery_system.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.grocery_delivery_system.entities.Order;
import com.project.grocery_delivery_system.exceptions.OrderNotFoundException;
import com.project.grocery_delivery_system.repository.IOrderRepository;
import com.project.grocery_delivery_system.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService {
	
	@Autowired
	private IOrderRepository orderRepository;
	
	//adding the order
	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.saveAndFlush(order);
	}

	//view order
	@Override
	public Order viewOrder(Order order) throws OrderNotFoundException {
		// TODO Auto-generated method stub
		if(orderRepository.existsById(order.getOrderId())) {
			return orderRepository.findById(order.getOrderId()).get();
		}
		else {
			throw new OrderNotFoundException("Order Not Found");
		}
	}

	@Override
	public Order updateOrder(Order order) throws OrderNotFoundException {
		// TODO Auto-generated method stub
		if(orderRepository.existsById(order.getOrderId())) {
			return orderRepository.saveAndFlush(order);
		}
		else {
			throw new OrderNotFoundException("Order Not Found");
		}
	}

	@Override
	public Order cancelOrder(long orderId) throws OrderNotFoundException {
		// TODO Auto-generated method stub
		if(orderRepository.existsById(orderId)) {
			orderRepository.deleteById(orderId);
			return null;
		}
		else {
			throw new OrderNotFoundException("Order Not Found");
		}
	}

	public List<Order> showAllOrder() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}
}
