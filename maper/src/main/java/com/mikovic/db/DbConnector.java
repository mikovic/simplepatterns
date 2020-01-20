package com.mikovic.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbConnector {
    private static final String URL = "jdbc:mysql://localhost:3306/clinic";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "5757507";


    private static Connection connection;

    public static Connection getConnection() throws ClassNotFoundException {
        if (connection == null) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (SQLException e) {
                System.err.println("Ошибка установления соединения: " + e.getMessage());
                System.err.println("Код ошибки: " + e.getErrorCode());
            }
        }
        return connection;
    }



    public static void close() {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            System.err.println("Ошибка: " + e.getMessage());
            System.err.println("Код ошибки: " + e.getErrorCode());
        }
    }
}
