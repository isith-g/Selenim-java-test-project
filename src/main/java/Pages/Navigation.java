package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigation {

    private WebDriver driver;
    private By pageNavigation = By.linkText("2");
    private By paragraphElemen = By.className("lead");

    public Navigation(WebDriver driver){

        this.driver = driver;


    }

    public String clickPageLink(){

        WebElement link = getElement(pageNavigation);
        link.click();
        WebElement paragraph = getElement(paragraphElemen);
        return paragraph.getText();

    }

    public WebElement getElement(By selctor){

        return driver.findElement(selctor);

    }





}
