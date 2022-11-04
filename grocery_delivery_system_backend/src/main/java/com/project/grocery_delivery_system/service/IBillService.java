package com.project.grocery_delivery_system.service;

import com.project.grocery_delivery_system.entities.Bill;

public interface IBillService {
	
	public Bill addBill(Bill bill);
	public Bill updateBill(Bill bill);
	public String deleteBill(Long billId);
	public Bill getBill(Long billId);
}