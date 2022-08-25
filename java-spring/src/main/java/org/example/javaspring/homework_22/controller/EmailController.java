package org.example.javaspring.homework_22.controller;

import org.example.javaspring.homework_22.dto.EmailDto;
import org.example.javaspring.homework_22.service.PingwitEmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {
    private final PingwitEmailService emailService;

    public EmailController(PingwitEmailService pingwitEmailService) {
        this.emailService = pingwitEmailService;
    }

    @PostMapping("/send")
    public boolean sendEmail(@RequestBody EmailDto emailDto){
        return emailService.send(emailDto);

    }
}
