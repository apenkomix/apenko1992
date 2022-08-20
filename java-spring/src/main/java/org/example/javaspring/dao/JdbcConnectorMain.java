package org.example.javaspring.dao;

import java.sql.SQLException;

public class JdbcConnectorMain {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JdbcConnector connector = new JdbcConnector();
        connector.runQueqy();
    }
}
