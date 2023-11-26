package com.example.actions;

import org.openqa.selenium.support.PageFactory;

import com.example.locators.ForgotPasswordLocators;
import com.example.utils.HelperClass;

public class ForgotPasswordActions {

	ForgotPasswordLocators forgotPasswordLocators = null;
	   
	public ForgotPasswordActions() {
    	
		this.forgotPasswordLocators = new ForgotPasswordLocators();

		PageFactory.initElements(HelperClass.getDriver(),forgotPasswordLocators);
    }
 
    // Get the Heading of Forgot Password page
    public String getForgotPasswordPageText() {
        return forgotPasswordLocators.ForgotPasswordHeading.getText();
    }
}