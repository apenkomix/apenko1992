package org.example.javaspring.homework_21.controller;

import org.example.javaspring.homework_21.dto.AppleDto;
import org.example.javaspring.homework_21.service.AppleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping ("/apple")
public class AppleController {
    private final AppleService appleService;

    public AppleController(AppleService appleService) {
        this.appleService = appleService;
    }
    @GetMapping("/get")
    AppleDto getApple(@RequestParam Long id){
        return appleService.getById(id);
    }
    @GetMapping("/getAll")
    public List<AppleDto> getAllApples() throws SQLException, ClassNotFoundException {
        return appleService.getAllApples();
    }
    @GetMapping("/getStatistics")
    public List<AppleDto> getStatistics() throws SQLException,ClassNotFoundException{
        return appleService.getStatistics();
    }
}
