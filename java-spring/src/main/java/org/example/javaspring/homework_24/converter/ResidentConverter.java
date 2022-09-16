package org.example.javaspring.homework_24.converter;

import org.example.javaspring.homework_24.dto.ResidentDto;
import org.example.javaspring.homework_24.entity.Resident;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ResidentConverter {
    public Resident toLocal(ResidentDto residentDto){
        Resident resident = new Resident();
        return resident;
    }
    public ResidentDto toFront(Resident resident){
    return  new ResidentDto(resident.getId(),resident.getName());
    }
    public List<Resident> toLocal(List<ResidentDto> residentDtos){
        return residentDtos.stream().map(this::toLocal).toList();
    }
    public List<ResidentDto> toFront(List<Resident> residents){
        return residents.stream().map(this::toFront).toList();
    }
}
