package com.lambda.pages;

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


@FindBy(xpath = "//a[.='Ajax Form Submit']")
    WebElement ajaxFormLink;



    public void clickOnAjaxFormLink(){

        BrowserUtils.click(this.ajaxFormLink,driver);
    }










}
