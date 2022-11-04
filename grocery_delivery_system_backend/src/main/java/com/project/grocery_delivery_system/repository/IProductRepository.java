package com.project.grocery_delivery_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.grocery_delivery_system.entities.Product;

public interface IProductRepository extends JpaRepository<Product, Long> {

}
