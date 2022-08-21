package org.example.javaspring.service;

import org.example.javaspring.converter.AppleDtoConverter;
import org.example.javaspring.dao.JdbcConnector;
import org.example.javaspring.dto.AppleDto;
import org.example.javaspring.entity.Apple;
import org.example.javaspring.repository.AppleRepository;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class AppleService {
    private final JdbcConnector jdbcConnector;
    private final AppleRepository appleRepository;
    private final AppleDtoConverter appleDtoConverter;

    public AppleService(JdbcConnector jdbcConnector, AppleRepository appleRepository, AppleDtoConverter appleDtoConverter) {
        this.jdbcConnector = jdbcConnector;
        this.appleRepository = appleRepository;
        this.appleDtoConverter = appleDtoConverter;
    }
    public AppleDto getById(Long id){
        Apple apple = appleRepository.getById(id);
        return appleDtoConverter.converter(apple);

    }

    public List<AppleDto> getAllApples() throws SQLException, ClassNotFoundException {
        List<Apple> allApples = jdbcConnector.getAll();
     return  allApples.stream().map(appleDtoConverter::converter).toList();
    }
}
