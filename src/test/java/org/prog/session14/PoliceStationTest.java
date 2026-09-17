package org.prog.session14;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.prog.session6.Car;
import org.prog.session6.PoliceStation;

public class PoliceStationTest {

    private PoliceStation ps = new PoliceStation();

    @BeforeAll
    public static void setUpClass() {
        System.out.println("setUpClass Police Station");
    }

    @Test
    public void policeStationTest() {
        Car car = new Car();
        car.color = "black";
        ps.checkCar(car);
    }
}
