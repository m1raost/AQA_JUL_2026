package org.prog.session15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

// TODO: Go to allo.ua, search for IPhone, find and print id and price for first 3 phones
public class AlloFindElements {

    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

    @Test
    public void webTest() {
        driver.get("https://allo.ua/");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        webDriverWait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("search-form__input")));
        WebElement searchBox = driver.findElement(By.id("search-form__input"));
        searchBox.sendKeys("IPhone 16 Pro Max");
        searchBox.sendKeys(Keys.RETURN);

        webDriverWait.until(
                ExpectedConditions.presenceOfElementLocated(By.className("product-card")));

        Actions actions = new Actions(driver);


        List<WebElement> phonePic = driver.findElements(By.className("product-card"));
        for (int i = 0; i < 3; i++) {

            WebElement product = phonePic.get(i);
            actions.moveToElement(product).perform();

            webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("product-sku__value")));

            WebElement idCode = product.findElement(By.className("product-sku__value"));
            WebElement price = product.findElement(By.className("sum"));

            System.out.println("Phone " + (i + 1) + " - ID: " + idCode.getText() + ", Price is: " + price.getText());

        }

    }


}
