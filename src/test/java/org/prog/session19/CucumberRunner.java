package org.prog.session19;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.prog.session16.page.GooglePage;
import org.prog.session19.steps.DBSteps;
import org.prog.session19.steps.DataHolder;
import org.prog.session19.steps.TestHomeWork19.AlloPage;
import org.prog.session19.steps.TestHomeWork19.AlloSteps;
import org.prog.session19.steps.WebSteps;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.sql.DriverManager;

@CucumberOptions(
        glue = "org.prog.session19.steps",
        features = "src/test/resources/features",
        tags = "@allo",
        plugin = {"pretty", "html:target/report.html"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    private WebDriver driver;

    @SneakyThrows
    @BeforeSuite
    public void connectToDB() {
        DBSteps.connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db",
                "root",
                "password");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        WebSteps.googlePage = new GooglePage(driver);
        AlloSteps.alloPage = new AlloPage(driver);
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
