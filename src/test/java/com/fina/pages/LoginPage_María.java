package com.fina.pages;

import com.fina.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_María {

    public LoginPage_María(){


        PageFactory.initElements(Driver.get(),this);}


    @FindBy(id = "login")
    public WebElement UserName;

    @FindBy(name = "password")
    public WebElement Password;

    @FindBy(css = ".btn.btn-primary")
    public WebElement loginBtn;


}
