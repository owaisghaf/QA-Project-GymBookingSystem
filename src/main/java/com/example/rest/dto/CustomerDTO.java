package com.example.rest.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.persistence.domain.Booking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class CustomerDTO {
	
    private Long id;

    private String Name;
    
    private String Email;
    
    private Long Phone;
    
    private String Username;
    
    private String Password;
    
    private String DOB;
    
    private String Address; 
    
    private List<Booking> booking = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Long getPhone() {
		return Phone;
	}

	public void setPhone(Long phone) {
		Phone = phone;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	public CustomerDTO(Long id, String name, String email, Long phone, String username, String password, String dOB,
			String address, List<Booking> booking) {
		super();
		this.id = id;
		Name = name;
		Email = email;
		Phone = phone;
		Username = username;
		Password = password;
		DOB = dOB;
		Address = address;
		this.booking = booking;
	}

	public CustomerDTO() {
		super();
	}

	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Phone=" + Phone + ", Username="
				+ Username + ", Password=" + Password + ", DOB=" + DOB + ", Address=" + Address + ", booking=" + booking
				+ "]";
	}


}
