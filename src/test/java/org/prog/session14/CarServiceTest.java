package org.prog.session14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.prog.session6.Car;
import org.prog.session6.CarService;

public class CarServiceTest {

    private CarService carService = new CarService();

    @BeforeAll
    public static void setUpClass() {
        System.out.println("setUpClass Car Service");
    }

    @Test
    public void carPaintTest(){
        Car car = new Car();
        carService.paintCar(car, "green");
        Assertions.assertEquals(car.color, "green");
    }
}
