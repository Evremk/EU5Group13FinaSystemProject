package com.fina.pages;

import com.fina.utilities.BrowserUtils;
import com.fina.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Eyup {

    public LoginPage_Eyup(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "login")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//button[.='Log in']")
    private WebElement submit;

    @FindBy(css = ".alert.alert-danger")
    private WebElement wrongmessage;

    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();

        // verification that we logged
    }

    public void enterUserName(String userName1) {
        userName.sendKeys(userName1);
    }

    public void enterPassword(String password1) {
        password.sendKeys(password1);
    }

    public boolean wrongMessageIsVisible() {
        submit.click();
        BrowserUtils.waitFor(1);
        return wrongmessage.isDisplayed();
    }
}




