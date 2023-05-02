package com.rebirthQuickteller.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.rebirthQuickteller.base.TestBase;
import pages.LoginPageObjects;
import pages.RechargePageObjects;

public class Recharge extends TestBase {
	LoginPageObjects LoginPageObj = new LoginPageObjects(driver);
	RechargePageObjects RechargePageObj = new RechargePageObjects(driver);
	
	
	
	@Test(priority = 1)
	public void AirtimeRecharge() throws IOException, InterruptedException {

		
		LoginPageObj.EnterEmail("demmylee56@gmail.com");
		LoginPageObj.EnterPassword("Ademola4@");
		LoginPageObj.ClickSignInButton();
		LoginPageObj.doitlatercllick();

		
		RechargePageObj.ClickAirtimeDataButton();
		RechargePageObj.ClickNewAirtimeButton();
		RechargePageObj.SelectCountryCode("Nigeria");
		RechargePageObj.EnterPhoneNumber(RandomNigeriaPhoneGenerator());
		RechargePageObj.ClickNext();
		RechargePageObj.EnterRechargeAmount("1000");
		RechargePageObj.ClickPay();
		RechargePageObj.ClickUseNewCard();
		RechargePageObj.InputCardNumber("5612330000000000099");
		RechargePageObj.InputCardExpiryDate("03/50");
		RechargePageObj.InputCardCVV("111");
		RechargePageObj.InputCardPIN("1234");
		RechargePageObj.ClickSaveCard();
		RechargePageObj.ClickNext();
		Thread.sleep(10000);
		RechargePageObj.SuccessfulRechargeAssertion();
		Thread.sleep(2000);

		RechargePageObj.ClickReceipt();
		RechargePageObj.ViewReceipt();

		Thread.sleep(4000);
		RechargePageObj.CloseReceipt();

		//LoginPageObj.ClickLogoutDropdownBtn();
		//LoginPageObj.ClickLogoutButton();

	}

	@Test(priority = 2)
	public void InvalidphoneNumberAirtimeRecharge() throws IOException, InterruptedException {
    
		RechargePageObj.ClickNewAirtimeButton();
		RechargePageObj.SelectCountryCode("Nigeria");
		RechargePageObj.EnterPhoneNumber("08074");
		LoginPageObj.InvalidphoneNumberInputAssertion();
		RechargePageObj.ClickNext();
		Thread.sleep(6000);
		
		
	}

	
	public void PaymentWithInvalidCardNumber() {
		
	}
	
	
}
