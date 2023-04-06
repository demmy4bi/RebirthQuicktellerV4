package com.rebirthQuickteller.TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.rebirthQuickteller.assertions.Assertions;
import com.rebirthQuickteller.base.TestBase;

public class ValidateLoginWithEmail extends TestBase {

	String actualerrormessage;
	String expectederrormessage = "This email is not registered to an account";
	String expectederrormessage2 = "Incorrect password. 3 attempts remaining.";

	@Test(priority = 1, description = "This test case will verify user can't login with  invalid email and a valid password fields")
	void check1() throws IOException, InterruptedException {

		Reporter.log("Test to verify user can't login with  invalid email and a valid password fields started!!!",true);
		
		
		// Enter Username
		chooseElement("username_NAME").clear();
		type("username_NAME", "txtUsername2");
		chooseElement("username_NAME").sendKeys(Keys.TAB);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("emailAddress entered successfully",true);
		Thread.sleep(3000);
		

		// Enter Password
		chooseElement("password_NAME").clear();
		type("password_NAME", "txtEmailPassword");
		chooseElement("password_NAME").sendKeys(Keys.TAB);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Password entered successfully",true);
		Thread.sleep(3000);
		

		// click Sign button
		chooseElement("SignIn_CSS").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("SignIn button clicked successfully",true);
		Thread.sleep(3000);
		

		// Assertion
		actualerrormessage = chooseElement("InvalidSignInAsertion_CSS").getText();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Actual error message  =" + actualerrormessage);
		Assert.assertEquals(actualerrormessage, expectederrormessage);

		System.out.println("Test Passed");

		Reporter.log(
				"Test to verify user can't login with  invalid email and a valid password fields completed successfully",
				true);
		Thread.sleep(3000);

	}

	@Test(priority = 2, description = "This test case will verify user can't login with  valid email and a wrong password fields")
	void check2() throws IOException, InterruptedException {
		Reporter.log("Test to verify user can't login with  valid email and a wrong password fields started!!!",true);
		
		
		// Enter Username		
		chooseElement("username_NAME").clear();
		type("username_NAME", "txtUsername");
		chooseElement("username_NAME").sendKeys(Keys.TAB);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("emailAddress entered successfully",true);
		Thread.sleep(3000);

		// Enter Password
		chooseElement("password_NAME").clear();
		type("password_NAME", "txtPassword2");
		chooseElement("password_NAME").sendKeys(Keys.TAB);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Password entered successfully",true);
		Thread.sleep(3000);

		// click Sign button
		chooseElement("SignIn_CSS").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("SignIn button clicked successfully",true);
		Thread.sleep(3000);

		// Assertion
		actualerrormessage = chooseElement("InvalidSignInAsertion_CSS").getText();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Actual error message  =" + actualerrormessage);
		Assert.assertEquals(actualerrormessage, expectederrormessage2);

		System.out.println("Test Passed");

		// ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,88)");

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log(
				"Test to verify user can't login with  valid email and invalid password fields is completed successfully",
				true);
		Thread.sleep(3000);

	}

	@Test(priority = 3, description = "This TestCase will perform login with valid credentials")
	public void SigninEmail() throws IOException, InterruptedException {

		Reporter.log("Test to perform login with valid credentials started!!!",true);
		
		// Enter Username
		chooseElement("username_NAME").clear();
		type("username_NAME", "txtUsername");
		chooseElement("username_NAME").sendKeys(Keys.TAB);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("emailAddress entered successfully",true);
		Thread.sleep(3000);

		// Enter Password
		chooseElement("password_NAME").clear();
		type("password_NAME", "txtEmailPassword");
		chooseElement("password_NAME").sendKeys(Keys.TAB);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Password entered successfully",true);
		Thread.sleep(3000);

		// click Sign button
		chooseElement("SignIn_CSS").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("SignIn button clicked successfully",true);
		Thread.sleep(3000);

		//((JavascriptExecutor) driver).executeScript("window.scrollTo(0,88)");
		System.out.println("valid Login  " + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Test to perform login with valid credentials completed succesfully", true);
		Thread.sleep(3000);

		// actualSignInurl driver.getCurrentUrl()
		String expURL = "https://rebirth.quickteller.com/dashboard";
		Boolean responses = Assertions.ValidateUrl(driver, expURL);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Get URL to confirm user is been redirected to dashboard homepage is" + responses);

	}

}
