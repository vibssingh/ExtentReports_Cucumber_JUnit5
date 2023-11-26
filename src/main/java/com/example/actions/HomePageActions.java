package com.example.actions;

import org.openqa.selenium.support.PageFactory;

import com.example.locators.HomePageLocators;
import com.example.utils.HelperClass;

public class HomePageActions {

	HomePageLocators homePageLocators = null;
    
    public HomePageActions() {
          
        this.homePageLocators = new HomePageLocators();
  
        PageFactory.initElements(HelperClass.getDriver(),homePageLocators);
    }
  
   
    // Get the User name from Home Page
    public String getHomePageText() {
        return homePageLocators.homePageUserName.getText();
    }
  
}