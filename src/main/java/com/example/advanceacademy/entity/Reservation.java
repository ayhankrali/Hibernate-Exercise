package com.example.advanceacademy.entity;

import com.example.advanceacademy.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private int stays;
    private Date dateIn;

    @ManyToOne
    private Room room;

    @ManyToOne
    private Hotel hotel;
    private Double price;

    @ManyToOne
    private User user;



}
