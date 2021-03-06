package com.fina.pages;

import com.fina.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage_Selma {
    public MainPage_Selma(){PageFactory.initElements(Driver.get(),this);}

    @FindBy(xpath= "//*[@class='active' and text()='#Inbox']")
    public WebElement InboxTitle;

    @FindBy(xpath= "//span[@class='oe_topbar_name']")
    public WebElement AvatarButton;

    @FindBy(xpath= "//a[@data-menu='logout']")
    public WebElement LogOut;


}
