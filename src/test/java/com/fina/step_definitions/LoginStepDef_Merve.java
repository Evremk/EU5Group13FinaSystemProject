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

    @Then("the user should be able to login Merve")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);
        System.out.println(Driver.get().getTitle());
        String actualTitle = Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals("#Inbox - Odoo",actualTitle);

    }

    @And("the user enters password {string} Merve")
    public void theUserEntersPasswordMerve(String password) {
        loginPage.enterPassword(password);


    }

    @Then("the user is not able to login Merve")
    public void theUserIsNotAbleToLogin() {

        BrowserUtils.waitFor(2);
        String expectedUrl = "https://qa.finworkserp.com/web/login";
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals("verify Url", expectedUrl,actualUrl);
        //Assert.assertTrue(loginPage.errorMessageIsVisible());

    }

    @When("the user clicks login Merve")
    public void theUserClicksLogin() {
        loginPage.clickEnter();
    }

    @When("the {string} enters valid credentials Merve")
    public void theEntersValidCredentialsMerve(String usertype) {

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


    @When("the user enters valid email {string} Merve")
    public void theUserEntersValidEmailMerve(String email) {
        loginPage.enterEmail(email);

    }

    @And("the user enters invalid password {string} Merve")
    public void theUserEntersInvalidPasswordMerve(String invalidPassword) {
        loginPage.enterPassword(invalidPassword);


    }


    @When("the user enters invalid email {string} Merve")
    public void theUserEntersInvalidEmailMerve(String invalidEmail) {
        loginPage.enterEmail(invalidEmail);
    }

    @And("the user enters valid password {string} Merve")
    public void theUserEntersValidPasswordMerve(String password) {
        loginPage.enterPassword(password);
    }

    @Given("the user is on the login page Merve")
    public void theUserIsOnTheLoginPageMerve() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }
}



