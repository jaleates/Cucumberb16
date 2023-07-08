package com.test.etsy.steodefinitions;

import com.test.etsy.pages.EtsyMainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class EtsySearchStepDef {
    WebDriver driver= DriverHelper.getDriver();
    EtsyMainPage etsyMainPage=new EtsyMainPage(driver);
    @When("User searches for {string} for etsy website")
    public void user_searches_for_for_etsy_website(String item) {
etsyMainPage.searchItem(item);
    }
    @Then("User validate the title {string} from Etsy")
    public void user_validate_the_title_from_etsy(String expectedTitle) {
        Assert.assertEquals(expectedTitle,driver.getTitle().trim());
    }
}
