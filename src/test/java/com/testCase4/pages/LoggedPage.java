package com.testCase4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class LoggedPage {

    public WebDriver driver;

    public LoggedPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


 @FindBy(css = "a[href='/logout']")
    WebElement logoutBtn;

@FindBy(xpath = "//h2[.='Login to your account']")
WebElement LoginInToAccountHeader;

public void clickOnLogOutBtn(){
    BrowserUtils.click(this.logoutBtn,driver);
}

public String getHeaderAgain(){
    return BrowserUtils.getText(this.LoginInToAccountHeader,driver);
}









}
