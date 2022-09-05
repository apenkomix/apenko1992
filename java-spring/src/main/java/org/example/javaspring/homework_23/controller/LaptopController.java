package org.example.javaspring.homework_23.controller;

import org.example.javaspring.homework_23.dto.LaptopDto;
import org.example.javaspring.homework_23.service.LaptopService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/laptop")
public class LaptopController {
    private final LaptopService laptopService;

    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }
    @RequestMapping("/save")
    public long save(@RequestBody LaptopDto laptopDto){
      return laptopService.save(laptopDto);
    }

}
