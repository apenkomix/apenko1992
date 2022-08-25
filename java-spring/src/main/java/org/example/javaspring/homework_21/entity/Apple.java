package org.example.javaspring.homework_21.entity;

import java.util.List;

public record Apple(String Id, String name, String color, Long quantity, Long price) {
    public void add(List<Apple> apple) {
    }
}
