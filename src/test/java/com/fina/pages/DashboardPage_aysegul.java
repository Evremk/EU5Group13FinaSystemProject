package com.fina.pages;

import com.fina.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage_aysegul  {

    public DashboardPage_aysegul(){
        PageFactory.initElements(Driver.get(),this);}


    @FindBy(css = ".img-circle.oe_topbar_avatar")
    private WebElement avatar;


    @FindBy(xpath = "//li/a[@data-menu='logout']")
    private WebElement logout;
}

