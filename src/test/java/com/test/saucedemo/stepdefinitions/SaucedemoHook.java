package com.test.saucedemo.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.DriverHelper;
import utils.configReader;

public class SaucedemoHook {
    WebDriver driver= DriverHelper.getDriver();
    @Before
    public void setup(){
        driver.get(configReader.readProperty("QA_suacedemo_url"));
    }
    @After
    public void tearDown(Scenario scenario){

        BrowserUtils.getScreanshotForCucumber(driver,scenario);
        driver.quit();
    }
}
