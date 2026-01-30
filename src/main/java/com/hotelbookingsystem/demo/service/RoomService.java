package com.hotelbookingsystem.demo.service;

import com.hotelbookingsystem.demo.model.Room;
import com.hotelbookingsystem.demo.model.Hotel;
import com.hotelbookingsystem.demo.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
  private final RoomRepository rommRepository;
  public RoomService (RoomRepository roomRepository) {
    this.roomRepository = roomRepository;
  }
}
