package com.test.smartbear.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.DriverHelper;
import utils.configReader;

public class SmartBearHook {
  WebDriver driver= DriverHelper.getDriver();
  @Before
    public void setup(){
      driver.get(configReader.readProperty("QA_smartbear_url"));
  }
  @After
    public void tearDown(Scenario scenario){
      BrowserUtils.getScreanshotForCucumber(driver,scenario);
     driver.quit();
  }

}
