package com.example.advanceacademy.runner;

import com.example.advanceacademy.User;
import com.example.advanceacademy.entity.Hotel;
import com.example.advanceacademy.entity.Room;
import com.example.advanceacademy.entity.RoomType;
import com.example.advanceacademy.entity.ViewType;
import com.example.advanceacademy.repository.HotelRepository;
import com.example.advanceacademy.repository.RoomRepository;
import com.example.advanceacademy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Component;

@Component
public class CommandRunner implements CommandLineRunner {
    @Autowired
     UserRepository userRepository;

    @Autowired
    HotelRepository hotelRepository;

    @Autowired
    RoomRepository roomRepository;

    @Override
    public void run(String... args) throws Exception {
       User user = User.builder()
               .firstName("Ivan")
               .lastName("Petkov")
               .email("user@rmail.com")
               .password("12097381248")
               .build();
       userRepository.save(new SecurityProperties.User());


        Hotel hotel = Hotel.builder()
                .name("Ramada")
                .address("Sofia")
                .build();
        Hotel savedHotel = hotelRepository.save(hotel);



        Room room = Room.builder()
                .hotel(savedHotel)
                .room_type(RoomType.PRMIUM)
                .beds(3)
                .floor("5")
                .view(ViewType.GARDE)
                .build();

        Room savedRoom = roomRepository.save(room);

    }
}
