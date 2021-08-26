package com.fina.pages;

import com.fina.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Merve {

    public LoginPage_Merve(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "login")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = ".btn.btn-primary")
    private WebElement submit;

    @FindBy(css = ".alert.alert-danger")
    private WebElement wrongmessage;


    public void login(String Username, String Password) {
        userName.sendKeys(Username);
        password.sendKeys(Password);
        submit.click();

    }

    public void enterUserName(String userName1) {
        userName.sendKeys(userName1);
    }

    public void enterPassword(String password1) {
        password.sendKeys(password1);
    }
}


