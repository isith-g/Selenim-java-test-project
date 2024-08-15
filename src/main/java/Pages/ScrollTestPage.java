package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ScrollTestPage {

    private WebDriver driver;
    private By lastParagraph = By.cssSelector("p:last-child");

    public ScrollTestPage(WebDriver driver){

        this.driver = driver;

    }

    /**
     * This function is present to scroll a web page until it ends using js execution
     *
     */

    public void scrollToEnd(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String script = "arguments[0].scrollIntoView();";
        js.executeScript(script, getElement(lastParagraph));




    }

    public WebElement getElement(By locator){

        WebElement element = driver.findElement(locator);
        return element;



    }


}
