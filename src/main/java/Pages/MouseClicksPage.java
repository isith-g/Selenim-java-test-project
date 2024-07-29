package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseClicksPage {

    private WebDriver driver;
    private By leftClickButton = By.id("my-dropdown-1");
    private By leftClickDropDown = By.cssSelector("ul.dropdown-menu.show");
    private By rightClickButton = By.id("my-dropdown-2");
    private By rightClickButtonDropDown = By.id("context-menu-2");
    Actions actions;

    public MouseClicksPage(WebDriver driver){

        this.driver = driver;
        actions = new Actions(driver);

    }

    public boolean clickOnLeftClickMenu(){
        getElement(leftClickButton).click();
        WebElement leftClickMenu = getElement(leftClickDropDown);
        return leftClickMenu.isDisplayed();

    }

    public boolean clickOnRightClickMenu(){
        actions.contextClick(getElement(rightClickButton)).build().perform();
        WebElement rightClickMenu = getElement(rightClickButtonDropDown);
        return rightClickMenu.isDisplayed();
    }

    public WebElement getElement(By selector){
        WebElement element = driver.findElement(selector);
        return element;
    }







}
