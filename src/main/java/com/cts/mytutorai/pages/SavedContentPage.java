package com.cts.mytutorai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SavedContentPage {
    
    private WebDriver driver;
    
    public SavedContentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
}
