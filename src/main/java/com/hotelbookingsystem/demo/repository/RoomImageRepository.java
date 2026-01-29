package com.hotelbookingsystem.demo.repository;

import com.hotelbookingsystem.demo.model.RoomImage;
import com.hotelbookingsystem.demo.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomImageRepository extends JpaRepository<RoomImage, Long> {
    List<RoomImage> findByRoom(Room room);
}