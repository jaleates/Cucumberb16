package com.test.google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class GoogleMainPage {
    public GoogleMainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//textarea[@name='q']")
    WebElement searchBox;
    @FindBy(xpath = "//a//h3")
    List<WebElement> allLinks;
    @FindBy(xpath = "//div[@id='result-stats']")
    WebElement result;
    public void searchItem(String item){
        searchBox.sendKeys(item, Keys.ENTER);

    }
    public boolean linkCount(int expectedNumber){
        return allLinks.size()<expectedNumber;
    }
    public boolean resultsFromSearch(int expectedResult){
        String[] results= BrowserUtils.getText(result).split(" ");
        return Integer.parseInt(results[1].replace(",",""))<expectedResult;
    }

    public boolean loadTimeOfTheResult(double expectedNumber){
        String[] results=BrowserUtils.getText(result).split(" ");
        return Double.parseDouble(results[3].replace("(",""))<expectedNumber;
    }




}
