package org.prog.session18.steps.HomeWork18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class AlloPage {

    private WebDriver driver;

    public AlloPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loadPage() {
        driver.get("https://allo.ua/");
    }

    public void search(String text) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        webDriverWait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("search-form__input")));

        WebElement searchBox = driver.findElement(By.id("search-form__input"));
        searchBox.sendKeys(text);
        searchBox.sendKeys(Keys.RETURN);
    }

    public void printFirstPhones() {
        Actions actions = new Actions(driver);

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        webDriverWait.until(
                ExpectedConditions.presenceOfElementLocated(By.className("product-card")));


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
