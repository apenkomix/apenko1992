package org.example.javaspring.service;

import org.example.javaspring.converter.AppleDtoConverter;
import org.example.javaspring.dto.AppleDto;
import org.example.javaspring.entity.Apple;
import org.example.javaspring.repository.AppleRepository;
import org.springframework.stereotype.Service;

@Service
public class AppleService {
    private final AppleRepository appleRepository;
    private final AppleDtoConverter appleDtoConverter;

    public AppleService(AppleRepository appleRepository, AppleDtoConverter appleDtoConverter) {
        this.appleRepository = appleRepository;
        this.appleDtoConverter = appleDtoConverter;
    }
    public AppleDto getById(Long id){
        Apple apple = appleRepository.getById(id);
        return appleDtoConverter.converter(apple);

    }
}
