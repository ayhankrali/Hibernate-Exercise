package com.example.advanceacademy.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.HashSet;
import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity(name = "hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name ;
    private String address ;

    @OneToMany(mappedBy = "hotel",fetch = FetchType.EAGER)

    @Cascade(CascadeType.ALL)
    @JsonManagedReference
    private Set<Room> rooms;

    @OneToMany(mappedBy = "hotel",fetch = FetchType.EAGER)
    private Set<Reservation> reservations ;
}
