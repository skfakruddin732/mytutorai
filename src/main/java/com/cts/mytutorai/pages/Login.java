package com.cts.mytutorai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Login {
    
    private WebDriver driver;
    
    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
}
