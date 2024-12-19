package com.javacrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/connecttalent";
    private static final String USER = "root";
    private static final String PASSWORD = "b69sz7F$";

    private static Connection connection;

    private DatabaseConnection() {

    }

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            //using synchronized, it ensures thread safety
            synchronized (DatabaseConnection.class) {
                if (connection == null || connection.isClosed()) {
                    connection = DriverManager.getConnection(URL, USER, PASSWORD);
                    System.out.println("Database Connection Created");
                }
            }
        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
            System.out.println("Database connection closed");
        }
    }

};
