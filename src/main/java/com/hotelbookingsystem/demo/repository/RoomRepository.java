package com.hotelbookingsystem.demo.repository;

import com.hotelbookingsystem.demo.model.Room;
import com.hotelbookingsystem.demo.model.RoomType;
import com.hotelbookingsystem.demo.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findByHotel(Hotel hotel);
    List<Room> findByRoomType(RoomType roomType);
    List<Room> findByStatus(String status);
}