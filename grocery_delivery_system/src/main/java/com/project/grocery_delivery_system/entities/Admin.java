package com.project.grocery_delivery_system.entities;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "admin_id")
	private long id;
	
	
}
