package com.test.weborder.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.DriverHelper;
import utils.configReader;

import java.io.IOException;

public class WebOrderHook {
    WebDriver driver= DriverHelper.getDriver();
    @Before
    public void setup(){
        driver.get(configReader.readProperty("QA-WebDriver-Url"));
    }
    @After
    public void tearDown(Scenario scenario){

       BrowserUtils.getScreanshotForCucumber(driver,scenario);
        driver.quit();
    }
}
