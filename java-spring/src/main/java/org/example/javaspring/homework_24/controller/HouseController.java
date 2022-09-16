package org.example.javaspring.homework_24.controller;

import org.example.javaspring.homework_24.dto.HouseDto;
import org.example.javaspring.homework_24.entity.HouseType;
import org.example.javaspring.homework_24.service.HouseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/house")
public class HouseController {
    private final HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }
    @PostMapping("/save")
    public long save(@RequestBody HouseDto houseDto){
        return houseService.save(houseDto);
    }

    @PutMapping("/update")
    public long update(@RequestBody HouseDto houseDto){
        return houseService.update(houseDto);
    }
    @GetMapping("/search/type/{houseType}")
    public List<HouseDto> findAllByType(@PathVariable HouseType houseType){
        return houseService.findAllByType(houseType);
    }
    @GetMapping("/search/id")
    public List<HouseDto> findAllById(@RequestParam List<Long> id){
        return houseService.findAllById(id);
    }
    @GetMapping("/search/floor/{number}")
    public List<HouseDto> findAllByFloorGreaterThenEqualOrderByIdDesc(@PathVariable int number){
        return houseService.findAllByFloorGreaterThenEqualOrderByIdDesc(number);
    }
    @GetMapping("/{id}")
    public HouseDto findById(@PathVariable Long id){
        return houseService.getById(id);
    }
}
