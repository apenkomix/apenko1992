package org.example.javaspring.homework_23.service;

import org.example.javaspring.homework_23.converter.LaptopConverter;
import org.example.javaspring.homework_23.dto.LaptopDto;
import org.example.javaspring.homework_23.entity.Laptop;
import org.example.javaspring.homework_23.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    private final LaptopConverter laptopConverter;
    private final LaptopRepository laptopRepository;
    @Autowired
    public LaptopService(LaptopConverter laptopConverter, LaptopRepository laptopRepository) {
        this.laptopConverter = laptopConverter;
        this.laptopRepository = laptopRepository;
    }

    public long save(LaptopDto laptopDto){
        Laptop laptop = laptopConverter.toLocal(laptopDto);
        Laptop savedLaptop = laptopRepository.save(laptop);
        return savedLaptop.getId();


    }
}
