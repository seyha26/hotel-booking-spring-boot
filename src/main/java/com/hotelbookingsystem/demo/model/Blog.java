package com.hotelbookingsystem.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private String thumbnail;

    @Column(length = 20)
    private String status = "DRAFT";

    @Column(name = "published_at")
    private LocalDateTime publishedAt;

}
