package com.todocodeacademy.city_service.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HotelDTO {

    private Long id;
    private String name;
    private Double stars;
    private Long cityId;
}
