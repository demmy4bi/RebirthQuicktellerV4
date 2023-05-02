package com.rebirthQuickteller.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.rebirthQuickteller.base.TestBase;

import pages.SignUpPageObjects;

public class SignUp  extends TestBase {

	
	public void signUpEmail() throws IOException, InterruptedException {
		
		SignUpPageObjects SignUpPageObj = new SignUpPageObjects(driver);
		SignUpPageObj.ClickSignUpButton();
		SignUpPageObj.EnterEmail("ahskskhe@gmail.com");
		SignUpPageObj.ClickTermConditionButton();
		SignUpPageObj.ClickSignUp();
		SignUpPageObj.ClickOpenEmailBtn();
		SignUpPageObj.Clickemail();
	}
	
	 
	public void SignUpwithPhoneNumber() throws IOException, InterruptedException {
		
		SignUpPageObjects SignUpPageObj = new SignUpPageObjects(driver);
		SignUpPageObj.ClickSignUpButton();
		SignUpPageObj.ClickSignuphPhoneNumber();
		SignUpPageObj.EnterPhoneNumber(RandomNigeriaPhoneGenerator());
		SignUpPageObj.ClickTermConditionButton();
		SignUpPageObj.ClickSignUp();	
		SignUpPageObj.EnterOTP("123456");
		SignUpPageObj.EnterPassword("Ademola1@");
		SignUpPageObj.EnterconfirmPassword("Ademola1@");
	    SignUpPageObj.ClickNext();
	    SignUpPageObj.WelcometoQuicktellerAssertion();
	    SignUpPageObj.ClickGetStarted();
	    SignUpPageObj.EnterFirstName(randomFirstName());
	    SignUpPageObj.EnterLastName(randomLastName());
	    SignUpPageObj.SelectGender();
	    SignUpPageObj.EnterDateofBirth("09/11/1990");
	    SignUpPageObj.EnterQuickTag(randomFirstName());
	    SignUpPageObj.EnterRefferalName(randomEmail());
	    SignUpPageObj.ClickNext();
	    SignUpPageObj.ProfileUpdateAssertion();
	    SignUpPageObj.EnterOTP("1990");
	    SignUpPageObj.EnterconfirmPin("1990");
	    SignUpPageObj.ClickSavePin();
	    SignUpPageObj.PinSetSuccessAssertion();
	    SignUpPageObj.ClickPersonaliseAccountBtn();
	    SignUpPageObj.SelectInterests();
	    SignUpPageObj.ClickNext();
	    SignUpPageObj.EnterEmail(randomEmail());
	    SignUpPageObj.ClickVerifyEmail();
	    SignUpPageObj.EmailSentAssertion();
	    
	    
	    Thread.sleep(6000);
	
	}
	
	@Test
	public void InvalidPhonenumberSignUp() throws IOException, InterruptedException {
		
		SignUpPageObjects SignUpPageObj = new SignUpPageObjects(driver);
		SignUpPageObj.ClickSignUpButton();
		SignUpPageObj.ClickSignuphPhoneNumber();
		SignUpPageObj.SelectCountryCode();
		SignUpPageObj.EnterPhoneNumber(RandomNigeriaPhoneGenerator());
		SignUpPageObj.InvalidphoneNumberInputAssertion();
		Thread.sleep(6000);
		
		
	}
	
	
	
	public void AlreadyExistPhonenumberSignUp() throws IOException, InterruptedException {
		SignUpPageObjects SignUpPageObj = new SignUpPageObjects(driver);
		SignUpPageObj.ClickSignUpButton();
		SignUpPageObj.ClickSignuphPhoneNumber();
		SignUpPageObj.EnterPhoneNumber("08074258404");
		SignUpPageObj.ClickTermConditionButton();
		SignUpPageObj.ClickSignUp();	
		SignUpPageObj.AlreadyExistphonenumberAssertion();
		
	}
	
	
	public void VerifyPhonenumberWithInvalidOTP() throws IOException, InterruptedException {
		SignUpPageObjects SignUpPageObj = new SignUpPageObjects(driver);
		SignUpPageObj.ClickSignUpButton();
		SignUpPageObj.ClickSignuphPhoneNumber();
		SignUpPageObj.EnterPhoneNumber(RandomNigeriaPhoneGenerator());
		SignUpPageObj.ClickTermConditionButton();
		SignUpPageObj.ClickSignUp();	
	    SignUpPageObj.EnterOTP("123489");
	    SignUpPageObj.InvalidOTPPhoneNumberVerificationAssertion();
	    SignUpPageObj.ClickClose();
	    
		
	}
	
	
	
	
	
	
}
