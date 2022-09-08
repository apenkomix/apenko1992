package org.example.javaspring.homework_24.dto;

import org.example.javaspring.homework_24.entity.HouseType;

public record HouseDto(Long id, HouseType houseType, Integer floor, Integer entrance,AddressDto address) {
}
