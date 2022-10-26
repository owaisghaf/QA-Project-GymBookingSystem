package com.example.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Booking does not exist with that ID")
public class BookingNotFoundException extends EntityNotFoundException{
	public BookingNotFoundException() {}
	public BookingNotFoundException(String msg) {
		super(msg);
	}

}
