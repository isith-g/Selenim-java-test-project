package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GeoLocationTestPage {
    private WebDriver driver;
    private By coordinateLocator = By.id("coordinates");
    private By butttonLocator = By.id("get-coordinates");
    WebDriverWait wait;


    public GeoLocationTestPage(WebDriver driver){

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));



    }

    public void clickCoordinateButton(){
        getElement(butttonLocator).click();


    }

    public String getCoordinates(){
        clickCoordinateButton();
        System.out.println("ok");
        wait.until(ExpectedConditions.presenceOfElementLocated(coordinateLocator));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        return getElement(coordinateLocator).getText();

    }

    public WebElement getElement(By selector){

        return driver.findElement(selector);

    }

}
