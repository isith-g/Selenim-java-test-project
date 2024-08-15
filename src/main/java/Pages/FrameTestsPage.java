package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FrameTestsPage {

    private WebDriver driver;
    private By paragraphLocator = By.tagName("p");

    public FrameTestsPage(WebDriver driver){

        this.driver = driver;

    }

    /**
     * This function retruns the number of paragraphs in a web Frame
     * @return An integer value containing the number of paragraphs in the webframe
     */
    public int  getNumberOfParagraphsInFrame(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String frameName = "frame-body";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name(frameName)));
        driver.switchTo().frame(frameName);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(paragraphLocator,0));
        List<WebElement> paragraphs = getElement(paragraphLocator);
        return paragraphs.size();


    }


    public List<WebElement> getElement(By selector){
        return driver.findElements(selector);

    }

}
