package com.fina.pages;

import com.fina.utilities.BrowserUtils;
import com.fina.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage_Merve {

    @FindBy(css = "span[class^='oe_menu']")
    public List<WebElement>menuOptions;

    @FindBy(css = "ol>li.active")
    public WebElement pageSubTitle;

    public void BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }




}


