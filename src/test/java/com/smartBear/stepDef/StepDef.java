package com.smartBear.stepDef;

import com.smartBear.pages.LoginPage;
import com.smartBear.pages.MainPage;
import com.smartBear.pages.OrderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class StepDef {

    WebDriver driver = DriverHelper.getDriver();

    MainPage mainPage = new MainPage(driver);

    LoginPage loginPage = new LoginPage(driver);

    OrderPage orderPage = new OrderPage(driver);


    @When("user is on login page user enters username as {string} and password as {string}")
    public void user_is_on_login_page_user_enters_username_as_and_password_as(String username, String password) {
driver.navigate().to(ConfigReader.readProperty("smartBearUrl"));
loginPage.loginFunction(username, password);
    }
    @Given("user is on main page of smartbear and user clicks on order button")
    public void user_is_on_main_page_of_smartbear_and_user_clicks_on_order_button() {
        mainPage.clickOnOrderLink();

    }
    @Given("user is on order page and validates title of the order page as {string}")
    public void user_is_on_order_page_and_validates_title_of_the_order_page_as(String title) {
        String actualTitle = driver.getTitle().trim();
        Assert.assertEquals("failed to validate the title ",title,actualTitle);

    }
    @Then("user user selects {string} from dropdown and enters {string} into quantity input field")
    public void user_user_selects_from_dropdown_and_enters_into_quantity_input_field(String productName, String quantity) {
        orderPage.selectProductAndEnterQuantity(productName, quantity);

    }
    @Then("user enters their name as {string} and street address as {string}")
    public void user_enters_their_name_as_and_street_address_as(String name, String street) {
        orderPage.enterNameAndStreet(name, street);

    }
    @Then("user enter city as {string} state as {string} and zipcode as {string}")
    public void user_enter_city_as_state_as_and_zipcode_as(String city, String state, String zipcode) {
        orderPage.enterCityStateZip(city, state, zipcode);

    }
    @Then("user checks visa radio button and enter credit card as {string} and expiration as {string}")
    public void user_checks_visa_radio_button_and_enter_credit_card_as_and_expiration_as(String card, String expiration) {
        orderPage.clickOnVisaAndCardAndExpiration(card, expiration);

    }
    @Then("user clicks on process button")
    public void user_clicks_on_process_button() {
        orderPage.clickOnProcessBtn();

    }




















}
