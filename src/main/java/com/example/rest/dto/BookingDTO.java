package com.example.rest.dto;

import com.example.persistence.domain.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class BookingDTO {

    private Long id;

    private String Type;
    
    private String Date;
    
    private String Time;
    
    private Integer Duration;
    
    private String Coach;;
    
    private Customer customer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public Integer getDuration() {
		return Duration;
	}

	public void setDuration(Integer duration) {
		Duration = duration;
	}

	public String getCoach() {
		return Coach;
	}

	public void setCoach(String coach) {
		Coach = coach;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BookingDTO(Long id, String type, String date, String time, Integer duration, String coach,
			Customer customer) {
		super();
		this.id = id;
		Type = type;
		Date = date;
		Time = time;
		Duration = duration;
		Coach = coach;
		this.customer = customer;
	}

	public BookingDTO() {
		super();
	}

	@Override
	public String toString() {
		return "BookingDTO [id=" + id + ", Type=" + Type + ", Date=" + Date + ", Time=" + Time + ", Duration="
				+ Duration + ", Coach=" + Coach + ", customer=" + customer + "]";
	}

}
