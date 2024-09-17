package com.smartBear.pages;

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

    @FindBy(css = "#ctl00_MainContent_username")
    WebElement userName;


    @FindBy(css = "#ctl00_MainContent_password")
    WebElement password;


    @FindBy(css = "#ctl00_MainContent_login_button")
    WebElement loginBtn;


    public void loginFunction(String userName,String password){
        BrowserUtils.sendKeys(this.userName,driver,userName);
        BrowserUtils.sendKeys(this.password,driver,password);
        BrowserUtils.click(this.loginBtn,driver);
    }


}
