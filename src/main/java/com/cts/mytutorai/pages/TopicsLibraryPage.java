package com.cts.mytutorai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TopicsLibraryPage {
    
    private WebDriver driver;
    
    public TopicsLibraryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
}
