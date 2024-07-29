package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {

    WebDriver driver;
    By draggableObject = By.id("draggable");
    By target = By.id("target");
    Actions action;


    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
        action = new Actions(driver);
    }

    public Point[] DragElement(){
        Point[] locations = new Point[2];
        action.dragAndDrop(getElement(draggableObject),getElement(target)).build().perform();
        locations[0] = getElement(draggableObject).getLocation();
        locations[1] = getElement(target).getLocation();
        return locations;


    }

    public WebElement getElement(By selector){
        return driver.findElement(selector) ;

    }

}
