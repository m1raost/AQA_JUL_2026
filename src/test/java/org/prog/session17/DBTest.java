package org.prog.session17;

import io.restassured.RestAssured;
import lombok.SneakyThrows;
import org.prog.session17.dto.PersonDto;
import org.prog.session17.dto.ResultsDto;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.List;

//TODO: Create table Phones (with DBeaver)
//TODO: using existing test store goods_name + goods_id + goods_price in DB.

public class DBTest {

    //        String.format(sqlInsert, "abc", "efg");
    private String insertSQL =
            "INSERT INTO Persons (FirstName, LastName, Gender, Title, Nat) VALUES (?, ?, ?, ?, ?)";

    private Connection conn;

    @SneakyThrows
    @BeforeSuite
    public void connectDB() {
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db",
                "root",
                "password");
    }

    @SneakyThrows
    @AfterMethod
    public void closeDB() {
        if (conn != null) {
            conn.close();
        }
    }

    @SneakyThrows
    @Test
    public void DBTest() {
        List<PersonDto> personDtoList = getRandomPeople(100).getResults();

        PreparedStatement stmt = conn.prepareStatement(insertSQL);
        for (PersonDto personDto : personDtoList) {
            try {
                stmt.setString(1, personDto.getName().getFirst());
                stmt.setString(2, personDto.getName().getLast());
                stmt.setString(3, personDto.getGender());
                stmt.setString(4, personDto.getName().getTitle());
                stmt.setString(5, personDto.getNat());
                stmt.execute();
            } catch (SQLException ex) {
                System.out.println("Failed to save person: " + personDto);
            }
        }
    }

    @Test
    public void DBTest2() throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Persons");
        while (rs.next()) {
            System.out.println(rs.getString("FirstName")
                    + rs.getString("LastName"));
        }
    }

    private ResultsDto getRandomPeople(int amount) {
        return RestAssured.given()
                .baseUri("https://randomuser.me/")
                .basePath("/api")
                .header("Accept", "application/json")
                .queryParam("inc", "gender,nat,name")
                .queryParam("noinfo")
                .queryParam("results", amount)
                .get()
                .as(ResultsDto.class);
    }
}
