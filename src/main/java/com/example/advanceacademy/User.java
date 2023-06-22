package com.example.advanceacademy;

import com.example.advanceacademy.entity.Reservation;
import jakarta.persistence.*;
import lombok.*;


import java.util.List;
@Builder
@Data
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(length = 30)

    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    private List<Reservation> reservations;

    public User(String ivan, String petrov, String s) {
    }
}
