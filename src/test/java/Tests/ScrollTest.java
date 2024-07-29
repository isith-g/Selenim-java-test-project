package Tests;

import Pages.ScrollTestPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollTest extends BaseTest {
    private ScrollTestPage scrollTestPage;

    @BeforeMethod
    public void initilializetest(){

        scrollTestPage = homePage.clickScrollTestPage();

    }

    @Test
    public void scrollTest(){
        scrollTestPage.scrollToEnd();
    }
}
