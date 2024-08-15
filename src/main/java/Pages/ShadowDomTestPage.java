package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShadowDomTestPage {

    private WebDriver driver;
    private By ShadowHost = By.id("content");
    private By shadowRootContentSelector = By.cssSelector("p");

    public ShadowDomTestPage(WebDriver driver){

        this.driver = driver;

    }

    /**
     * This function is present to interact with the shadow dom
     * @return a text string from the shadow dom elements
     *
     */

    public String getShadowDomText(){

        SearchContext shadowRoot = getElement(ShadowHost).getShadowRoot();
        WebElement shadowRootElement = shadowRoot.findElement(shadowRootContentSelector);
        return shadowRootElement.getText();




    }

    public WebElement getElement(By selector){

        return driver.findElement(selector);

    }


}
