package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class MouseOverTestsPage {

    private WebDriver driver;
    Actions actions;
    By compassImg = By.xpath("//img[@src='img/compass.png']");

    public MouseOverTestsPage(WebDriver driver){
        this.driver = driver;
        actions = new Actions(driver);

    }

    /**
     *This function is used to test the mouse over image functionality of the test pahe
     * @ return a string representing the caption of the image on display
     */

    public String mouseOverToImage(){
        actions.moveToElement(findElement(compassImg)).build().perform();
        WebElement caption = driver.findElement(RelativeLocator.with(By.tagName("div")).near(compassImg));
        return caption.getText();

    }


    public WebElement findElement(By selector){

        return driver.findElement(selector);


    }




}
