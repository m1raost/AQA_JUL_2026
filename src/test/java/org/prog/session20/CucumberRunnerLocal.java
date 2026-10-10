package org.prog.session20;

import org.prog.util.DbConfig;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.prog.session16.page.GooglePage;
import org.prog.session20.steps.DBSteps;
import org.prog.session20.steps.DataHolder;
import org.prog.session20.steps.WebSteps;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.URL;
import java.sql.DriverManager;

@CucumberOptions(
        glue = "org.prog.session20.steps",
        features = "src/test/resources/features",
        plugin = {"pretty", "html:target/report.html"}
)
public class CucumberRunnerLocal extends AbstractTestNGCucumberTests {

    private WebDriver driver;

    @SneakyThrows
    @BeforeSuite
    public void connectToDB() {
        DBSteps.connection = DbConfig.connect("jdbc:mysql://localhost:3306/db");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        WebSteps.googlePage = new GooglePage(driver);
    }

    @AfterMethod
    public void quitDriver() {
        DataHolder.data.clear();
    }

    @AfterSuite
    public void closeBrowser() {
        driver.quit();
    }

    @SneakyThrows
    @AfterSuite
    public void closeDB() {
        if (DBSteps.connection != null) {
            DBSteps.connection.close();
        }
    }
}
