package RemoteWebDriverTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;




    public class RemoteWebdriverMainPageTitleTest {

        WebDriver driver;

        @AfterMethod
        public void teardown() {
            driver.quit();
        }

        /**
         * This test connects to lambdatest for remote webdriver execution
         * @throws MalformedURLException
         */

        @Test()
        public void testCrossBrowser() throws MalformedURLException {

            ChromeOptions browserOptions = new ChromeOptions();
            browserOptions.setPlatformName("Windows 10");
            browserOptions.setBrowserVersion("127");
            HashMap<String, Object> ltOptions = new HashMap<String, Object>();
            ltOptions.put("username", "username");
            ltOptions.put("accessKey", "key");
            ltOptions.put("project", "Untitled");
            ltOptions.put("w3c", true);
            ltOptions.put("plugin", "java-java");
            browserOptions.setCapability("LT:Options", ltOptions);

            driver =  new RemoteWebDriver(new URL("https://" + ltOptions.get("username") + ":" + ltOptions.get("accessKey")  + "@hub.lambdatest.com/wd/hub"), browserOptions);

            driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
            assertThat(driver.getTitle()).contains("Selenium WebDriver");
        }

    }

