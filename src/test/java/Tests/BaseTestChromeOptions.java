package Tests;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.HashMap;
import java.util.Map;

public class BaseTestChromeOptions {
    protected WebDriver driverWithOptions;
    protected HomePage homePageWithOptions;

    @BeforeClass

    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 1);
        options.setExperimentalOption("prefs", prefs);

        driverWithOptions = WebDriverManager.chromedriver().capabilities(options).create();
        driverWithOptions.get("https://bonigarcia.dev/selenium-webdriver-java/");

    }

    @AfterClass
    public void tearDown(){
        driverWithOptions.quit();
    }
}
