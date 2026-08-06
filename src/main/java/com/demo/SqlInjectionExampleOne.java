package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SqlInjectionExampleOne {

    public ResultSet getUserByName(String username) throws Exception {
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "user", "password");

        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE username = ?"); // SECURITY-FIX: CVE-2015-7501
        stmt.setString(1, username);

        return stmt.executeQuery();
    }
}