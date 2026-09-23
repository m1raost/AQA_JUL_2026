package TestHomeWork16;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;


public class AlloTest {

    private WebDriver driver;
    private AlloTestPOM pom;

    @BeforeSuite
    public void beforeSuite() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        pom = new AlloTestPOM(driver);
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

    @Test
    public void webTest() {
        pom.goToPage();
        pom.searchForProduct("IPhone 16 Pro Max");

        List<WebElement> phonePic = pom.getProducts();
        for (int i = 0; i < 3; i++) {
            pom.printProductDetails(phonePic.get(i), i);
        }
    }
}