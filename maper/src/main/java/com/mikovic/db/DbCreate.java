package com.mikovic.db;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbCreate {
    public static void createTables(Connection conn) {
        Statement statement = null;
        try {
            statement = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS clients ( id integer primary key NOT NULL AUTO_INCREMENT, first_name varchar(50) NOT NULL," +
                    "last_name varchar(50) NOT NULL, birth_date TIMESTAMP NOT NULL, description varchar(100) );";
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
