package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Class WebForm to represent the WebFrom page in AUT
 */

public class WebForm {

    private WebDriver driver;
    private By textArea = By.tagName("textarea");
    private By link = By.linkText("Return to index");
    private By hidden = By.cssSelector("input[type=hidden]");
    private By hiddenXpath = By.xpath("//input[@type='hidden']");
    private By textElement = By.id("my-text-id");
    private By dropDownFeild = By.name("my-datalist");
    private By passwordField = By.name("my-password");
    private By selectDropDownFeild = By.name("my-select");
    private By selectCheckBox = By.id("my-check-2");



    public WebForm(WebDriver driver){
        this.driver = driver;
    }

    // finder methods

    /**
     * Method to find the text area in webForm page
     * @return WebElement object containing the textbox
     */
    public WebElement findTextArea(){

        WebElement textBox = driver.findElement(textArea);
        return textBox;

    }

    /**
     * Method to find returnIndex link in WebForm Page
     * @return WebElement object contaning the link
     */

    public WebElement findLink(){
        WebElement linkElement = driver.findElement(link);
        return linkElement;
    }

    /**
     * Method to find hidden elements in Webform Page using cssSelector
     * @return WebElement containing the hidden element
     */
    public WebElement findHiddenElement(){
        WebElement hiddenElement= driver.findElement(hidden);
        return hiddenElement;
    }

    /**
     * Function to find hidden elements by xpath
     * @return WebElement Object containing the hidden element
     */
    public WebElement findHiddenElementsByXpath(){

        WebElement hiddenElemntXpath = driver.findElement(hiddenXpath);
        return hiddenElemntXpath;

    }

    /**
     * Method to find the TextInput Feild in the WebFro,
     * @return WebElemnt object containing webelement of textinput
     */

    public WebElement findTextInput(){

        WebElement textInput = driver.findElement(textElement);
        return textInput;

    }

    /**
     * Function to find the password field in the web form
     * @return WebElement object representing the password field
     */
    public WebElement findPassWordField(){
        WebElement passWordField = driver.findElement(passwordField);
        return passWordField;



    }

    /**
     * Method to find dropdownfeild in web form page
     * @return WebElement object contaning the dropDownField
     */
    public WebElement findDropDownField(){

        WebElement dropDownField = driver.findElement(dropDownFeild);
        return dropDownField;

    }

    /**
     * Method to find dropdownelement with select
     */

    public WebElement findDropDownWithSelect(){

        WebElement dropDownWithSelect = driver.findElement(selectDropDownFeild);
        return dropDownWithSelect;

    }

    /**
     * function to find a checkbox in the web page
     */

    public WebElement findCheckBox(){
        WebElement checkBox = driver.findElement(selectCheckBox);
        return  checkBox;
    }


    // Methods operational on web elements

    /**
     * Method to get the number of rows in the textarea element
     * @return the String value of number of rows in the textarea element
     */

    public String getNumberOfTextAreaRows(){

        return findTextArea().getDomAttribute("rows");

    }

    /**
     * Method to get the tag name of returnToIndex link
     * @return String containing the tagName
     */
    public String getLinkTagName(){
        return findLink().getTagName();

    }

    /**
     * Check if hidden element is hidden
     * @return boolean value representing if element is hidden or not
     */
    public boolean checkIfElementIsHidden(){
        return findHiddenElement().isDisplayed();

    }

    /**
     * Method to check if element is hidden using xpath locator
     * @return boolean flag representing the status of the hidden element
     */
    public boolean checkIfElementIsHiddenXpath(){
        return findHiddenElementsByXpath().isDisplayed();

    }

    /**
     * Function to type sample input to the textBox
     * @return String containing the input string specified
     */
    public String typeInTextInput(){
        findTextInput().sendKeys("Hello World");
        return findTextInput().getAttribute("value");
    }

    /**
     * Function to return the input passWord
     */
    public String typePassWord(){
        findPassWordField().sendKeys("hello");
        return findPassWordField().getAttribute("value");
    }

    /**
     * Function to select an option from a dropDownList
     * @return the text value of the selected option
     */
    public String selectOptionFromDropDownField(){
        findDropDownField().sendKeys("San Francisco");
        return findDropDownField().getAttribute("value");


    }

    public boolean findIfCheckBoxSelected(){
        findCheckBox().click();
        return findCheckBox().isSelected();
    }

}

