package com.testCase4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class MainPage {

    private WebDriver driver;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


@FindBy(xpath = "//h2[.='Login to your account']")
WebElement LoginInToAccountHeader;

@FindBy(css = "a[href='/login']")
    WebElement loginBtn;

@FindBy(css = "input[data-qa='login-email']")
    WebElement email;

@FindBy(css = "input[data-qa='login-password']")
    WebElement password;

@FindBy(css = "button[data-qa='login-button']")
    WebElement logBtn;




public void clickOnLoginBtn(){

    BrowserUtils.click(this.loginBtn,driver);
}

public void enterEmailAndPassword(String email,String password){

    BrowserUtils.sendKeys(this.email,driver,email);
    BrowserUtils.sendKeys(this.password,driver,password);
}

public void clickOnLogin(){
    BrowserUtils.click(this.logBtn,driver);
}














}
