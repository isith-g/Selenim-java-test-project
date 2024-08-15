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
    /**
     * Method to click Navigation Link element of the homePage
     * @return an Object of class Navigation
     */
    public Navigation clickNavigationLink(){
        clickLink("Navigation");
        return new Navigation(driver);
    }
    /**
     * Method to click Dropdown menu element of the homePage
     * @return an Object of class MouseClickPage
     */
    public MouseClicksPage clickMouseClicksPage(){
        clickLink("Dropdown menu");
        return new MouseClicksPage(driver);
    }
    /**
     * Method to click mouse over element of the homePage
     * @return an Object of class WebForm
     */

    public MouseOverTestsPage clickMouseOverPage(){
        clickLink("Mouse over");
        return new MouseOverTestsPage(driver);
    }
    /**
     * Method to click Drag and drop element of the homePage
     * @return an Object of class WebForm
     */
    public DragAndDropPage clickDragAndDropPage(){
        clickLink("Drag and drop");
        return new DragAndDropPage(driver);

    }
    /**
     * Method to click Loading images element of the homePage
     * @return an Object of class ImageLoadWaitClass
     */
    public ImageLoadWaitClass clickImageLoadWait(){
        clickLink("Loading images");
        return  new ImageLoadWaitClass(driver);
    }
    /**
     * Method to click Long page element of the homePage
     * @return an Object of class ScrollTestPage
     */
    public ScrollTestPage clickScrollTestPage(){
        clickLink("Long page");
        return  new ScrollTestPage(driver);

    }
    /**
     * Method to click Shadow DOM element of the homePage
     * @return an Object of class ShadowDomTestPage
     */
    public ShadowDomTestPage clickShadowDomTestPage(){
        clickLink("Shadow DOM");
        return new ShadowDomTestPage(driver);

    }
    /**
     * Method to click  Cookies element of the homePage
     * @return an Object of class CookieTestPage
     */
    public CookieTestPage clickCookieTestPage(){
        clickLink("Cookies");
        return new CookieTestPage(driver);

    }
    /**
     * Method to click Frame element of the homePage
     * @return an Object of class FrameTestPage
     */

    public FrameTestsPage clickFrameTestPage(){
        clickLink("Frames");
        return new FrameTestsPage(driver);

    }
    /**
     * Method to click Dialog boxes element of the homePage
     * @return an Object of class AlertsTestsPage
     */

    public AlertTestsPage clickAlertsTestPage(){
        clickLink("Dialog boxes");
        return new AlertTestsPage(driver);
    }
    /**
     * Method to click Web Storage element of the homePage
     * @return an Object of class WebStorageTestPage
     */

    public WebStorageTestPage clickWebStorageTestPage(){
        clickLink("Web storage");
        return new WebStorageTestPage(driver);

    }

    /**
     * Method to click webform element of the homePage
     * @return an Object of class GeoLocationTestPage
     */

    public GeoLocationTestPage clickGeoLocationPage(){
        clickLink("Geolocation");
        return new GeoLocationTestPage(driver);

    }



    /**
     * Helper method to click Links in the HomePage
     * @param linkText of type String representing the link to click
     */
    private void clickLink(String linkText){

        driver.findElement(By.linkText(linkText)).click();


    }




}
