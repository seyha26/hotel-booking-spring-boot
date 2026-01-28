package com.hotelbookingsystem.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "guest")
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false, length = 100)
    private String fullName;

    private String email;
    private String phone;

    @OneToMany(mappedBy = "guest")
    private List<Booking> bookings;

}
