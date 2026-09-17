package org.prog.session14.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

//TODO: load allo.ua and search for iphone

public class WebTest {

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
    public void webTest1() {
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        List<WebElement> cookies = driver.findElements(By.id("L2AGLb"));
        if (cookies.size() > 0) {
            cookies.get(0).click();
        }
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("hello selenium!");
//        search.sendKeys(Keys.ENTER);
        Assert.assertTrue(search.getAttribute("value").equals("hello selenium!"));
    }
//
//    @Test
//    public void webTest2() {
//        driver.manage().window().maximize();
//        driver.get("http://www.amazon.com");
//    }
//
//    @Test
//    public void webTest3() {
//        driver.manage().window().maximize();
//        driver.get("https://www.cloudflare.com/");
//    }
}
