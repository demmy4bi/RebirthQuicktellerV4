package com.rebirthQuickteller.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.rebirthQuickteller.base.TestBase;

public class forgotPassword extends TestBase {

	@Test
	void check() throws IOException, InterruptedException {
		
		//click forgotPassword Button
		chooseElement("forgotPassword_LINKTEXT").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Enter Email
		chooseElement("ForgotPasswordEmail_NAME").clear();
		type("ForgotPasswordEmail_NAME","txtUsername");
		chooseElement("ForgotPasswordEmail_NAME").sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
		
		//click resetPassword button
		chooseElement("ResetPassword_CSS").click();
		Thread.sleep(3000);
		
		//open emai button
				chooseElement("ResetPassword_CSS").click();
				Thread.sleep(3000);
		
		// select email 
		chooseElement("openEmail_CSS").click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		
		
	}
	
	
}
