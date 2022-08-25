package org.example.javaspring.homework_21.repository;

import org.example.javaspring.homework_21.entity.Apple;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class AppleRepository  {
    private Map<Long, Apple> storage = new HashMap<>();
    @PostConstruct
    private void init(){
        System.out.println("Hi from PostConstruckt");
        storage.put(1L,new Apple("1","Nalive","white", 20L,50L));
    }
    public Apple getById(Long id){
       return storage.get(id);
    }
    }

