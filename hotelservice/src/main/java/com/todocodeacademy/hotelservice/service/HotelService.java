package com.todocodeacademy.hotelservice.service;

import com.todocodeacademy.hotelservice.model.Hotel;

import java.util.List;

public interface HotelService {

    List<Hotel> getHotelsByCityID(Long cityId);
}
