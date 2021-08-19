package com.fina.pages;

import com.fina.utilities.BrowserUtils;
import com.fina.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage_Zeynep {

    public DashboardPage_Zeynep(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "oe_topbar_name")
    private WebElement avatarButton;

    @FindBy(xpath = "//li/a[@data-menu='documentation']")
    private WebElement documentationOption;

    @FindBy(xpath = "//li/a[@data-menu='support']")
    private WebElement supportOption;

    @FindBy(xpath = "//li/a[@data-menu='settings']")
    private WebElement preferencesOption;

    @FindBy(xpath = "//li/a[@data-menu='account']")
    private WebElement accountOption;

    @FindBy(xpath = "//li/a[@data-menu='logout']")
    private WebElement logoutOption;

    public void clickAvatarButton() {
        BrowserUtils.waitFor(3);
        avatarButton.click();
    }

    public void selectLogoutOption() {
        logoutOption.click();
    }
}
