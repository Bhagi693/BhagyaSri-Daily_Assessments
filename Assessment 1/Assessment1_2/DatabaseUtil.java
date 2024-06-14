package com.example.studentcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; // Adjust your connection string
    private static final String USER = "system"; // Replace with your DB username
    private static final String PASSWORD = "Bhagi"; // Replace with your DB password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
