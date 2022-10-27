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
import com.example.persistence.repository.BookingRepository;
import com.example.rest.dto.BookingDTO;
import com.example.service.BookingService;

@SpringBootTest
public class BookingServiceUnitTest
{
	@Autowired
	private BookingService service;
		
	@MockBean
	private BookingRepository repo;

	
	final Booking SAVED_BOOKING = new Booking(1L, "PT","27/10/2022","12:00",60,"Ghaf", null);
	
	@Test
	void testCreateBooking() throws Exception
	{
		final Booking TEST_BOOKING = new Booking(null, "PT","27/10/2022","12:00",60,"Ghaf", null);
		
		given(this.repo.save(TEST_BOOKING)).willReturn(TEST_BOOKING);
		
		BookingDTO saveDto = this.service.addBooking(TEST_BOOKING);
		
		assertThat(saveDto).usingRecursiveComparison().isEqualTo(TEST_BOOKING);
	}

	@Test
	void testUpdateBooking()
	{
		given(repo.save(any(Booking.class))).willReturn(SAVED_BOOKING);
		
		Booking SAVED_Booking = repo.save(SAVED_BOOKING);
		
		assertThat(SAVED_Booking.getId()).isNotNull();
	}
	
	@Test
	void testFindAllBookings()
	{
		List<Booking> Bookings = new ArrayList<>();
		Bookings.add(SAVED_BOOKING);
		Bookings.add(new Booking (2L,"HIIT", "28/10/2022", "13:00", 90, "Ghaf", null));
		Bookings.add(new Booking (3L,"PT", "30/11/2022", "18:00", 60, "Nav", null));
		
		given(repo.findAll()).willReturn(Bookings);
		
		List<BookingDTO> expected = service.getAllBookings();
		
		assertThat(expected).usingRecursiveComparison().isEqualTo(Bookings);
	}
	
	@Test
	void testFindBookingById()
	{
		final Long id = 1L;
		final Booking TEST_Booking_ID = new Booking();
		
		given(repo.findById(id)).willReturn(Optional.of(TEST_Booking_ID));
		
		final BookingDTO expected = service.readById(id);
		
		assertThat(expected).isNotNull();
	}
	
}
