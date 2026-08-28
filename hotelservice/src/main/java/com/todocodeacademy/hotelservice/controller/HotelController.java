package com.todocodeacademy.hotelservice.controller;

import com.todocodeacademy.hotelservice.model.Hotel;
import com.todocodeacademy.hotelservice.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hotels")
public class HotelController {

    private final HotelService hotelService;

    @GetMapping("/{cityID}")
    public List<Hotel> getHotelsByCity(@PathVariable Long cityID) {

        return hotelService.getHotelsByCityID(cityID);
    }
}
