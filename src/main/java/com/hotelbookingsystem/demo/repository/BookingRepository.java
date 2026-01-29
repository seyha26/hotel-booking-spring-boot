package com.hotelbookingsystem.demo.repository;

import com.hotelbookingsystem.demo.model.Booking;
import com.hotelbookingsystem.demo.model.Guest;
import com.hotelbookingsystem.demo.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.time.LocalDate;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByGuest(Guest guest);
    List<Booking> findByRoom(Room room);
    List<Booking> findByCheckInBetween(LocalDate start, LocalDate end);
}