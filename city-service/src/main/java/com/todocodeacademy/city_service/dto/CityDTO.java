package com.todocodeacademy.city_service.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CityDTO {

    private Long id;
    private String name;
    private String state;
    private String country;
    private String continent;
    private List<HotelDTO> hotels;
}
