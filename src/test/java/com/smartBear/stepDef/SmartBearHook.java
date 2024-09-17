package com.smartBear.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class SmartBearHook {


    public WebDriver driver;


    @Before
    public void startUo(){

        driver= DriverHelper.getDriver();
        //driver.get("url"); probably when you work you will have one website so when it is you can just put it like that

    }


    @After
    public void tearDown() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();
    }
}
