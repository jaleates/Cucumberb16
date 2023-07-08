package com.test.weborder.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class WebOrderPage {
    public WebDriver driver;
    public WebOrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#Email")
    WebElement email;

    @FindBy(css = "#Password")
    WebElement password;
    @FindBy (xpath = "//button[@type='submit']")
    WebElement button;
    @FindBy(css = ".alert-danger")
    WebElement erroremessage;

    public void informationForLogin(String emails,String Password){
        email.clear();
        email.sendKeys(emails);
        password.clear();
        password.sendKeys(Password);
        button.click();
    }
    public String errorMessage(){
        return BrowserUtils.getText(erroremessage);

    }
}
