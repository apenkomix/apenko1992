package org.example.javaspring.homework_22.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServerService {

    @Value("${pingwit.server.name}")
    private String serverName;

    public String getName(){
        return serverName;
    }

}
