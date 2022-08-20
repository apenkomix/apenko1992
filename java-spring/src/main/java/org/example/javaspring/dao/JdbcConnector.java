package org.example.javaspring.dao;

import org.example.javaspring.entity.Apple;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
public class JdbcConnector {
    public static final String URL = "jdbc:postgresql://localhost:5432/apenko";
    private static final String USSER = "postgres";
    private static final String PASSWORD = "docker";


    public void runQueqy() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        DriverManager.getConnection(URL, USSER, PASSWORD);
        try (Connection connection = DriverManager.getConnection(URL, USSER, PASSWORD)) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM apple_warehouse");
            List<Apple> apples = new ArrayList<>();
            while (rs.next()) {
                Apple apple = new Apple(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getLong(4), rs.getLong(5));
                apples.add(apple);
            }
            System.out.println(apples);
        }
    }
}
