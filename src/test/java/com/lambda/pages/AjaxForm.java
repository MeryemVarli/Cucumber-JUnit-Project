package com.lambda.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class AjaxForm {

    private WebDriver driver;

    public AjaxForm(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


@FindBy(css = "#title")
    WebElement name;


@FindBy(css = "#description")
    WebElement message;

@FindBy(css = "#btn-submit")
    WebElement submitBtn;

@FindBy(css = "#submit-control")
WebElement text;


public void enterNameAndMessage(String name,String message){

    BrowserUtils.sendKeys(this.name,driver,name);
    BrowserUtils.sendKeys(this.message,driver,message);
}


public void clicksOnSubmitBtn(){

    BrowserUtils.click(this.submitBtn,driver);
}


public void validateText(String expectedMessage){

    String actualMessage = BrowserUtils.getText(this.text, driver);
    Assert.assertEquals("failed to validate the message ",expectedMessage,actualMessage);

}




}
