package com.fina.pages;

import com.fina.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_aysegul {

    public LoginPage_aysegul(){


        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "login")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = ".btn.btn-primary")
    private WebElement LoginBtn;

    @FindBy(css = ".alert.alert-danger")
    private WebElement alert;

    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        LoginBtn.click();


    }



}
