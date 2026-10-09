package org.prog.session13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

//TODO: Write test that will create a phone with a color. Assert that color is black.
public class PhoneTest {


    @ParameterizedTest
    @ValueSource(strings = {"black"})

    public void testAppleColors(String color) {
        Apple phone = new Apple(color, "IPhone");
        Assertions.assertEquals("black", phone.getColor());
    }


    @ParameterizedTest
    @ValueSource(strings = {"green", "blue"})

    public void testAndroidColors(String color) {
        Android phone = new Android(color, "Samsung");
        Assertions.assertEquals("black", phone.getColor(), "Phone color is not black");
    }
}
