package com.hotelbookingsystem.demo.service;

import com.hotelbookingsystem.demo.model.Room;
import com.hotelbookingsystem.demo.model.Hotel;
import com.hotelbookingsystem.demo.model.RoomType;
import com.hotelbookingsystem.demo.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
  private final RoomRepository roomRepository;

  public RoomService (RoomRepository roomRepository) {
    this.roomRepository = roomRepository;
  }

  public Room roomSave(Room room) {
    return roomRepository.save(room);
  }

  public Optional<Room> getRoomById(Long id) {
    return roomRepository.findById(id);
  }

  public List<Room> getRoomsByHotel(Hotel hotel) {
    return roomRepository.findByHotel(hotel);
  }

  public List<Room> getRoomsByType(RoomType roomType) {
    return roomRepository.findByRoomType(roomType);
  }

  public List<Room> getRoomsByStatus(String status) {
    return roomRepository.findByStatus(status);
  }

  public void deleteRoom(Long id) {
    roomRepository.deleteById(id);
  }
}
