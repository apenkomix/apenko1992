package homework_20.task_1;

import homework_20.task_1.JdbcConnector;

import java.sql.SQLException;

public class JdbcConnectorMain {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JdbcConnector connector = new JdbcConnector();
        connector.runQueqy();
    }
}
