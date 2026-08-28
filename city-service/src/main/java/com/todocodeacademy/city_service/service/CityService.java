package com.todocodeacademy.city_service.service;

import com.todocodeacademy.city_service.dto.CityDTO;

public interface CityService {

    CityDTO getCitiesHotels(String name, String country);
}
