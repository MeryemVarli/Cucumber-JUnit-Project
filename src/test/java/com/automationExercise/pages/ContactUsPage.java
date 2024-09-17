package com.automationExercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class ContactUsPage {

   private WebDriver driver;

    public ContactUsPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


 @FindBy(css = "input[data-qa='name']")
    WebElement name;


 @FindBy(css = "input[data-qa='email']")
    WebElement email;


 @FindBy(css = "input[data-qa='subject']")
    WebElement subject;


 @FindBy(css = "textarea[data-qa='message']")
    WebElement message;


 @FindBy(css = "input[name='upload_file']")
    WebElement file;

 @FindBy(css = "input[name='submit']")
    WebElement submitBtn;



 @FindBy(xpath = "//h2[contains(text(),'Contact')]")
 WebElement contactUsHeader;

 @FindBy(xpath = "//h2[contains(text(),'Get')]")
 WebElement getInTouchHeader;

 @FindBy(xpath = "//h2[contains(text(),'Feedback')]")
 WebElement feedbackUsHeader;



 public String validateContactUsHeader(){

     return BrowserUtils.getText(this.contactUsHeader,driver);
 }

 public String validateGeTinTouchHeader(){

     return BrowserUtils.getText(this.getInTouchHeader,driver);
 }

 public String validateFeedbackHeader(){

     return BrowserUtils.getText(this.feedbackUsHeader,driver);
 }





 public void enterNameAndEmail(String name , String email){

     BrowserUtils.sendKeys(this.name,driver,name);
     BrowserUtils.sendKeys(this.email,driver,email);
 }


 public void enterSubjectAndMessage(String subject,String message){

     BrowserUtils.sendKeys(this.subject,driver,subject);
     BrowserUtils.sendKeys(this.message,driver,message);
 }

 public void uploadFileAndClickOnJs(String pathToFile){

     this.file.sendKeys(pathToFile);
     BrowserUtils.click(this.submitBtn,driver);
     BrowserUtils.acceptJSAlert(driver);

 }















}
