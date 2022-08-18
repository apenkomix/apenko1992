package org.example.javaspring.converter;

import org.example.javaspring.dto.AppleDto;
import org.example.javaspring.entity.Apple;

public class AppleDtoConverter {
    public AppleDto converter(Apple apple) {
        return new AppleDto(apple.name(), apple.color(), apple.amount(),apple.price());
    }
}
