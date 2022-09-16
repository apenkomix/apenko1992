package org.example.javaspring.homework_24.converter;

import org.example.javaspring.homework_24.dto.ElevatorDto;
import org.example.javaspring.homework_24.entity.Elevator;
import org.example.javaspring.homework_24.entity.House;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ElevatorConverter {
    public Elevator toLocal(House house, ElevatorDto elevatorDto){
        if (elevatorDto == null){
            return null;
        }
        Elevator elevator = new Elevator();
        elevator.setNumber(elevatorDto.number());
        elevator.setHouse(house);
        return elevator;
    }
    public ElevatorDto toFront(Elevator elevator){
        if (elevator == null){
            return null;
        }
        return new ElevatorDto(elevator.getId(), elevator.getNumber());
    }
    public List<Elevator> toLocal(House house, List<ElevatorDto> elevatorDtos){
        if (elevatorDtos == null) {
            return null;
        }
        return elevatorDtos.stream().map(elevatorDto -> toLocal(house, elevatorDto)).toList();
    }
    public  List<ElevatorDto> toFront(List<Elevator> elevators){
        if (elevators == null){
            return null;
        }
        return elevators.stream().map(this::toFront).toList();
    }
}
