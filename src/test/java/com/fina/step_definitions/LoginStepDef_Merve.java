package com.fina.step_definitions;

import com.fina.pages.LoginPage_Merve;
import com.fina.pages.LoginPage_Zeynep;
import com.fina.utilities.BrowserUtils;
import com.fina.utilities.ConfigurationReader;
import com.fina.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef_Merve {

    LoginPage_Merve loginPage =new LoginPage_Merve();

    @Given("User is on the login page")
    public void User_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }


    @When("the user enters expenses manager information")
    public void the_user_enters_expenses_manager_information() {
        String username = ConfigurationReader.get("expenses_manager_username");
        String password = ConfigurationReader.get("expenses_manager_password");


        loginPage.login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);
        System.out.println(Driver.get().getTitle());
        String actualTitle = Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals("#Inbox - Odoo",actualTitle);

    }

    @When("the user enters sales manager information")
    public void the_user_enters_sales_manager_information() {
        String username = ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");


        loginPage.login(username,password);
    }


    @When("the user enters store manager information")
    public void the_user_enters_store_manager_information() {

        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");


        loginPage.login(username,password);
    }

    @When("the user enters {string}")
    public void theUserEnters(String userType) {
        loginPage.enterUserName(userType);
    }

    @And("the user enters password {string}")
    public void theUserEntersPassword(String password) {
        loginPage.enterPassword(password);

    }
}


