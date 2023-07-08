package com.test.smartbear.stepdefinitions;

import com.test.smartbear.pages.SmartBearLoginPage;
import com.test.smartbear.pages.SmartBearMainPage;
import com.test.smartbear.pages.SmartBearOrderPage;
import com.test.smartbear.pages.SmartBearVieworderPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;
import utils.configReader;

import java.util.List;
import java.util.Map;

public class SmartBearOderCreationStepDef {
    WebDriver driver= DriverHelper.getDriver();
    SmartBearLoginPage smartBearLoginPage=new SmartBearLoginPage(driver);
    SmartBearMainPage smartBearMainPage=new SmartBearMainPage(driver);
    SmartBearOrderPage smartBearOrderPage=new SmartBearOrderPage(driver);
   SmartBearVieworderPage smartBearVieworderPage=new SmartBearVieworderPage(driver);
    @Given("User provides username and password then click login button")
    public void user_provides_username_and_password_then_click_login_button() {
        smartBearLoginPage.loginFunctionality(configReader.readProperty("QA_smartbear_username"),
                configReader.readProperty("QA_smartbear_password"));
    }

    @When("User clicks order button and provides {string} and {string} for product information")
    public void user_clicks_order_button_and_provides_and_for_product_information(String product, String quantity) {
smartBearMainPage.clickorderbutton();
smartBearOrderPage.productInformation(product, quantity);
    }

    @When("USer provides {string}, {string}, {string},{string} and {string} for address information")
    public void u_ser_provides_and_for_address_information(String name, String street, String city, String state, String zip) {
        smartBearOrderPage.addressInformation(name,street,city,state,zip);
    }
    @When("User provides {string},{string} and {string} for payment information")
    public void user_provides_and_for_payment_information(String card, String cardnumber, String expiredate) throws InterruptedException {
smartBearOrderPage.paymentInformation(driver,card, cardnumber, expiredate);
    }
    @Then("User clicks process button and validate {string} and click view order button")
    public void user_clicks_process_button_and_validate_and_click_view_order_button(String expectedMassage) {
        smartBearOrderPage.clickProcessBitton();
        Assert.assertEquals(expectedMassage,smartBearOrderPage.validateMessage());
        smartBearMainPage.clickviewAllButton();
    }
    @Then("User validate all the information {string},{string},{string}, {string}, {string},{string}, {string},{string},{string} and {string} from the table")
    public void user_validate_all_the_information_and_from_the_table(String NAme,String location,String quanity,String street,String city,String state,String zip,String card,String cardNumber,String expire) {
       smartBearVieworderPage.valiadtePrderInformation(NAme, location, quanity, street, city, state, zip, card, cardNumber, expire);

    }

    @When("User clicks order button and provides product and quantity for product information")
    public void user_clicks_order_button_and_provides_product_and_quantity_for_product_information(DataTable dataTable) {
        Map<String,String> productInformation=dataTable.asMap();
        System.out.println(productInformation);
        smartBearMainPage.clickorderbutton();
        smartBearOrderPage.productInformation(productInformation.get("product"),
                                              productInformation.get("quantity"));
    }
    @When("USer provides customername, street, city,state and zip for address information")
    public void u_ser_provides_customername_street_city_state_and_zip_for_address_information(DataTable dataTable) {
       Map<String,String> addressInformation=dataTable.asMap();
       smartBearOrderPage.addressInformation(addressInformation.get("customername"),
                                             addressInformation.get("street"),
                                             addressInformation.get("city"),
                                             addressInformation.get("state"),
                                             addressInformation.get("zip"));
    }
    @When("User provides card, cardNumber and expireDate for payment information")
    public void user_provides_card_card_number_and_expire_date_for_payment_information(DataTable dataTable) throws InterruptedException {
      Map<String,String> paymentInformation=dataTable.asMap();
      smartBearOrderPage.paymentInformation(driver,paymentInformation.get("card"),
                                                   paymentInformation.get("cardNumber"),
                                                   paymentInformation.get("expireDate"));
    }
    @Then("User clicks process button and validate massage")
    public void user_clicks_process_button_and_validate_massage(DataTable dataTable) {
smartBearOrderPage.clickProcessBitton();
        List<String> message=dataTable.asList();
        Assert.assertEquals(message.get(0),smartBearOrderPage.validateMessage());
    }


}
