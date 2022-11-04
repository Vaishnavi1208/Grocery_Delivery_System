package com.project.grocery_delivery_system.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
    private long id;
    
	@Column(name = "email_id")
    private String emailId;
    
	@Column(name = "password")
    private String password;
    
	@Column(name = "first_name")
    private String firstName;
    
	@Column(name = "last_name")
    private String lastName;
    
	@Column(name = "phone_no")
    private long phoneNumber;  
    
    public User() {
        
    }
    
    
    public User(String emailId, String password, String firstName, String lastName, long phoneNumber) {
        super();
        this.emailId = emailId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }



    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
