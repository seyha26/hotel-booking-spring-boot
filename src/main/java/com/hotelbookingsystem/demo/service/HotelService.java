package com.hotelbookingsystem.demo.service;

import com.hotelbookingsystem.demo.model.Hotel;
import com.hotelbookingsystem.demo.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {
  private final HotelRepository hotelRepository;

  public HotelService(HotelRepository hotelRepository) {
    this.hotelRepository = hotelRepository;
  }
  
  public Hotel saveHotel(Hotel hotel) {
    return hotelRepository.save(hotel);
  }

  public Optional<Hotel> getHotelById(Long id) {
    return hotelRepository.findById(id);
  }

  public void deleteHotel(Long id) {
    hotelRepository.deleteById(id);
  }

  public List<Hotel> getAllHotels() {
    return hotelRepository.findAll();
  }

  public List<Hotel> searchHotelByName(String name) {
    return hotelRepository.findByNameContainingIgnoreCase(name);
  }
}
