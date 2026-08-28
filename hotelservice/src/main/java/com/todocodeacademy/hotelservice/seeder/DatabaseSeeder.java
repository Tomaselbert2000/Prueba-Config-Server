package com.todocodeacademy.hotelservice.seeder;

import com.todocodeacademy.hotelservice.model.Hotel;
import com.todocodeacademy.hotelservice.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DatabaseSeeder implements CommandLineRunner {

    private final HotelRepository hotelRepository;

    @Override
    public void run(String @NonNull ... args) {
        List<Hotel> hotels = createHotels();
        hotelRepository.saveAll(hotels);
    }

    private List<Hotel> createHotels() {
        return List.of(
                Hotel.builder().name("Grand Plaza").stars(5.0).cityId(1L).build(),
                Hotel.builder().name("Ocean View Resort").stars(4.5D).cityId(1L).build(),
                Hotel.builder().name("City Center Inn").stars(3.0D).cityId(2L).build(),
                Hotel.builder().name("Mountain Lodge").stars(4.0D).cityId(3L).build(),
                Hotel.builder().name("Beachfront Paradise").stars(5.0D).cityId(4L).build(),
                Hotel.builder().name("Urban Boutique").stars(4.2D).cityId(5L).build(),
                Hotel.builder().name("Historic Manor").stars(4.8D).cityId(1L).build(),
                Hotel.builder().name("Eco Retreat").stars(3.5D).cityId(2L).build(),
                Hotel.builder().name("Skyline Tower Suites").stars(4.9D).cityId(3L).build(),
                Hotel.builder().name("Valley View Estate").stars(4.3D).cityId(4L).build()
        );
    }
}
