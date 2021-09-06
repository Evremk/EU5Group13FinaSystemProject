package com.fina.step_definitions;

import com.fina.pages.LoginPage_Selma;
import com.fina.pages.MainPage_Selma;
import com.fina.utilities.ConfigurationReader;
import com.fina.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDef_Selma{

 LoginPage_Selma loginPage = new LoginPage_Selma();
 MainPage_Selma mainPage = new MainPage_Selma();

    @Given("the user is on the loginPage")
    public void the_user_is_on_the_loginPage() {
    String url = ConfigurationReader.get("url");
    Driver.get().get(url);
    }

    @When("the user enters valid {string} and {string} credentials")
    public void the_user_enters_valid_and_credentials(String username, String password) {
        loginPage.login(username,password);
    }

    @Then("the user should be able to login to mainPage")
    public void the_user_should_be_able_to_login_to_mainPage() {

        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.visibilityOf(mainPage.InboxTitle));

        String expected = "#Inbox";
        String actual = mainPage.InboxTitle.getText();

        Assert.assertEquals(expected, actual);

    }
    @When("the user enters invalid {string} and {string} credentials")
    public void the_user_enters_invalid_and_credentials(String username, String password) {
        loginPage.login(username,password);

    }

    @Then("the user should not be able to login and should be see error message.")
    public void the_user_should_not_be_able_to_login_and_should_be_see_error_message() {

        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.visibilityOf(loginPage.errorMessage));
        
        String expected = "Wrong login/password";
        String actual = loginPage.errorMessage.getText();
        Assert.assertEquals(expected,actual);
    }
    @Given("The user logged in as {string}")
    public void the_user_logged_in_as(String userType) {

        Driver.get().get(ConfigurationReader.get("url"));

        String username = null;
        String password = null;

        if (userType.equals("expenses manager")) {
            username = ConfigurationReader.get("expenses_manager_username");
            password = ConfigurationReader.get("expenses_manager_password");
        } else if (userType.equals("sales manager")) {
            username = ConfigurationReader.get("sales_manager_username");
            password = ConfigurationReader.get("sales_manager_password");
        } else if (userType.equals("store manager")) {
            username = ConfigurationReader.get("store_manager_username");
            password = ConfigurationReader.get("store_manager_password");
        }

        loginPage.login(username, password);

    }

    @When("The user clicks the avatar dropdown button")
    public void the_user_clicks_the_avatar_dropdown_button() {

        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.visibilityOf(mainPage.AvatarButton));
        mainPage.AvatarButton.click();
    }

    @When("The user clicks logout button")
    public void the_user_clicks_logout_button() {
        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.visibilityOf(mainPage.LogOut));
        mainPage.LogOut.click();

    }

    @Then("The user should see signIn link on the login page")
    public void the_user_should_see_signIn_link_on_the_login_page() {

        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.visibilityOf(loginPage.signInLink));

        String expected = "Sign in";
        String actual = loginPage.signInLink.getText();
        Assert.assertEquals(expected,actual);
    }




}

