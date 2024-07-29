package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Class Homepage to Represent elements of the HomePage in AUT
 */

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver = driver;

    }

    /**
     * Method to get the Title of the homePage
     * @return
     */
    public String getTitleText(){

        return driver.getTitle();

    }

    /**
     * Method to click webform element of the homePage
     * @return an Object of class WebForm
     */
    public WebForm clickWebForm(){
        clickLink("Web form");
        return new WebForm(driver);


    }

    public Navigation clickNavigationLink(){
        clickLink("Navigation");
        return new Navigation(driver);
    }

    public MouseClicksPage clickMouseClicksPage(){
        clickLink("Dropdown menu");
        return new MouseClicksPage(driver);
    }

    public MouseOverTestsPage clickMouseOverPage(){
        clickLink("Mouse over");
        return new MouseOverTestsPage(driver);
    }

    public DragAndDropPage clickDragAndDropPage(){
        clickLink("Drag and drop");
        return new DragAndDropPage(driver);

    }

    public ImageLoadWaitClass clickImageLoadWait(){
        clickLink("Loading images");
        return  new ImageLoadWaitClass(driver);
    }

    public ScrollTestPage clickScrollTestPage(){
        clickLink("Long page");
        return  new ScrollTestPage(driver);

    }


    /**
     * Helper method to click Links in the HomePage
     * @param linkText of type String representing the link to click
     */
    private void clickLink(String linkText){

        driver.findElement(By.linkText(linkText)).click();


    }




}
