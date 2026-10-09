package org.prog.session19.steps.TestHomeWork19;

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

import java.sql.SQLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class AlloTest {

    List<PhoneDto> phoneList = new ArrayList<>();
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
    public void webTest() throws SQLException {
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
            WebElement name = product.findElement(By.className("product-card__title"));

            String id = idCode.getText();
            int goodsId = Integer.parseInt(id);
            String phoneName = name.getText();
            if (phoneName.contains("GB")) {
                phoneName = phoneName.substring(0, phoneName.indexOf("GB") + 2).trim();
            }

            String priceValue = price.getText().replace(" ", "");
            double goodsPrice = Double.parseDouble(priceValue);

            PhoneDto phone = new PhoneDto();
            phone.setGoodsId(goodsId);
            phone.setGoodsName(phoneName);
            phone.setGoodsPrice(goodsPrice);
            phoneList.add(phone);
        }

        DbStore db = new DbStore();
        db.connectToDatabase();
        db.storePhonesToDatabase(phoneList);
        db.closeConnection();
    }
}