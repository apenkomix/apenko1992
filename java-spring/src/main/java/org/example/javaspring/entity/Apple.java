package org.example.javaspring.entity;

import java.util.List;

public record Apple(String Id, String name, String color, Long quantity, Long price) {
    public void add(List<Apple> apple) {
    }
}
