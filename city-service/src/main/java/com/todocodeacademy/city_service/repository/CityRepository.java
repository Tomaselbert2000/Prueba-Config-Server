package com.todocodeacademy.city_service.repository;

import com.todocodeacademy.city_service.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    City findByNameAndCountry(String name, String country);
}
