package com.todocodeacademy.city_service.repository;

import com.todocodeacademy.city_service.dto.HotelDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "hotel-service")
public interface HotelAPIClient {

    @GetMapping("/{cityID}")
    List<HotelDTO> getHotelsByCityID(@PathVariable Long cityID);
}
