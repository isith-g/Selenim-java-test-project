package Tests;

import Pages.MouseClicksPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MouseClickTests extends BaseTest {

    private MouseClicksPage mouseClickPage;

    @BeforeMethod
    public void initializeTest(){
        mouseClickPage = homePage.clickMouseClicksPage();
    }

    @Test
    public void testLeftClick(){
        assertThat(mouseClickPage.clickOnLeftClickMenu()).isTrue();
    }

    @Test
    public void testRightClick(){
        assertThat(mouseClickPage.clickOnRightClickMenu()).isTrue();
    }


}
