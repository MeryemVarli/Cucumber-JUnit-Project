package com.testCase4.testCaseStepDef;

import com.testCase4.pages.LoggedPage;
import com.testCase4.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class stepDef {

    WebDriver driver = DriverHelper.getDriver();
    MainPage mainPage = new MainPage(driver);
    LoggedPage loggedPage = new LoggedPage(driver);




    @Given("user navigates to web page")
    public void user_navigates_to_web_page() {
driver.navigate().to(ConfigReader.readProperty("autoExMainUrl"));
    }

    @Then("user clciks on signup login button")
    public void user_clciks_on_signup_login_button() {
        mainPage.clickOnLoginBtn();

    }
    @Then("user enters email as {string} and enters password as {string}")
    public void user_enters_email_as_and_enters_password_as(String email, String password) {
mainPage.enterEmailAndPassword(email,password);
    }
    @Then("user clicks on login button and validates logged in as username")
    public void user_clicks_on_login_button_and_validates_logged_in_as_username() {
mainPage.clickOnLogin();
    }
    @Then("user clicks on log out button and verifies user is on login page")
    public void user_clicks_on_log_out_button_and_verifies_user_is_on_login_page() {
loggedPage.clickOnLogOutBtn();
        String actual = loggedPage.getHeaderAgain();
        String expected = "Login to your account";
        Assert.assertEquals("Failed to validate 2 ",expected,actual);


    }





















}
