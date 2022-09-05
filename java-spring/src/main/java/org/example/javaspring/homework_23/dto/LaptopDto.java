package org.example.javaspring.homework_23.dto;

import org.example.javaspring.homework_23.entity.Processor;
import org.example.javaspring.homework_23.entity.Producer;

import java.math.BigDecimal;

public record LaptopDto (Long id, Producer producer, Processor processor, BigDecimal price) {
}
