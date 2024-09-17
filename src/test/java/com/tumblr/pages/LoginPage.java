package com.tumblr.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class LoginPage {


  private WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


    @FindBy(css = "input[type='email']")
    WebElement email;


    @FindBy(xpath = "//input[@name='email']//..//div//span[.='Next']")
    WebElement nextBtn1;


    @FindBy(css = "input[name='password']")
    WebElement password;

    @FindBy(css = "button[type='submit']")
    WebElement loginBtn2;


    @FindBy(xpath = "//div[@class='a0A37 hAkP2']")
    WebElement error;


public void enterEmailAnClickOnNextBtn(String email){

    BrowserUtils.sendKeys(this.email,driver,email);
    BrowserUtils.click(this.nextBtn1,driver);
}

public void enterPasswordAndClickOnLoginBtn(String password){

    BrowserUtils.sendKeys(this.password,driver,password);
    BrowserUtils.click(this.loginBtn2,driver);
}

public void getErrorText(String errorText){


    Assert.assertEquals(errorText,BrowserUtils.getText(this.error));
}




}
