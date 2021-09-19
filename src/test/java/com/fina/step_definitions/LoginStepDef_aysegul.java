package com.fina.step_definitions;

import com.fina.pages.DashboardPage_aysegul;
import com.fina.pages.LoginPage_Merve;
import com.fina.pages.LoginPage_aysegul;
import com.fina.utilities.BrowserUtils;
import com.fina.utilities.ConfigurationReader;
import com.fina.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef_aysegul extends LoginPage_aysegul {

        LoginPage_aysegul loginPage = new LoginPage_aysegul();
        DashboardPage_aysegul db = new DashboardPage_aysegul();


    @Given("The user is on the login Page_aysegul")
    public void theUserIsOnTheLoginPage_aysegul() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }


    @When("{usertype} enters valid {username} and valid {password}")
    public void entersValidAndValid(String arg0, String arg1, String arg2) {


        Driver.get().get(ConfigurationReader.get("url"));
        String usertype= null;
        String username = null;
        String password = null;


        if (usertype.equals("expenses manager")) {
            username = ConfigurationReader.get("expenses_manager_username");
            password = ConfigurationReader.get("expenses_manager_password");
            loginPage.login(username, password);

        } else if (usertype.equals("sales manager")) {
            username = ConfigurationReader.get("sales_manager_username");
            password = ConfigurationReader.get("sales_manager_password");
            loginPage.login(username, password);
        } else  {
            username = ConfigurationReader.get("store_manager_username");
            password = ConfigurationReader.get("store_manager_password");
            loginPage.login(username, password);
        }

    }
}





