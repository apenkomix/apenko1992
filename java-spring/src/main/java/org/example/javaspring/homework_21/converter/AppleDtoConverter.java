package org.example.javaspring.homework_21.converter;

import org.example.javaspring.homework_21.entity.Apple;
import org.example.javaspring.homework_21.dto.AppleDto;

public class AppleDtoConverter {
    public AppleDto converter(Apple apple) {
        return new AppleDto(apple.name(), apple.color(), apple.quantity(),apple.price());
    }
}
