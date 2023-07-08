package com.test.smartbear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class SmartBearOrderPage {
    public SmartBearOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#ctl00_MainContent_fmwOrder_ddlProduct")
    WebElement product;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtQuantity")
    WebElement quantity;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtName")
    WebElement customerName;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox2")
    WebElement street;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox3")
    WebElement city;


    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox5")
    WebElement zip;

    @FindBy(xpath = "//input[@type='radio']")
    List<WebElement> cards;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox6")
    WebElement cardNumber;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox1")
    WebElement expireDate;

    @FindBy(css = ".btn_light")
    WebElement processButton;

    @FindBy(xpath = "//strong[contains(text(),'New order')]")
    WebElement message;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox4")
    WebElement state;

    public void productInformation(String Product, String Quantity) {
        product.sendKeys(Product);
        quantity.sendKeys(Quantity);
    }

    public void addressInformation(String Customername, String Street, String City,String State, String Zip) {
        customerName.sendKeys(Customername);
        street.sendKeys(Street);
        city.sendKeys(City);
        state.sendKeys(State);
        zip.sendKeys(Zip);

    }

    public void paymentInformation(WebDriver driver,String Card, String Cardnumber, String Expiredate) throws InterruptedException {
      // cards=driver.findElements(By.xpath("//input[@type='radio']\""));

        for(int i=0;i<cards.size();i++){
            if(cards.get(i).getAttribute("value").equalsIgnoreCase(Card)){
                cards.get(i).click();
            }
        }
            cardNumber.sendKeys(Cardnumber);
            expireDate.sendKeys(Expiredate);

        }
        public void clickProcessBitton(){
        processButton.click();
        }
        public String validateMessage(){
        return BrowserUtils.getText(message);



        }


    }

