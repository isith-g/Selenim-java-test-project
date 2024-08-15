package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.BiDiSessionStatus;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.html5.WebStorage;

import java.util.spi.LocaleServiceProvider;

public class WebStorageTestPage {
    private WebDriver driver;

    public WebStorageTestPage(WebDriver driver){

        this.driver = driver;

    }

    /**
     * function to get the session storage size of the current webpage
     * @return session storage size
     */

    public int getSessionStorageSize(){

        WebStorage webStorage = (WebStorage)driver;
        SessionStorage sessionStorage = webStorage.getSessionStorage();
        return sessionStorage.size();




    }




}
