package com.automationExercise.stepDefinitions;

import com.automationExercise.pages.ContactUsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class ContactUsStepDef {

WebDriver driver = DriverHelper.getDriver();
ContactUsPage contactUsPage = new ContactUsPage(driver);


    @Given("user naviagtes to web page")
    public void user_naviagtes_to_web_page() {
driver.get(ConfigReader.readProperty("autoExercise"));
    }
    @When("user enters name and email")
    public void user_enters_name_and_email() {
        contactUsPage.enterNameAndEmail("meryem","st@gmail.com");

    }
    @Then("user enters subject and message")
    public void user_enters_subject_and_message() {
        contactUsPage.enterSubjectAndMessage("email","hey love");

    }
    @Then("user uploads file ans click submit button and accept js alert")
    public void user_uploads_file_ans_click_submit_button_and_accept_js_alert() {
contactUsPage.uploadFileAndClickOnJs("/Users/meryemvarli/Desktop/B22-HTML/image.jpg");
    }

    @Given("user is on contact page and validates the contact us header")
    public void user_is_on_contact_page_and_validates_the_contact_us_header() {
        String actualText = contactUsPage.validateContactUsHeader();
        String expected = "CONTACT US";

        Assert.assertEquals("failed to validate the header ",expected,actualText);

    }
    @Then("user validates the get in touch header")
    public void user_validates_the_get_in_touch_header() {
        String actual = contactUsPage.validateGeTinTouchHeader();
        String expected = "GET IN TOUCH";
        Assert.assertEquals("failed to validate the get in touch header ",expected,actual);

    }
    @Then("user validates the feedback for us header")
    public void user_validates_the_feedback_for_us_header() {
        String actual = contactUsPage.validateFeedbackHeader();
        String expected = "FEEDBACK FOR US";
        Assert.assertEquals("failed o validate the feedback header ",expected,actual);

    }





















}
