package com.todocodeacademy.city_service.service;

import com.todocodeacademy.city_service.dto.CityDTO;
import com.todocodeacademy.city_service.dto.HotelDTO;
import com.todocodeacademy.city_service.model.City;
import com.todocodeacademy.city_service.repository.CityRepository;
import com.todocodeacademy.city_service.repository.HotelAPIClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepository repository;
    private final HotelAPIClient apiClient;

    @Override
    @CircuitBreaker(name = "hotel-service", fallbackMethod = "fallbackGetCitiesHotel")
    public CityDTO getCitiesHotels(String name, String country) {

        try {

            City city = repository.findByNameAndCountry(name, country);

            List<HotelDTO> hotels = apiClient.getHotelsByCityID(city.getId());

            throwRuntimeException();

            return CityDTO.builder()
                    .id(city.getId())
                    .name(city.getName())
                    .state(city.getState())
                    .country(city.getCountry())
                    .continent(city.getContinent())
                    .hotels(hotels)
                    .build();

        } catch (Exception e) {

            return fallbackGetCitiesHotel();
        }
    }

    private void throwRuntimeException() {

        throw new RuntimeException("Circuit breaker activado");
    }

    private CityDTO fallbackGetCitiesHotel() {

        return CityDTO.builder()
                .id(999999L)
                .name("Error de carga.")
                .state("--")
                .country("--")
                .continent("--")
                .hotels(List.of())
                .build();
    }
}
