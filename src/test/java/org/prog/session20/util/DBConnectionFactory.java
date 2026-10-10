package org.prog.session20.util;

import org.prog.util.DbConfig;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionFactory {

    @SneakyThrows
    public static Connection getConnection() {
        String envType = System.getProperty("envType", "jenkins");
        if ("jenkins".equals(envType)) {
            return DbConfig.connect("jdbc:mysql://mysql-db-1:3306/db");
        } else {
            return DbConfig.connect("jdbc:mysql://localhost:3306/db");
        }
    }
}
