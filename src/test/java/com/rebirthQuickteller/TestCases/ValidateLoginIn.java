package com.rebirthQuickteller.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

 
import com.rebirthQuickteller.base.TestBase;

import pages.LoginPageObjects;

public class ValidateLoginIn extends TestBase {

	//Email Login

	@Test(priority = 1, description = "This test case will verify user can't login with invalid email fields")
	public void InvalidEmailInput() throws IOException, InterruptedException {

		Reporter.log("Test to verify user can't login with invalid email fields started !!!", true);
		
		LoginPageObjects LoginPageObj = new LoginPageObjects(driver);
		LoginPageObj.EnterEmail("demmy4bigmail.com");
		LoginPageObj.InvalidEmailInputAssertion();
		Thread.sleep(3000);
		 

		Reporter.log("Test to verify user can't login with invalid email fields completed !!!", true);
	}
	 
	@Test(priority = 2, description = "This test case will verify user can't login with  UnregisteredEmail and a valid password fields")
	public void UnregisteredEmailValidPassword() throws IOException, InterruptedException {

		Reporter.log("Test to verify user can't login with  UnregisteredEmail and a valid password fields started !!!", true);
		
		LoginPageObjects LoginPageObj = new LoginPageObjects(driver);
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola4@");
		LoginPageObj.ClickSignInButton();
		LoginPageObj.UnregisteredEmailAssertion();
		Thread.sleep(3000);

		Reporter.log("Test to verify user can't login with  UnregisteredEmail and a valid password fields completed !!!", true);
	}

	@Test(priority = 3, description = "This test case will verify user can't login with  valid email and a wrong password fields")
	public void ValidEmailInvalidPassword() throws IOException, InterruptedException {

		Reporter.log("Test to verify user can't login with  valid email and a wrong password fields started !!!", true);
		
		LoginPageObjects LoginPageObj = new LoginPageObjects(driver);
		LoginPageObj.EnterEmail("demmylee56@gmail.com");
		LoginPageObj.EnterPassword("Ademola");
		LoginPageObj.ClickSignInButton();
		LoginPageObj.InvalidPasswordAssertion();
		Thread.sleep(3000);

		Reporter.log("Test to verify user can't login with  valid email and a wrong password fields completed !!!", true);
		
	}
	
	@Test(priority = 4, description = "This TestCase will perform login with valid credentials")
	public void ValidEmailValidPassword() throws IOException, InterruptedException {
	
		Reporter.log("Test to perform login with valid email and password started !!!", true);
		
		LoginPageObjects LoginPageObj = new LoginPageObjects(driver);

		LoginPageObj.EnterEmail("demmylee56@gmail.com");
		LoginPageObj.EnterPassword("Ademola4@");
		LoginPageObj.ClickSignInButton();
		Thread.sleep(3000);
		LoginPageObj.doitlatercllick();
		LoginPageObj.ValidateHomePageUrl();
		Thread.sleep(3000);
		LoginPageObj.ClickLogoutDropdownBtn();
		LoginPageObj.ClickLogoutButton();
		
		Reporter.log("Test to perform login with valid email and password completed !!!", true);
	}
	
	@Test(priority = 5, description = "This TestCase will perform valid login with rememberMe")
	public void ValidateEmailLoginWithRememberMe() throws IOException, InterruptedException {
Reporter.log("Test to perform valid login with rememberMe started !!!", true);
		
		LoginPageObjects LoginPageObj = new LoginPageObjects(driver);

		LoginPageObj.EnterEmail("demmylee56@gmail.com");
		LoginPageObj.EnterPassword("Ademola4@");
		LoginPageObj.EyePassword();
		Thread.sleep(500);
		LoginPageObj.EyePassword();
		LoginPageObj.ClickRememberMe();
		LoginPageObj.ClickSignInButton();
		Thread.sleep(3000);
		LoginPageObj.doitlatercllick();
		LoginPageObj.ValidateHomePageUrl();
		Thread.sleep(3000);
		LoginPageObj.ClickLogoutDropdownBtn();
		LoginPageObj.ClickLogoutButton();
		LoginPageObj.EnterPassword("Ademola4@");
		LoginPageObj.EyePassword();
		Thread.sleep(500);
		LoginPageObj.EyePassword();
		LoginPageObj.ClickSignInButton();
		Thread.sleep(3000);
		LoginPageObj.doitlatercllick();
		LoginPageObj.ValidateHomePageUrl();
		Thread.sleep(3000);
		LoginPageObj.ClickLogoutDropdownBtn();
		LoginPageObj.ClickLogoutButton();
		
		Reporter.log("Test to perform valid login with rememberMe completed !!!", true);
	}
	
	
	
	//PhoneNumber Login
	
	@Test(priority = 6, description = "This test case will verify user can't login with invalid phoneNumber fields")
	public void InvalidPhoneNumbernput() throws IOException, InterruptedException {

		Reporter.log("Test to verify user can't login with invalid phoneNumber fields started !!!", true);
		
		LoginPageObjects LoginPageObj = new LoginPageObjects(driver);
		LoginPageObj.ClickSignInWithPhoneNumberButton();
		LoginPageObj.EnterPhoneNumber("0809845");
		LoginPageObj.InvalidphoneNumberInputAssertion();
		Thread.sleep(3000);
		 

		Reporter.log("Test to verify user can't login with invalid phoneNumber fields fields completed !!!", true);
	}
	
	 
	@Test(priority = 7, description = "This test case will verify user can't login with  UnregisteredPhoneNumber and a valid password fields")
	public void UnRegisteredPhonenumberValidPassword() throws IOException, InterruptedException {
	
		Reporter.log("Test to verify user can't login with  UnregisteredPhoneNumber and a valid password fields started !!!", true);
		
		LoginPageObjects LoginPageObj = new LoginPageObjects(driver);
		LoginPageObj.EnterPhoneNumber("08052511376");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
	    LoginPageObj.UnregisteredPhoneNumberAssertion();
		Thread.sleep(3000);
		
		Reporter.log("Test to verify user can't login with  UnregisteredPhoneNumber and a valid password fields completed !!!", true);
	}
	
	@Test(priority = 8, description = "This test case will verify user can't login with  valid phoneNumber and a wrong password fields")
	public void ValidPhoneNumberInvalidPassword() throws IOException, InterruptedException {
	
		Reporter.log("Test to verify user can't login with valid phoneNumber and a wrong password fields started !!!", true);
		
		LoginPageObjects LoginPageObj = new LoginPageObjects(driver);
		LoginPageObj.EnterPhoneNumber("09125490124");
		LoginPageObj.EnterPassword("Ademola");
		LoginPageObj.ClickSignInButton();
		LoginPageObj.InvalidPasswordAssertion();
		Thread.sleep(3000);
		
		Reporter.log("Test to verify user can't login with valid phoneNumber and a wrong password fields completed !!!", true);
	}
	
	@Test(priority=9, description = "This TestCase will perform phoneNumber login with valid credentials")
	public void ValidPhoneNumberValidPassword() throws IOException, InterruptedException {
		
		Reporter.log("Test to perform phoneNumber login with valid credentials started !!!", true);
		
		LoginPageObjects LoginPageObj = new LoginPageObjects(driver);
	    LoginPageObj.EnterPhoneNumber("09125490124");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		 Thread.sleep(3000);
		LoginPageObj.ValidateHomePageUrl();
		 Thread.sleep(3000);
	     
		 Reporter.log("Test to perform phoneNumber login with valid credentials completed !!!", true);
		 
	}
	
	 

}



//@Test(priority = 1, description =
//"This test case will verify user can't login with  UnregisteredEmail and a valid password fields"
//) public void InvalidPasswordInput() throws IOException, InterruptedException
//{
//Reporter.
//log("Test to verify user can't login with  UnregisteredEmail and a valid password fields started !!!"
//, true);
// LoginPageObjects LoginPageObj = new LoginPageObjects(driver);
//LoginPageObj.EnterEmail("demmy4bi@gmail.com");
//LoginPageObj.InvalidPasswordInput(); LoginPageObj.InvalidPasswordAssertion();
//Thread.sleep(3000);
//Reporter.
//log("Test to verify user can't login with  UnregisteredEmail and a valid password fields completed !!!"
//, true); }
