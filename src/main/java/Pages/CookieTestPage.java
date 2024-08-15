package Pages;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;

import java.util.Set;

public class CookieTestPage {
    private WebDriver driver;
    private Options options;

    public CookieTestPage(WebDriver driver){
        this.driver = driver;
        options = driver.manage();

    }

    /**
     * This function is present to return the number of cookies in a web page
     * @return the integer value of the number of cookies in the web page
     */
    public int getNumberOfCookies(){
        Set<Cookie> cookies = options.getCookies();
        return cookies.size();

    }

    public Cookie getCookie(String name){
        return options.getCookieNamed(name);
    }




}
