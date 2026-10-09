package TestHomeWork16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AlloTestPOM {
    
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    public AlloTestPOM(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        this.actions = new Actions(driver);
    }

    public void goToPage() {
        driver.get("https://allo.ua/");
    }

    public void searchForProduct(String productName) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search-form__input")));
        WebElement searchBox = driver.findElement(By.id("search-form__input"));
        searchBox.sendKeys(productName);
        searchBox.sendKeys(Keys.RETURN);
    }

    public List<WebElement> getProducts() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("product-card")));
        return driver.findElements(By.className("product-card"));
    }

    public void printProductDetails(WebElement product, int index) {
        actions.moveToElement(product).perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("product-sku__value")));

        WebElement idCode = product.findElement(By.className("product-sku__value"));
        WebElement price = product.findElement(By.className("sum"));

        System.out.println("Phone " + (index + 1) + " - ID: " + idCode.getText() + ", Price is: " + price.getText());
    }
}
