package com.example.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.rest.controller.BookingController;

@SpringBootTest
public class BookingControllerInitialisationTest 
{
	@Autowired
	private BookingController controller;
	
	@Test
	public void controllerInitCorrectly() //Checks whether REST controller has been initialised
	{
		assertThat(controller).isNotNull();
	}
}