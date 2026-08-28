package com.todocodeacademy.city_service.seeder;

import com.todocodeacademy.city_service.model.City;
import com.todocodeacademy.city_service.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DatabaseSeeder implements CommandLineRunner {

    private final CityRepository cityRepository;

    @Override
    public void run(String @NonNull ... args) {

        List<City> cities = createCities();

        cityRepository.saveAll(cities);
    }

    private List<City> createCities() {
        return List.of(
                City.builder().name("New York").state("NY").country("USA").continent("North America").build(),
                City.builder().name("Los Angeles").state("CA").country("USA").continent("North America").build(),
                City.builder().name("London").state("England").country("UK").continent("Europe").build(),
                City.builder().name("Paris").state("Ile-de-France").country("France").continent("Europe").build(),
                City.builder().name("Tokyo").state("Kanto").country("Japan").continent("Asia").build()
        );
    }
}
