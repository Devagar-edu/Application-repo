package com.example.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlInjectionExampleOne {

    public ResultSet getUserByName(String username) throws Exception {
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "user", "password");

        Statement stmt = conn.createStatement();

        // SQL injection vulnerability: user input concatenated directly into query
        String query = "SELECT * FROM users WHERE username = '" + username + "'";

        return stmt.executeQuery(query);
    }
}