package org.example.javaspring.homework_22.controller;

import org.example.javaspring.homework_22.service.ServerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ServiceController {
    private final ServerService serverService;

    public ServiceController(ServerService serverService) {
        this.serverService = serverService;
    }

    @GetMapping("/name")
    public String getName(){
        return serverService.getName();
    }
}
