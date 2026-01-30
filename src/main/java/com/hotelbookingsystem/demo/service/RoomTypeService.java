package com.hotelbookingsystem.demo.service;

import com.hotelbookingsystem.demo.model.RoomType;
import com.hotelbookingsystem.demo.repository.RoomTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomTypeService {
  private final RoomTypeRepository roomTypeRepository;

  public RoomTypeService(RoomTypeRepository roomTypeRepository) {
    this.roomTypeRepository = roomTypeRepository;
  }

  public List<RoomType> getAllRoomTypes() {
    return roomTypeRepository.findAll();
  }

  public RoomType saveRoomType (RoomType roomType) {
    return roomTypeRepository.save(roomType);
  }

  public Optional<RoomType> getRoomTypeById (Long id) {
    return roomTypeRepository.findById(id);
  }

  public void deleteRoomType (Long id) {
    roomTypeRepository.deleteById(id);
  }
}
