package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.BookingNotFoundException;
import com.example.persistence.domain.Booking;
import com.example.persistence.repository.BookingRepository;
import com.example.rest.dto.BookingDTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@AllArgsConstructor
@Data
public class BookingService {
	
	@Autowired
	private BookingRepository repo;
	@Autowired
	private ModelMapper mapper;
	
	private BookingDTO mapToDTO(Booking booking) {
		return this.mapper.map(booking, BookingDTO.class);
	}
	
	public BookingDTO addBooking(Booking booking){
		Booking saved = this.repo.save(booking);
		return this.mapToDTO(saved);
	}
	
	public List<BookingDTO> getAllBookings(){
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public BookingDTO updateBooking(Long id, Booking booking) {
		Optional<Booking> tempBooking = Optional.of(this.repo.findById(id).orElseThrow(BookingNotFoundException::new));
		Booking existing = tempBooking.get();
		
		existing.setCustomer(booking.getCustomer());
		existing.setType(booking.getType());
		existing.setDate(booking.getDate());
		existing.setTime(booking.getTime());
		existing.setDuration(booking.getDuration());
		existing.setCoach(booking.getCoach());
		
		Booking updated = this.repo.save(existing);
		return this.mapToDTO(updated);
	}
	
	public boolean deleteBooking(Long id) {
		this.repo.findById(id).orElseThrow(BookingNotFoundException::new);
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}
	
	public BookingDTO readById(Long id) {
		Booking found =  this.repo.findById(id).orElseThrow(BookingNotFoundException::new);
		return this.mapToDTO(found);
	}
	
	public List<BookingDTO> readByType(String type){
		List<Booking> found = this.repo.BookingByType(type).orElseThrow(BookingNotFoundException::new);
		return found.stream().map(this::mapToDTO).collect(Collectors.toList());
	}

}
