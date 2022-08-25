package org.example.javaspring.homework_21.service;

import org.example.javaspring.homework_21.entity.Apple;
import org.example.javaspring.homework_21.converter.AppleDtoConverter;
import org.example.javaspring.homework_21.dao.JdbcConnector;
import org.example.javaspring.homework_21.dto.AppleDto;
import org.example.javaspring.homework_21.repository.AppleRepository;
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
    public List<AppleDto> getStatistics() throws SQLException,ClassNotFoundException{
        List<Apple> statistics = jdbcConnector.getStatistics();
        return statistics.stream().map(appleDtoConverter::converter).toList();
    }
}
