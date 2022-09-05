package org.example.javaspring.homework_23.converter;

import org.example.javaspring.homework_23.dto.LaptopDto;
import org.example.javaspring.homework_23.entity.Laptop;
import org.springframework.stereotype.Component;

@Component
public class LaptopConverter {
    public Laptop toLocal(LaptopDto laptopDto){
        Laptop laptop = new Laptop();
        laptop.setProducer(laptopDto.producer());
        laptop.setProcessor(laptopDto.processor());
        laptop.setPrice(laptopDto.price());
        return laptop;

    }
    public LaptopDto toFront(Laptop laptop){
       return new LaptopDto (laptop.getId(), laptop.getProducer(), laptop.getProcessor(), laptop.getPrice());
    }
}
