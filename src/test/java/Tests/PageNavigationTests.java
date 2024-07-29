package Tests;

import Pages.Navigation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.assertj.core.api.Assertions.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PageNavigationTests extends BaseTest{

    private Navigation navigation;

    @BeforeMethod
    public void initializeTest(){

       navigation =  homePage.clickNavigationLink();

    }

    @Test
    public void PageNaviagtionTest(){
        assertThat(navigation.clickPageLink()).isEqualTo("Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
    }

}
