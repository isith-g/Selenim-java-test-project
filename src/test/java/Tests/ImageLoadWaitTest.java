package Tests;

import Pages.ImageLoadWaitClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ImageLoadWaitTest extends BaseTest {

    private ImageLoadWaitClass imageLoadWaitClass;

    @BeforeMethod
    public void initializeTest(){
        imageLoadWaitClass = homePage.clickImageLoadWait();
    }

    @Test
    public void imageLoadTest(){
        assertThat(imageLoadWaitClass.WaitUntilImage()).containsIgnoringCase("compass");
    }
}
