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
import com.example.persistence.domain.Customer;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Sql(scripts = "classpath:gymbooking-data.sql", executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
public class CustomerControllerIntegrationTest {

	@Autowired
	private MockMvc mockMVC;

	@Autowired
	private ObjectMapper mapper;
	
	private final Customer TEST_CUSTOMER = new Customer(null,"Owais Ghafoor","owais.ghaf@gmail.com",447591204221L,"OG","1234","31/05/1997","Birmingham", null);

	private final Customer TEST_SAVED_CUSTOMER = new Customer(1L,"Owais Ghafoor","owais.ghaf@gmail.com",447591204221L,"OG","1234","31/05/1997","Birmingham",null);

	@Test //CREATE
	public void testCreate() throws JsonProcessingException, Exception {
		String resultString = this.mockMVC
				.perform(post("/addCustomer").contentType(MediaType.APPLICATION_JSON)
						.content(this.mapper.writeValueAsString(TEST_CUSTOMER)))
				.andExpect(status().isCreated()).andReturn().getRequest().getContentAsString();

		Customer result = this.mapper.readValue(resultString, Customer.class);
		assertThat(result).isEqualTo(TEST_CUSTOMER);
	}

	@Test // READ
	public void testReadOne() throws Exception {
		this.mockMVC.perform(get("/CustomerById/1")).andExpect(status().isOk())
				.andExpect(content().json(this.mapper.writeValueAsString(TEST_SAVED_CUSTOMER)));

	}

	@Test // READ
	public void testZZZ() throws Exception {
		final List<Customer> CUSTOMERS = new ArrayList<>();
		CUSTOMERS.add(TEST_SAVED_CUSTOMER);

		final String resultString = this.mockMVC
				.perform(request(HttpMethod.GET, "/allCustomers").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();

		List<Customer> results = Arrays.asList(mapper.readValue(resultString, Customer[].class));
		assertThat(results).contains(this.TEST_CUSTOMER).hasSize(9);
	}

	@Test // UPDATE
	public void testUpdate() throws Exception {
		final Customer newCustomer = new Customer(null,"Laraib Pervaiz","lara@gmail.com",447333444555L,"19/06/1994", "LP", "1234", "High Wycombe",null);
		String resultString = this.mockMVC
				.perform(put("/updateCustomer/1").contentType(MediaType.APPLICATION_JSON)
						.content(this.mapper.writeValueAsString(newCustomer)))
				.andExpect(status().isAccepted()).andReturn().getRequest().getContentAsString();

		Customer result = this.mapper.readValue(resultString, Customer.class);
		assertThat(result).isEqualTo(newCustomer);
	}

	@Test // DELETE
	public void testDelete() throws Exception {
		this.mockMVC.perform(delete("/deleteCustomer/1")).andExpect(status().isNoContent());
	}
}
