package Tests;
import Pages.HomePage;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainPageTitleTest extends BaseTest{

    @Test
    public void TitleTest(){

       assertThat(homePage.getTitleText()).isEqualTo("Hands-On Selenium WebDriver with Java");
    }





}
