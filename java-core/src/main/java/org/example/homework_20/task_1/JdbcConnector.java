package homework_20.task_1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcConnector {
    public static final String URL = "jdbc:postgresql://localhost:5432/apenko";
    private static final String USSER = "postgres";
    private static final String PASSWORD = "docker";
    private static final String SELECT_BY_TICKER = "SELECT * FROM stock WHERE stock.ticker like = ? ";

    public void runQueqy() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        DriverManager.getConnection(URL, USSER, PASSWORD);
        try (Connection connection = DriverManager.getConnection(URL, USSER, PASSWORD)) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM stock WHERE ticker like 'A%'");
//            Statement statement = connection.createStatement();
//            Statement statement1 = connection.createStatement();
//            ResultSet rs = statement.executeQuery("SELECT * FROM stock limit 16 offset 14");
//            ResultSet rs1 = statement1.executeQuery("SELECT * FROM stock limit 15 offset 0");
            List<Stock> stocks = new ArrayList<>();
            while (rs.next()) {
                Stock stock = new Stock(rs.getLong(1), rs.getString(2), rs.getString(3),
                        rs.getLong(4), rs.getString(5), rs.getString(6));
                stocks.add(stock);
            }
//            while (rs1.next()) {
//                Stock stock1 = new Stock(rs1.getLong(1), rs1.getString(2), rs1.getString(3),
//                        rs1.getLong(4), rs1.getString(5), rs1.getString(6));
//                stocks.add(stock1);
            stocks.forEach(System.out::println);
        }
    }
}
