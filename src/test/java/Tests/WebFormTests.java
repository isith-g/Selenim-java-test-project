package Tests;
import Pages.WebForm;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Class WebForm Tests to test elements of Page WebFrom in AUT
 */
public class WebFormTests extends BaseTest {

    private WebForm form;

    /**
     * Before Method annotated method to click the WebFrom link before every test
     */
    @BeforeMethod
    public void ClickLink(){

        form =  homePage.clickWebForm();

    }

    /**
     * Method to test the number of rows in the TextArea element
     */
    @Test
    public void WebFormRowsTest(){

       assertThat(form.getNumberOfTextAreaRows()).isEqualTo("3");

    }

    /**
     * Method to test the tagName of returnToIndex Link
     */
    @Test
    public void LinkTagNameTest(){

        assertThat(form.getLinkTagName()).isEqualTo("a");

    }

    /**
     * Test to check if element is hidden
     */
    @Test
    public void IsElementHiddenTest(){

        assertThat(form.checkIfElementIsHidden()).isFalse();
    }

    /***
     *
     * Test to check if element is hidden
     */
    @Test
    public void IsElementHiddenTestXpath(){
        assertThat(form.checkIfElementIsHiddenXpath()).isFalse();
    }

    /**
     * Test to check if textInput is working
     */
    @Test
    public void IsTextAreaWorking(){
        assertThat(form.typeInTextInput()).isEqualTo("Hello World");
    }

    /**
     * Test to check if password field receives input correctly
     */

    @Test
    public void IsPasswordFieldWorking(){
        assertThat(form.typePassWord()).isEqualTo("hello");

    }

    /**
     * Test to check if dropDown Element is Working
     */

    @Test
    public void isdropDownWorking(){
        assertThat(form.selectOptionFromDropDownField()).isEqualTo("San Francisco");
    }

    @Test
    public void isCheckBoxSelected(){
        assertThat(form.findIfCheckBoxSelected()).isTrue();
    }






}
