package org.example.javaspring.homework_21.config;

import org.example.javaspring.homework_21.converter.AppleDtoConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public AppleDtoConverter appleDtoConverter(){
        return new AppleDtoConverter();
    }
}
