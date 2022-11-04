package com.project.grocery_delivery_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.grocery_delivery_system.entities.Bill;

@Repository
public interface IBillRepository extends JpaRepository<Bill, Long>{

	Bill findByBillId(Long billId);

}
