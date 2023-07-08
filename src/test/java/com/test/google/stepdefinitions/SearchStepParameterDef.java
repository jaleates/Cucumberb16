package com.test.google.stepdefinitions;

import com.test.google.pages.GoogleMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class SearchStepParameterDef {
    WebDriver driver= DriverHelper.getDriver();
    GoogleMainPage googleMainPage=new GoogleMainPage(driver);
    @Given("User navigates to {string}")
    public void user_navigates_to(String website) {
          driver.get(website);
    }
    @When("User searches for {string}")
    public void user_searches_for(String item) {
       googleMainPage.searchItem(item);
    }
    @Then("User validates first page returns more than {int} links")
    public void user_validates_first_page_returns_more_than_links(Integer int1) {
        Assert.assertTrue(googleMainPage.linkCount(int1));
    }

    @Then("User Validates the result is less than {string}")
    public void user_validates_the_result_is_less_than(String amount) {
      Assert.assertTrue(googleMainPage.resultsFromSearch(Integer.parseInt(amount)));
    }

    @Then("Validate the result of loading time is less than a {string}")
    public void validate_the_result_of_loading_time_is_less_than_a(String loadTime) {
       Assert.assertTrue(googleMainPage.loadTimeOfTheResult(Double.parseDouble(loadTime)));
    }
}
