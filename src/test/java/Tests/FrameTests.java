package Tests;

import Pages.FrameTestsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FrameTests extends BaseTest{
    private FrameTestsPage frameTestsPage;

    @BeforeMethod
    public void inilialize(){
        frameTestsPage = homePage.clickFrameTestPage();
    }

    @Test
    public void frameTest(){
        assertThat(frameTestsPage.getNumberOfParagraphsInFrame()).isEqualTo(20);
    }
}
