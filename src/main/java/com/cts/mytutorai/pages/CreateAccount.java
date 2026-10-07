package com.cts.mytutorai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
    
    private WebDriver driver;
    
    public CreateAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
}
