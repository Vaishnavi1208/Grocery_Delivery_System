package com.project.grocery_delivery_system.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.grocery_delivery_system.entities.Bill;
import com.project.grocery_delivery_system.repository.IBillRepository;
import com.project.grocery_delivery_system.service.IBillService;

@Service
public class BillServiceImpl implements IBillService {

	@Autowired
	IBillRepository billRepo;
	@Override
	public Bill addBill(Bill bill) {
		// TODO Auto-generated method stub
		return billRepo.save(bill);
	}

	@Override
	public Bill updateBill(Bill bill) {
		// TODO Auto-generated method stub
		return billRepo.saveAndFlush(bill);
	}

	@Override
	public String deleteBill(Long billId) {
		billRepo.deleteById(billId);
		return "deleted successful";
	}

	@Override
	public Bill getBill(Long billId) {
		Bill bill=billRepo.findByBillId(billId);
	
		return bill;
	}

}