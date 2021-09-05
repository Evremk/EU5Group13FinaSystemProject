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
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = ".btn.btn-primary")
    private WebElement submit;

    @FindBy(css = ".alert.alert-danger")
    private WebElement errorMessage;


    public void login(String Email, String Password) {
        email.sendKeys(Email);
        password.sendKeys(Password);
        submit.click();

    }

    public void enterEmail(String emailAddress) {
        email.sendKeys(emailAddress);
    }

    public void enterPassword(String password1) {
        password.sendKeys(password1);
    }

    public void clickEnter(){
        submit.click();

    }

    public boolean errorMessageIsVisible(){
        boolean condition=false;
        if(errorMessageIsVisible()){
            condition=true;

        }
        return condition;
    }
}


