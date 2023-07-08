package com.test.weborder.stepdefinitions;

import com.test.weborder.pages.WebOrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class WebOrderLoginStepDef {
    WebDriver driver=DriverHelper.getDriver();
    WebOrderPage webOrderPage=new WebOrderPage(driver);

//    @Given("User navigate to'QA-WebDriver-Url'")
//    public void user_navigate_to_qa_web_driver_url() {
//     driver.get(configReader.readProperty("QA-WebDriver-Url"));
//
//    }
    @When("User fills the requested fields {string} and {string}")
    public void user_fills_the_requested_fields_and(String email, String password) {
     webOrderPage.informationForLogin(email,password);
    }
    @Then("User validates the page {string}")
    public void user_validates_the_page(String title) {
        Assert.assertEquals(title,driver.getTitle());
    }
    @Then("User validates the error message {string}")
    public void user_validates_the_error_message(String errorMessage) {
        Assert.assertEquals(errorMessage,webOrderPage.errorMessage());

    }



}