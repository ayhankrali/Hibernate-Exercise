package com.example.advanceacademy.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "rooms")
@Builder
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private ViewType view;
    private String floor;
    private int beds;

    @Enumerated(EnumType.STRING)
    private RoomType room_type;

    @ManyToOne
    @JsonBackReference
    private Hotel hotel;

    @OneToMany(mappedBy = "room",fetch = FetchType.EAGER)
    private Set<Reservation> reservations ;


}
