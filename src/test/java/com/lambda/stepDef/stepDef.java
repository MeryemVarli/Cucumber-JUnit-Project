package com.lambda.stepDef;

import com.lambda.pages.AjaxForm;
import com.lambda.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

import java.util.Map;

public class stepDef {

    WebDriver driver= DriverHelper.getDriver();
    MainPage mainPage = new MainPage(driver);
    AjaxForm ajaxForm = new AjaxForm(driver);




    @Given("user is on main page of lambda and clicks on ajax submit form link")
    public void user_is_on_main_page_of_lambda_and_clicks_on_ajax_submit_form_link() {
        driver.get("https://www.lambdatest.com/selenium-playground/");
        mainPage.clickOnAjaxFormLink();
    }
    @When("user enters name and message as follows")
    public void user_enters_name_and_message_as_follows(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        String name = map.get("name");
        String message = map.get("message");
        ajaxForm.enterNameAndMessage(name,message);

    }
    @Then("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        ajaxForm.clicksOnSubmitBtn();

    }
    @Then("user validates prompted message as follow")
    public void user_validates_prompted_message_as_follow(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        ajaxForm.validateText(map.get("expectedMessage"));

    }
    @Then("user validates of title of the webpage as follow")
    public void user_validates_of_title_of_the_webpage_as_follow(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        Assert.assertTrue(driver.getTitle().contains(map.get("expectedTitle")));

    }





















}
