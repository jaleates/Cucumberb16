package com.test.smartbear.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmartBearVieworderPage {
    public SmartBearVieworderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath = "//tr[2]//td")
    List<WebElement> allInformation;

    public void valiadtePrderInformation(String NAme,String location,String quanity,String street,String city,String state,String zip,String card,String cardNumber,String expire){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime now=LocalDateTime.now().plusDays(1);
        String currentDate=dtf.format(now);
        List<String> excpectedInformation= Arrays.asList(NAme,location,quanity,currentDate,street,city,state,zip,card,cardNumber,expire);
       List<String> actualInformation=new ArrayList<>();

        for(int i=1;i<allInformation.size()-1;i++){

            actualInformation.add(allInformation.get(i).getText().trim());

        }

        Assert.assertEquals(excpectedInformation,actualInformation);
    }

}
