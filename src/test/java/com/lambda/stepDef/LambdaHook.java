package com.lambda.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class LambdaHook {

  public WebDriver driver;

  @Before
    public void startUp(){

      driver= DriverHelper.getDriver();
  }



 @After
 public void tearDown(){
      driver.quit();
 }










}
