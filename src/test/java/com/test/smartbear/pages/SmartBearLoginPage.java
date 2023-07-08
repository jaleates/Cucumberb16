package com.test.smartbear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLoginPage {
    public SmartBearLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#ctl00_MainContent_username")
    WebElement userName;
    @FindBy(css = "#ctl00_MainContent_password")
    WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement loginButton;
    public void loginFunctionality(String UserName, String Password){
        userName.sendKeys(UserName);
        password.sendKeys(Password);
        loginButton.click();
    }


}
