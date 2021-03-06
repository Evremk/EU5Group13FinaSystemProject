package com.fina.step_definitions;

import com.fina.pages.DashboardPage_Zeynep;
import com.fina.pages.LoginPage_Zeynep;
import com.fina.utilities.BrowserUtils;
import com.fina.utilities.ConfigurationReader;
import com.fina.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class LoginStepDef_Zeynep {

    LoginPage_Zeynep loginPage =new LoginPage_Zeynep();
    DashboardPage_Zeynep db = new DashboardPage_Zeynep();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
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
        BrowserUtils.waitFor(2);
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

    @Then("the user sees wrong message")
    public void theUserSeesWrongMessage() {

        Assert.assertTrue(loginPage.wrongMessageIsVisible());


    }

    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> user) {
        System.out.println("User = " + user);
        new LoginPage_Zeynep().login(user.get("username"),user.get("password"));
    }


    @When("the user enters invalid {string} or {string}")
    public void the_user_enters_invalid_or(String userName, String passWord) {
       loginPage.login(userName, passWord);
    }

    @When("the user enters valid {string} and {string}")
    public void the_user_enters_valid_and(String usernam, String passwor) {
        loginPage.login(usernam, passwor);
    }

    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        the_user_is_on_the_login_page();
        the_user_enters_sales_manager_information();
    }

    @When("the user click avatar dropdown button")
    public void theUserClickAvatarDropdownButton() {

        db.clickAvatarButton();
    }

    @Then("the user click logout button")
    public void theUserClickLogoutButton() {
        db.selectLogoutOption();
    }

    @And("the title contains {string}")
    public void theTitleContains(String expectedTitle) {
        System.out.println("expectedTitle = " + expectedTitle);
        String actualTitle=Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
    }

    @Then("the user able to see dropdown menu")
    public void theUserAbleToSeeDropdownMenu() {
        List<WebElement> options = Driver.get().findElements(By.className("dropdown-menu"));
        System.out.println(options.size());
        System.out.println(options.get(1).getText());
        Assert.assertTrue(options.get(1).getText().contains("Log out"));


    }
}

