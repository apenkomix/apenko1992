package org.example.javaspring.homework_24.converter;

import org.example.javaspring.homework_24.dto.HouseDto;
import org.example.javaspring.homework_24.entity.House;
import org.springframework.stereotype.Component;

@Component
public class HouseConverter {
    private final AddressConverter addressConverter;
    private final ElevatorConverter elevatorConverter;
    private final ResidentConverter residentConverter;

    public HouseConverter(AddressConverter addressConverter, ElevatorConverter elevatorConverter, ResidentConverter residentConverter) {
        this.addressConverter = addressConverter;
        this.elevatorConverter = elevatorConverter;
        this.residentConverter = residentConverter;
    }

    public House toLocal(HouseDto houseDto){
        House house = new House();
        house.setId(houseDto.id());
        house.setHouseType(houseDto.houseType());
        house.setFloor(houseDto.floor());
        house.setEntrance(houseDto.entrance());
        house.setAddress(addressConverter.toLocal(houseDto.address()));
        house.setElevators(elevatorConverter.toLocal(house,houseDto.elevators()));
        house.setResidents(residentConverter.toLocal(houseDto.residents()));
        return house;
    }
    public HouseDto toFront(House house){
        return new HouseDto(house.getId(), house.getHouseType(),house.getFloor(),house.getEntrance(),
                addressConverter.toFront(house.getAddress()),
                elevatorConverter.toFront(house.getElevators()),
                residentConverter.toFront(house.getResidents()));
    }
}
