package com.todocodeacademy.hotelservice.service;

import com.todocodeacademy.hotelservice.model.Hotel;
import com.todocodeacademy.hotelservice.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    @Override
    public List<Hotel> getHotelsByCityID(Long cityId) {

        return hotelRepository.findAllByCityId(cityId);
    }
}
