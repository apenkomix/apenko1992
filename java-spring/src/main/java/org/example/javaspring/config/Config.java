package org.example.javaspring.config;

import org.example.javaspring.converter.AppleDtoConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public AppleDtoConverter appleDtoConverter(){
        return new AppleDtoConverter();
    }
}
