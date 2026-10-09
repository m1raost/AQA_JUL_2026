package org.prog.session19.steps.TestHomeWork19;

import io.cucumber.java.en.Then;
import org.prog.session19.steps.DBSteps;
import org.prog.session19.steps.DataHolder;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AlloDbSteps {


    @Then("I check {string} goods in database")
    public void checkGoodsInDb(String alias) throws SQLException {

        List<PhoneDto> phoneList = (List<PhoneDto>) DataHolder.data.get(alias);

        for (PhoneDto phone : phoneList) {
            PreparedStatement preparedStatement = DBSteps.connection.prepareStatement(
                    "SELECT * FROM Phones WHERE goodsName = ?");
            preparedStatement.setString(1, phone.getGoodsName());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                double dbPrice = resultSet.getDouble("goodsPrice");
                double sitePrice = phone.getGoodsPrice();

                if (dbPrice != sitePrice) {
                    PreparedStatement updateStmt = DBSteps.connection.prepareStatement(
                            "UPDATE Phones SET goodsPrice = ? WHERE goodsName = ?");
                    updateStmt.setDouble(1, sitePrice);
                    updateStmt.setString(2, phone.getGoodsName());
                    updateStmt.execute();
                    System.out.println(phone.getGoodsName() + " - price changed, updated");
                } else {
                    System.out.println(phone.getGoodsName() + " - price is the same");
                }
            } else {

                PreparedStatement stmt = DBSteps.connection.prepareStatement(
                        "INSERT INTO Phones (goodsId, goodsName, goodsPrice) VALUES (?, ?, ?)");
                stmt.setInt(1, phone.getGoodsId());
                stmt.setString(2, phone.getGoodsName());
                stmt.setDouble(3, phone.getGoodsPrice());
                stmt.execute();
                System.out.println(phone.getGoodsName() + " - NOT in DB, saved");
            }
        }
    }
}



