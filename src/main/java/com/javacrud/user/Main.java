package com.javacrud.user;

import com.javacrud.DatabaseConnection;

import java.sql.SQLException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(new Date());
            UserDao.createUser("John Doe1", "johndoe123@gmail.com");
            System.out.println(new Date());
            UserDao.readUsers();
            System.out.println(new Date());
        } catch (SQLException e) {
            System.out.println("Exception at SQL");
        } finally {
            try {
                DatabaseConnection.closeConnection();
            } catch (SQLException e) {
                System.out.println("Exception during closing connection");
            }
        }
    }
}
