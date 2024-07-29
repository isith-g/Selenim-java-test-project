package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ImageLoadWaitClass {

    private WebDriver driver;
    By image = By.id("compass");


    public ImageLoadWaitClass(WebDriver driver){

        this.driver = driver;


    }

    public String WaitUntilImage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement compass = wait.until(ExpectedConditions.presenceOfElementLocated(image));
        return getElement(image).getAttribute("src");

    }


    public WebElement getElement(By selector){

        return driver.findElement(image);

    }

}
