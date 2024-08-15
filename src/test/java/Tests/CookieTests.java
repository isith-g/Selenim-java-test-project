package Tests;

import Pages.CookieTestPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CookieTests extends BaseTest{
    private CookieTestPage cookieTestPage;

    @BeforeMethod
    public void initializeTest(){
        cookieTestPage = homePage.clickCookieTestPage();
    }

    @Test
    public void cookieTests(){
        assertThat(cookieTestPage.getNumberOfCookies()).isEqualTo(2);
        assertThat(cookieTestPage.getCookie("username").getValue()).isEqualTo("John Doe");
        assertThat(cookieTestPage.getCookie("username").getPath()).isEqualTo("/");
    }
}
