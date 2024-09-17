package com.tumblr.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.time.Duration;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }



 @FindBy(xpath = "//span[.='Log in']")
    WebElement loginBtn;

  @FindBy(xpath = "//button[@aria-label='Continue with email']")
    WebElement continueWithEmailBtn;

    @FindBy(xpath = "//button//div[@class='a132D']")
    WebElement toggle;


    public void clickOnLoginAndContinueWithEmailBtn(){

        BrowserUtils.click(this.loginBtn,driver);
        BrowserUtils.click(this.continueWithEmailBtn,driver);
    }


    public void clickOnToggle() {

        Actions actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            actions.pause(Duration.ofSeconds(2));
            BrowserUtils.click(this.toggle, driver);  //you didnt have to put driver in method as parameter bc you have at the beggin of the class

        }


    }


}
