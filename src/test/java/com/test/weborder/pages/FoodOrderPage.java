package com.test.weborder.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class FoodOrderPage {

    public FoodOrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(css = "#Email")
    WebElement email;

    @FindBy(css = "#Password")
    WebElement password;
    @FindBy (xpath = "//button[@type='submit']")
    WebElement button;
    @FindBy(css = ".custom-control-label")
    WebElement groupOrder;

    @FindBy(css = "#getAddressNextButton")
    WebElement nextButton;

    @FindBy(xpath = "//textarea[@name='InviteNote']")
    WebElement noteToInvitees;

    @FindBy(xpath = "//textarea[@name='InviteList']")
    WebElement inviteList;

    @FindBy(css = "#ConfirmAddressID")
    WebElement myLocation;

    @FindBy(css = "#addressPreview")
    WebElement address;

    @FindBy(css = "#createGroupOrder")
    WebElement createGroupButton;

    @FindBy(tagName = "h1")
    WebElement header;

    @FindBy(xpath = "//p[contains(text(),'Your group order is now pending-')]")
    WebElement description;
     public void Login(String username,String Password){
         email.clear();
         email.sendKeys(username);
         password.clear();
         password.sendKeys(Password);
         button.click();
      groupOrder.click();
      nextButton.click();
    }
    public void inviteesNote(String invite){
         noteToInvitees.sendKeys(invite);
    }

    public void inviteLIstemails(String email1,String email2){

         inviteList.sendKeys(email1+" , "+email2);
    }
    public void addressValidation(String locationad,String expectedMassage,WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
         BrowserUtils.clickWithJS(driver,myLocation);

         BrowserUtils.selectBy(myLocation,locationad,"text");
        Assert.assertTrue(BrowserUtils.getText(address).contains(expectedMassage));
         createGroupButton.click();
         Thread.sleep(2000);
    }
    public void headerValidation(String expected){
         Assert.assertEquals(expected,BrowserUtils.getText(header));
    }
    public void descriptionValidation(String desc){
         Assert.assertEquals(desc,BrowserUtils.getText(description));
    }

}
