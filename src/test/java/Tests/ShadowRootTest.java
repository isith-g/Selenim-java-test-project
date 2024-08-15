package Tests;

import Pages.ShadowDomTestPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShadowRootTest extends BaseTest {

    private ShadowDomTestPage scrollTest;

    @BeforeMethod
    public void initializeTest(){

        scrollTest = homePage.clickShadowDomTestPage();

    }

    @Test
    public void test(){
        assertThat(scrollTest.getShadowDomText()).contains("Hello Shadow DOM");

    }

}
