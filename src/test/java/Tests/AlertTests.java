package Tests;

import Pages.AlertTestsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AlertTests extends BaseTest{
    private AlertTestsPage alertTestsPage;

    @BeforeMethod
    public void initialiseTest(){
        alertTestsPage = homePage.clickAlertsTestPage();
    }


    @Test
    public void alertTextTest(){

        assertThat(alertTestsPage.getAlertText()).isEqualTo("Hello world!");

    }
}
