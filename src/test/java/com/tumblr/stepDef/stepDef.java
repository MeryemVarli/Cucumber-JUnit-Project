package com.tumblr.stepDef;

import com.tumblr.pages.LoginPage;
import com.tumblr.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class stepDef {

    WebDriver driver= DriverHelper.getDriver();
    MainPage mainPage = new MainPage(driver);
    LoginPage loginPage = new LoginPage(driver);


    @Given("user clciks on login button on main page then clicks on continue with email")
    public void user_clciks_on_login_button_on_main_page_then_clicks_on_continue_with_email() {
mainPage.clickOnLoginAndContinueWithEmailBtn();
    }
    @When("user enter email as {string} and clicks next button")
    public void user_enter_email_as_and_clicks_next_button(String email) {
loginPage.enterEmailAnClickOnNextBtn(email);
    }
    @When("user enter password {string} and clicks on login button")
    public void user_enter_password_and_clicks_on_login_button(String password) {
loginPage.enterPasswordAndClickOnLoginBtn(password);
    }
    @Then("user validates the error text {string} that appears on negative scenario")
    public void user_validates_the_error_text_that_appears_on_negative_scenario(String errorText) {
loginPage.getErrorText(errorText);
    }


    @Given("user is on main page of tumblr")
    public void user_is_on_main_page_of_tumblr() {
       driver.get("https://www.tumblr.com/");
    }
    @Given("user clicks toggle that changes colors")
    public void user_clicks_toggle_that_changes_colors() {
mainPage.clickOnToggle();
    }
    @Then("usser verifies url of the main page")
    public void usser_verifies_url_of_the_main_page() {
        System.out.println(driver.getCurrentUrl());
    }










}
