package com.project.grocery_delivery_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.grocery_delivery_system.entities.Bill;
import com.project.grocery_delivery_system.service.IBillService;

@RestController
@RequestMapping("/billing")
public class BillController {
	@Autowired
IBillService billService;
	
	@PostMapping("/bill")
	public Bill addBill(@RequestBody Bill bill) {
	return billService.addBill(bill);
	}
	
	@PutMapping("/bill")
	public Bill updateBill(@RequestBody Bill bill ){
		return billService.updateBill(bill);
	}
	
	
	@GetMapping("/getById/{id}")
	public Bill getBillDetailsById(@PathVariable("id") Long billId){
		return billService.getBill(billId);
		
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteBillById(@PathVariable("id") Long billId ) {
		return billService.deleteBill(billId);
	}
}
