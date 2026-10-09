package org.prog.session19.steps.TestHomeWork19;

import java.sql.*;
import java.util.List;

public class DbStore {
    private Connection connection;

    public void connectToDatabase() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/db";
        String user = "root";
        String password = "password";
        connection = DriverManager.getConnection(url, user, password);
    }

    public void storePhonesToDatabase(List<PhoneDto> phoneList) throws SQLException {
        String sql = "INSERT INTO Phones (goodsId, goodsName, goodsPrice) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            for (PhoneDto phone : phoneList) {
                stmt.setInt(1, phone.getGoodsId());
                stmt.setString(2, phone.getGoodsName());
                stmt.setDouble(3, phone.getGoodsPrice());
                stmt.executeUpdate();
            }
        }
    }

    public void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}