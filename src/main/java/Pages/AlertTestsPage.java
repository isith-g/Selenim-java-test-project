package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertTestsPage {

    private WebDriver driver;
    private By alertLocator = By.id("my-alert");
    WebDriverWait wait;

    public AlertTestsPage(WebDriver driver){

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    }

    /***
     * This function returns the alert text from the alert pop up
     * @return string value of the alert message
     */
    public String getAlertText(){

        getElement(alertLocator).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
        return alertText;

    }



    public WebElement getElement(By selector){
        return driver.findElement(selector);
    }


}
