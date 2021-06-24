package dev.ranieri.runners;

import dev.ranieri.pages.WikiHomePage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "dev.ranieri.steps")
public class BasicRunner {

    public static WebDriver driver = null;
    public static WikiHomePage wikiHomePage = null;

    @BeforeClass
    public static void setup() {
        File file = new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();// ChomeDriver is an implementation of a web driver interface
        wikiHomePage = new WikiHomePage(driver);// pass the driver into any poms that you need
    }

    @AfterClass
    public static void teardown(){
        driver.quit();
    }


}
