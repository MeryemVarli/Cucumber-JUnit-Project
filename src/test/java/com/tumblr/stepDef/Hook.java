package com.tumblr.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class Hook {

  public WebDriver driver;

  @Before
    public void startUp(){

      driver= DriverHelper.getDriver();
      driver.get("https://www.tumblr.com/");
  }

  @After
    public void tearDown(){
      driver.quit();
  }
















}
