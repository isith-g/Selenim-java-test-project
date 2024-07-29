package Tests;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;

    /**
     * Before class method to initialize the test
     */
    @BeforeClass
    public void setUp(){

        driver = WebDriverManager.chromedriver().create();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        homePage = new HomePage(driver);





    }

    /**
     * After class method for test tearDown
     */
    @AfterClass
    public void tearDown(){
        driver.quit();
    }




}
