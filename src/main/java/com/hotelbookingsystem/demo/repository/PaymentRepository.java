package com.hotelbookingsystem.demo.repository;

import com.hotelbookingsystem.demo.model.Payment;
import com.hotelbookingsystem.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByBooking(Booking booking);
}