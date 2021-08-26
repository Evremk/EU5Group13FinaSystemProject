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

public class LoginStepDef_Merve extends LoginPage_Merve {

    LoginPage_Merve loginPage =new LoginPage_Merve();

    @Given("User is on the login page")
    public void User_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }


    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);
        System.out.println(Driver.get().getTitle());
        String actualTitle = Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals("#Inbox - Odoo",actualTitle);

    }

    @And("the user enters password {string}")
    public void theUserEntersPassword(String password) {
        loginPage.enterPassword(password);


    }

    @When("the {usertype} enters valid credentials")
    public void theEntersValidCredentials(String usertype) {

        usertype= usertype.toLowerCase();
        String username=null;
        String password=null;

        Driver.get().get(ConfigurationReader.get("url"));

        if(usertype.equals("expenses manager")){
            username= ConfigurationReader.get("expenses_manager_username");
            password = ConfigurationReader.get("expenses_manager_password");

        }else if (usertype.equals("sales manager")){
            username= ConfigurationReader.get("sales_manager_username");
            password = ConfigurationReader.get("sales_manager_password");

        }else if(usertype.equals("store manager")){
            username= ConfigurationReader.get("store_manager_username");
            password = ConfigurationReader.get("store_manager_password");

        }
        LoginPage_Merve loginPage = new LoginPage_Merve();
        loginPage.login(username,password);


    }

    @When("the user enters invalid {string}")
    public void theUserEntersInvalidEmail(String email) {
    }

    @And("the user enters valid {string}")
    public void theUserEntersValidPassword(String password) {
    }

    @Then("the user is not able to login")
    public void theUserIsNotAbleToLogin() {

    }

    @When("the user clicks enter")
    public void theUserClicksEnter() {
    }
}



