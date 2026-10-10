package org.prog.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Database connection settings, read from environment variables:
 * DB_URL (optional), DB_USER (optional, default "root"), DB_PASSWORD (required).
 */
public class DbConfig {

    public static Connection connect(String defaultUrl) throws SQLException {
        String url = getOrDefault("DB_URL", defaultUrl);
        String user = getOrDefault("DB_USER", "root");
        String password = System.getenv("DB_PASSWORD");
        if (password == null) {
            throw new IllegalStateException("Environment variable DB_PASSWORD is not set (see .env.example)");
        }
        return DriverManager.getConnection(url, user, password);
    }

    private static String getOrDefault(String name, String defaultValue) {
        String value = System.getenv(name);
        return value == null || value.isBlank() ? defaultValue : value;
    }
}
