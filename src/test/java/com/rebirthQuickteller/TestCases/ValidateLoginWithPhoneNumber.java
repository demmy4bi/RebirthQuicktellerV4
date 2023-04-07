package com.rebirthQuickteller.TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.rebirthQuickteller.assertions.Assertions;
import com.rebirthQuickteller.base.TestBase;

public class ValidateLoginWithPhoneNumber extends TestBase {

	String actualerrormessage;
	String expectederrormessage = "This mobile number is not registered to an account";
	String expectederrormessage2 = "Incorrect password. 3 attempts remaining.";

	@Test(priority = 3, description = "This TestCase will perform login with valid credentials ")
	public void ValidCredential_phoneNumberLoginTest() throws IOException, InterruptedException {

		Reporter.log("Test to perform login with valid credentials started!!!", true);

		// Enter Phonenumber
		chooseElement("phoneNumber_NAME").clear();
		type("phoneNumber_NAME", "txtphoneNumber");
		chooseElement("phoneNumber_NAME").sendKeys(Keys.TAB);
		Reporter.log("phoneNumber entered successfully", true);
		Thread.sleep(3000);

		// Enter Password
		chooseElement("password_NAME").clear();
		type("password_NAME", "txtPhonePassword");
		chooseElement("password_NAME").sendKeys(Keys.TAB);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Reporter.log("Password entered successfully", true);
		Thread.sleep(3000);

		// Click Sign In
		chooseElement("SignIn_CSS").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("SignIn button clicked successfully", true);
		Thread.sleep(3000);
		

		//((JavascriptExecutor) driver).executeScript("window.scrollTo(0,88)");
		System.out.println("valid Login  " + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Test to perform login with valid credentials completed succesfully", true);
		Thread.sleep(4000);

		// actualSignInurl driver.getCurrentUrl()
		String expURL = "https://rebirth.quickteller.com/dashboard";
		Boolean responses = Assertions.ValidateUrl(driver, expURL);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Get URL to confirm user is been redirected to dashboard homepage is" + responses);

		// ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,88)");
		
		 
		

	}

	@Test(priority = 1, description = "This test case will verify user can't login with wrong phonenumber and a valid password fields")
	void WrongPhonenumber_ValidPassword_phoneNumberLoginTest() throws IOException, InterruptedException {

		Reporter.log("Test to verify user can't login with wrong phonenumber and a valid password fields!!!", true);

		// click Sign In with PhoneNumber
		chooseElement("ClickSignINphoneNumber_CSS").click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Reporter.log("Sign In with PhoneNumber button clicked successfully", true);
		Thread.sleep(3000);

		// Enter Phonenumber
		chooseElement("phoneNumber_NAME").clear();
		type("phoneNumber_NAME", "txtWrongphoneNumber");
		chooseElement("phoneNumber_NAME").sendKeys(Keys.TAB);
		Reporter.log("phoneNumber entered successfully", true);
		Thread.sleep(3000);

		// Enter Password
		chooseElement("password_NAME").clear();
		type("password_NAME", "txtPhonePassword");
		chooseElement("password_NAME").sendKeys(Keys.TAB);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Reporter.log("Password entered successfully", true);
		Thread.sleep(3000);

		// Click Sign In
		chooseElement("SignIn_CSS").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("SignIn button clicked successfully", true);
		Thread.sleep(1000);

		// Assertion
		actualerrormessage = chooseElement("InvalidSignInAsertion_CSS").getText();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Actual error message  =" + actualerrormessage);
		Assert.assertEquals(actualerrormessage, expectederrormessage);
		System.out.println("Test Passed");

		// ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,88)");

		Reporter.log(
				"Test to verify user can't login with wrong phonenumber and a valid password fields completed successfully",
				true);
		Thread.sleep(4000);

	}

	@Test(priority = 2, description = "This test case will verify user can't login with valid phonenumber and a wrong password fields")
	void ValidPhonenumber_WrongPassword_phoneNumberLoginTest() throws IOException, InterruptedException {
		Reporter.log("Test to verify user can't login with valid phonenumber and a wrong password fields started!!!",
				true);

		// Enter Phonenumber
		chooseElement("phoneNumber_NAME").clear();
		type("phoneNumber_NAME", "txtphoneNumber");
		chooseElement("phoneNumber_NAME").sendKeys(Keys.TAB);
		Reporter.log("phoneNumber entered successfully", true);
		Thread.sleep(3000);

		// Enter Password
		chooseElement("password_NAME").clear();
		type("password_NAME", "txtPassword2");
		chooseElement("password_NAME").sendKeys(Keys.TAB);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Reporter.log("Password entered successfully", true);
		Thread.sleep(3000);

		// Click Sign In
		chooseElement("SignIn_CSS").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("SignIn button clicked successfully", true);
		Thread.sleep(1000);

		// Assertion
		actualerrormessage = chooseElement("InvalidSignInAsertion_CSS").getText();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Actual error message  =" + actualerrormessage);
		Assert.assertEquals(actualerrormessage, expectederrormessage2);
		System.out.println("Test Passed");

		// ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,88)");
		Reporter.log(
				"Test to verify user can't login with valid phonenumber and a wrong password fields completed successfully",
				true);
		Thread.sleep(4000);

	}

}
