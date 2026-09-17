package org.prog.session14;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG2 {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("=============BEFORE ALL TESTS==============");
    }

    @Test
    public void myNgTest3() {
        System.out.println("myNgTest 3");
    }

    @Test
    public void myNgTest4() {
        System.out.println("myNgTest 4");
    }

    @Test(dataProvider = "myProvider")
    public void myNgTest5(String color, String secondColor) {
        System.out.println(color + " : " + secondColor);
    }

    @DataProvider
    public Object[][] myProvider() {
        return new Object[][]{
                {"green", "green"},
                {"black", "white"},
                {"white", "yellow"},
                {"red", "teal"},
                {"blue", "purple"},
        };
    }
}
