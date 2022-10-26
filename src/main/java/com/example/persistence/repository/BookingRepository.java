package com.example.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.persistence.domain.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{
	
	@Query("select b from Booking b where b.Type=?1")
	Optional<List<Booking>> BookingByType(String Type);

}
