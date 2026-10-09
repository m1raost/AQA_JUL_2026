package org.prog.session14;
//TODO: load allo.ua and search for iphone

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import java.util.List;

public class AlloTest {
    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(1000);
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }


    @Test
    public void webTest() {
        driver.get("https://allo.ua/");
        WebElement searchBox = driver.findElement(By.id("search-form__input"));
        searchBox.sendKeys("IPhone 17 Pro Max");
        WebElement submitButton = driver.findElement(By.className("search-form__submit-button-text"));
        submitButton.click();
        List<WebElement> products = driver.findElements(By.className("product-card"));
        Assertions.assertTrue(!products.isEmpty(), "Products are displayed after search");

    }
}
