package com.example.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.persistence.domain.Booking;
import com.example.persistence.domain.Customer;
import com.example.persistence.repository.BookingRepository;
import com.example.persistence.repository.CustomerRepository;
import com.example.rest.dto.BookingDTO;
import com.example.rest.dto.CustomerDTO;
import com.example.service.BookingService;
import com.example.service.CustomerService;

@SpringBootTest
public class CustomerServiceUnitTest
{
	@Autowired
	private CustomerService service;
		
	@MockBean
	private CustomerRepository repo;

	
	final Customer SAVED_CUSTOMER = new Customer(1L,"Owais Ghafoor","owais.ghaf@gmail.com",447591204221L,"OG","1234","31/05/1997","Birmingham", null);
	
	@Test
	void testCreateCustomer() throws Exception
	{
		final Customer TEST_CUSTOMER = new Customer(null,"Owais Ghafoor","owais.ghaf@gmail.com",447591204221L,"OG","1234","31/05/1997","Birmingham", null);
		
		given(this.repo.save(TEST_CUSTOMER)).willReturn(TEST_CUSTOMER);
		
		CustomerDTO saveDto = this.service.addCustomer(TEST_CUSTOMER);
		
		assertThat(saveDto).usingRecursiveComparison().isEqualTo(TEST_CUSTOMER);
	}

	@Test
	void testUpdateCustomer()
	{
		given(repo.save(any(Customer.class))).willReturn(SAVED_CUSTOMER);
		
		Customer SAVED_Customer = repo.save(SAVED_CUSTOMER);
		
		assertThat(SAVED_Customer.getId()).isNotNull();
	}
	
	@Test
	void testFindAllCustomers()
	{
		List<Customer> Customers = new ArrayList<>();
		Customers.add(SAVED_CUSTOMER);
		Customers.add(new Customer (2L,"Laraib Pervaiz","lara@gmail.com",447333444555L,"19/06/1994", "LP", "1234", "High Wycombe",null));
		Customers.add(new Customer (3L,"Fidha Akhtar","fidhay@gmail.com",447222333444L,"10/05/1997", "UPS", "2345", "Birmingham",null));
		
		given(repo.findAll()).willReturn(Customers);
		
		List<CustomerDTO> expected = service.getAllCustomers();
		
		assertThat(expected).usingRecursiveComparison().isEqualTo(Customers);
	}
	
	@Test
	void testFindCustomerById()
	{
		final Long id = 1L;
		final Customer TEST_Customer_ID = new Customer();
		
		given(repo.findById(id)).willReturn(Optional.of(TEST_Customer_ID));
		
		final CustomerDTO expected = service.readById(id);
		
		assertThat(expected).isNotNull();
	}
	
}
