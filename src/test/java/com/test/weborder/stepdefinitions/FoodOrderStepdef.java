package com.test.weborder.stepdefinitions;

import com.test.weborder.pages.FoodOrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class FoodOrderStepdef {
    WebDriver driver= DriverHelper.getDriver();
    FoodOrderPage foodOrderPage=new FoodOrderPage(driver);

    @When("User provides {string},{string},clicks checkbox for groupOrder and clicks next button")
    public void user_provides_clicks_checkbox_for_group_order_and_clicks_next_button(String email, String PAassword) {
        foodOrderPage.Login(email,PAassword);
    }
    @Then("User sends invitees {string}")
    public void user_sends_invitees(String Invite) {

        foodOrderPage.inviteesNote(Invite);
    }
    @Then("User invites {string},{string}")
    public void user_invites(String email1, String email2) {
        foodOrderPage.inviteLIstemails(email1,email2);
    }
    @Then("User provides location {string} and validate the address that contains {string} and click group order button")
    public void user_provides_location_and_validate_the_address_that_contains_and_click_group_order_button(String location, String address) throws InterruptedException {
     foodOrderPage.addressValidation(location, address,driver);
    }
    @Then("User validate the header {string}")
    public void user_validate_the_header(String expected) {
       foodOrderPage.headerValidation(expected);
    }
    @Then("User Validate the description that contains {string}")
    public void user_validate_the_description_that_contains(String string) {

    }
}
