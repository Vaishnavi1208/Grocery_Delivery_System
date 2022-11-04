package com.project.grocery_delivery_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.project.grocery_delivery_system.entities.Order;

public interface IOrderRepository extends JpaRepository<Order, Long> {

}
