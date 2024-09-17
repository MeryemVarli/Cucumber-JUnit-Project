package com.smartBear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class OrderPage {

    private WebDriver driver;

    public OrderPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }



@FindBy(css = "#ctl00_MainContent_fmwOrder_ddlProduct")
    WebElement productDropDown;


@FindBy(css = "#ctl00_MainContent_fmwOrder_txtQuantity")
    WebElement quantity;


@FindBy(css = "#ctl00_MainContent_fmwOrder_txtName")
    WebElement customerName;

@FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox2")
    WebElement street;

@FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox3")
    WebElement city;

@FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox4")
    WebElement state;

@FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox5")
    WebElement zip;

@FindBy(css = "#ctl00_MainContent_fmwOrder_cardList_0")
    WebElement visaBtn;

@FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox6")
    WebElement card;

@FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox1")
    WebElement expirationDate;

@FindBy(css = "#ctl00_MainContent_fmwOrder_InsertButton")
    WebElement processBtn;


public void selectProductAndEnterQuantity(String product,String quantity){

    BrowserUtils.selectBy(this.productDropDown,product,"visibleText");
    BrowserUtils.sendKeys(this.quantity,driver,quantity);
}

public void enterNameAndStreet(String name,String street){

    BrowserUtils.sendKeys(this.customerName,driver,name);
    BrowserUtils.sendKeys(this.street,driver,street);
}


public void enterCityStateZip(String city,String state,String zipcode){

    BrowserUtils.sendKeys(this.city,driver,city);
    BrowserUtils.sendKeys(this.state,driver,state);
    BrowserUtils.sendKeys(this.zip,driver,zipcode);
}

public void clickOnVisaAndCardAndExpiration(String card,String expiration){
    BrowserUtils.click(this.visaBtn,driver);
    BrowserUtils.sendKeys(this.card,driver,card);
    BrowserUtils.sendKeys(this.expirationDate,driver,expiration);
}


public void clickOnProcessBtn(){
    BrowserUtils.click(this.processBtn,driver);
}









}
