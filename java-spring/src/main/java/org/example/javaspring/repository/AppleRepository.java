package org.example.javaspring.repository;

import org.example.javaspring.entity.Apple;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class AppleRepository {
    private Map<Long, Apple> storage = new HashMap<>();
    @PostConstruct
    private void init() {
        System.out.println("Hi from Postprodaction");
        storage.put(1L,new Apple("1","Nalive", "white",20,100));
    }
    public Apple getById(Long id){
        return storage.get(id);
    }
}
