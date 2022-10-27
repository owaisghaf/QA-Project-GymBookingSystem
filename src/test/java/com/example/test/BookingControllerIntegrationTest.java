package com.example.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.persistence.domain.Booking;
import com.example.persistence.domain.Customer;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Sql(scripts = "classpath:gymbooking-data.sql", executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
public class BookingControllerIntegrationTest {

	@Autowired
	private MockMvc mockMVC;

	@Autowired
	private ObjectMapper mapper;

	private final Booking TEST_BOOKING = new Booking(null, "PT","27/10/2022","12:00",60,"Ghaf", null);

	private final Booking TEST_SAVED_BOOKING = new Booking(1L,"PT","27/10/2022","12:00",60,"Ghaf", null);

	@Test
	public void testCreate() throws JsonProcessingException, Exception {
		String resultString = this.mockMVC
				.perform(post("/addBooking").contentType(MediaType.APPLICATION_JSON)
						.content(this.mapper.writeValueAsString(TEST_BOOKING)))
				.andExpect(status().isCreated()).andReturn().getRequest().getContentAsString();

		Booking result = this.mapper.readValue(resultString, Booking.class);
		assertThat(result).isEqualTo(TEST_BOOKING);
	}

	@Test
	public void testReadOne() throws Exception {
		this.mockMVC.perform(get("/BookingById")).andExpect(status().isOk())
				.andExpect(content().json(this.mapper.writeValueAsString(TEST_SAVED_BOOKING)));

	}

	@Test
	public void testZZZ() throws Exception {
		final List<Booking> BOOKING = new ArrayList<>();
		BOOKING.add(TEST_SAVED_BOOKING);

		final String resultString = this.mockMVC
				.perform(request(HttpMethod.GET, "/allBookings").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();

		List<Booking> results = Arrays.asList(mapper.readValue(resultString, Booking[].class));
		assertThat(results).contains(this.TEST_BOOKING).hasSize(3);
	}

	@Test
	public void testUpdate() throws Exception {
		final Booking newPerson = new Booking(null,"HIIT", "28/10/2022", "13:00", 90, "Ghaf", null);
		String resultString = this.mockMVC
				.perform(put("/updateBooking/3").contentType(MediaType.APPLICATION_JSON)
						.content(this.mapper.writeValueAsString(newPerson)))
				.andExpect(status().isAccepted()).andReturn().getRequest().getContentAsString();

		Booking result = this.mapper.readValue(resultString, Booking.class);
		assertThat(result).isEqualTo(newPerson);
	}

	@Test
	public void testDelete() throws Exception {
		this.mockMVC.perform(delete("/deleteBooking/2")).andExpect(status().isNoContent());
	}
}
