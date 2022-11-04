package com.project.grocery_delivery_system.entities;

import java.time.LocalDate;
import javax.persistence.*;


	@Entity
	public class Bill {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)



	   private Long billId;
	    private LocalDate billDate;
	    private String billAddress;
	    
	    
	    public Bill(LocalDate billDate, String billAddress) {
	        super();
	        this.billDate = billDate;
	        this.billAddress = billAddress;
	    }
	    
	    public Bill() {
	        super();
	        // TODO Auto-generated constructor stub
	    }



	   public Long getBillId() {
	        return billId;
	    }
	    public void setBillId(Long billId) {
	        this.billId = billId;
	    }
	    public LocalDate getBillDate() {
	        return billDate;
	    }
	    public void setBillDate(LocalDate billDate) {
	        this.billDate = billDate;
	    }
	    public String getBillAddress() {
	        return billAddress;
	    }
	    public void setBillAddress(String billAddress) {
	        this.billAddress = billAddress;
	    }
	
}
