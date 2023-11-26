package com.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	  @FindBy(xpath = "//*[@class='oxd-topbar-header-breadcrumb']/h6")
	  public  WebElement homePageUserName;
	  
}