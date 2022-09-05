package org.example.javaspring.homework_24.converter;

import org.example.javaspring.homework_24.dto.HouseDto;
import org.example.javaspring.homework_24.entity.House;
import org.springframework.stereotype.Component;

@Component
public class HouseConverter {
    public House toLocal(HouseDto houseDto){
        House house = new House();
        house.setHouseType(houseDto.houseType());
        house.setFloor(houseDto.floor());
        house.setEntrance(houseDto.entrance());
        return house;
    }
    public HouseDto toFront(House house){
        return new HouseDto(house.getId(), house.getHouseType(),house.getFloor(),house.getEntrance());
    }
}
