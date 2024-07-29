package Tests;

import Pages.MouseOverTestsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MouseOverTests extends BaseTest {

    private MouseOverTestsPage mouseOverTestsPage;

    @BeforeMethod
    public void initializeTest(){
        mouseOverTestsPage = homePage.clickMouseOverPage();

    }

    @Test
    public void checkMouseOverDescription(){
        assertThat(mouseOverTestsPage.mouseOverToImage()).containsIgnoringCase("Compass");
    }
}
