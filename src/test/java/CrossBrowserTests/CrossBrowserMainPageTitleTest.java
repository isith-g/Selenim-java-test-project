package CrossBrowserTests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;


public class CrossBrowserMainPageTitleTest {

    WebDriver driver;

    /**
     * Data provider for cross-browser testing
     * @return abject containing browserNames for cross-browser testing
     */
    @DataProvider(name = "browsers")
    public static Object[][] data() {
        return new Object[][] { { "chrome" }, { "edge" }, { "firefox" } };
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    /**
     * This test carries out a cross-browser test according to the browsers defined in the dataProvider class
     * @param browserName
     *
     */

    @Test(dataProvider = "browsers")
    public void testCrossBrowser(String browserName){


        driver = WebDriverManager.getInstance(browserName).create();

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        assertThat(driver.getTitle()).contains("Selenium WebDriver");
    }







}
