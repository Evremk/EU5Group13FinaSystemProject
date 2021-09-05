package com.fina.pages;

import com.fina.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Selma {

    public LoginPage_Selma(){PageFactory.initElements(Driver.get(),this);}

    @FindBy(css= "#login")
    public WebElement username;

    @FindBy(css= "#password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logIn;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement errorMessage;

    public void login(String userNameStr,String passwordStr){
        username.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        logIn.click();
    }

}
