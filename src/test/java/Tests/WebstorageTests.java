package Tests;

import Pages.WebStorageTestPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebstorageTests extends BaseTest{
    private WebStorageTestPage webStorageTestPage;

    @BeforeMethod
    public void initialize(){
         webStorageTestPage = homePage.clickWebStorageTestPage();

    }

    @Test
    public void testWebStorage(){
        assertThat(webStorageTestPage.getSessionStorageSize()).isEqualTo(2);
    }


}
