package com.ifood.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseManager {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCLCDB", "sys as sysdba",
                    "Oradoc_db1");
        } catch (Exception error) {
            error.printStackTrace();
        }
        return connection;
    }
}
