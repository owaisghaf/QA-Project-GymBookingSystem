package com.example.persistence.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Customer {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 0, max = 55)
    private String Name;
    
    @NotNull
    @Size(min = 0, max = 55)
    private String Email;
    
    @NotNull
    @Size(min = 0, max = 20)
    private Long Phone;
    
    @NotNull
    @Size(min = 0, max = 20)
    private String Username;
    
    @NotNull
    @Size(min = 8, max = 55)
    private String Password;
    
    private String DOB;
    
    private String Address; 
    
    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
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

	public Customer(Long id, @NotNull @Size(min = 0, max = 55) String name,
			@NotNull @Size(min = 0, max = 55) String email, @NotNull @Size(min = 0, max = 15) Long phone,
			@NotNull @Size(min = 0, max = 20) String username, @NotNull @Size(min = 8, max = 55) String password,
			String dOB, String address, List<Booking> booking) {
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

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Phone=" + Phone + ", Username="
				+ Username + ", Password=" + Password + ", DOB=" + DOB + ", Address=" + Address + ", booking=" + booking
				+ "]";
	}

	





}
