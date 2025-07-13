package com.nicolas.project.app;

import java.sql.Connection;

import com.nicolas.project.config.MySQLConnection;

public class Main {
    public static void main(String[] args) {

        try (Connection test = MySQLConnection.getConnection()) {
            System.out.println("Connected");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}