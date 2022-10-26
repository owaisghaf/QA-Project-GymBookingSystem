package com.example.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Booking {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@NotNull
    private String Type;
    
    @NotNull
    private String Date;
    
    @NotNull
    private String Time;
    
    @NotNull
    @Size(max=3)
    private Integer Duration;
    
    private String Coach;
    
    @ManyToOne
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

	public Booking(Long id, @NotNull String type, @NotNull String date, @NotNull String time,
			@NotNull @Size(max = 3) Integer duration, String coach, Customer customer) {
		super();
		this.id = id;
		Type = type;
		Date = date;
		Time = time;
		Duration = duration;
		Coach = coach;
		this.customer = customer;
	}

	public Booking() {
		super();
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", Type=" + Type + ", Date=" + Date + ", Time=" + Time + ", Duration=" + Duration
				+ ", Coach=" + Coach + ", customer=" + customer + "]";
	}



}
