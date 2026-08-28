package com.todocodeacademy.city_service.controller;

import com.todocodeacademy.city_service.dto.CityDTO;
import com.todocodeacademy.city_service.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cities")
public class CityController {

    private final CityService cityService;

    @GetMapping("/hotels")
    public CityDTO getHotelList(@RequestParam String name, @RequestParam String country) {

        return cityService.getCitiesHotels(name, country);
    }
}
