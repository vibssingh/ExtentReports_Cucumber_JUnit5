package com.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordLocators {

	@FindBy(xpath = "//*[@id='app']/div[1]/div[1]/div/form/h6")
    public WebElement ForgotPasswordHeading;

}