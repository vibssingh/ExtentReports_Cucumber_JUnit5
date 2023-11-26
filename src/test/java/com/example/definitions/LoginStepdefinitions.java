package com.example.definitions;


import org.junit.jupiter.api.Assertions;


import com.example.actions.ForgotPasswordActions;
import com.example.actions.HomePageActions;
import com.example.actions.LoginPageActions;
import com.example.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefinitions {

	LoginPageActions objLogin = new LoginPageActions();
    HomePageActions objHomePage = new HomePageActions();
    ForgotPasswordActions objForgotPasswordPage = new ForgotPasswordActions();
	
    @Given("User is on HRMLogin page {string}")
    public void loginTest(String url) {
    	
    	HelperClass.openPage(url);
 
    }
 
    @When("User enters username as {string} and password as {string}")
    public void goToHomePage(String userName, String passWord) {
 
        // login to application
        objLogin.login(userName, passWord);
 
        // go the next page
        
    }
    
    @When("User clicks on Forgot your Password Link")
    public void goToForgotYourPasswordPage() {
    	
    	objLogin.clickOnForgetYourPasswordLink();
    	
    }
 
    @Then("User should be able to login successfully and new page open")
    public void verifyLogin() {
 
        // Verify home page
    	Assertions.assertTrue(objHomePage.getHomePageText().contains("Dashboard"));
 
    }
    
    @Then("User should be able to see error message {string}")
    public void verifyErrorMessage(String expectedErrorMessage) {
 
        // Verify home page
    	Assertions.assertEquals(objLogin.getErrorMessage(),expectedErrorMessage);
 
    }
    
    
    @Then("User should be able to see LinkedIn Icon")
    public void verifyLinkedInIcon( ) {
    	
    	Assertions.assertTrue(objLogin.getLinkedInIcon());
    }
    
    @Then("User should be able to see FaceBook Icon")
    public void verifyFaceBookIcon( ) {
    	
    	Assertions.assertTrue(objLogin.getFaceBookIcon());
    }
    
    @Then("User should navigate to a new page")
    public void verfiyForgetYourPasswordPage() {
    	
    	Assertions.assertEquals(objForgotPasswordPage.getForgotPasswordPageText(), "Reset Password");
    }
      
}