package com.rebirthQuickteller.TestCases;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.rebirthQuickteller.base.TestBase;

import pages.LoginPageObjects;
import pages.RechargePageObjects;
import pages.SendMoneyPageObjects;
 

public class DataRecharge extends TestBase {

	LoginPageObjects LoginPageObj = new LoginPageObjects(driver);
	RechargePageObjects RechargePageObj = new RechargePageObjects(driver);
	SendMoneyPageObjects SendMoneyObj = new SendMoneyPageObjects(driver);
	
	@Test(priority = 1, description = "This test case will check user should not be able to recharge with invalid phoneNumber")
	public void InvalidphoneNumberAirtimeRecharge() throws IOException, InterruptedException {
		Reporter.log("Test to check user should not be able to recharge with invalid phoneNumber started !!!", true);
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		RechargePageObj.ClickAirtimeDataButton();
		RechargePageObj.ClickNewAirtimeButton();
		RechargePageObj.ClickData();
		RechargePageObj.EnterPhoneNumber("08074");
		LoginPageObj.InvalidphoneNumberInputAssertion();
		Reporter.log("Test to check user should not be able to recharge with invalid phoneNumber completed !!!", true);
	}

	@Test(priority = 2, description = "This test case will perform recharge with QTAccount using Invalid Transacton Pin ")
	public void QTAccountAirtimeRechargeWithInvalidTransactionPin() throws IOException, InterruptedException {

		Reporter.log("Test to perform recharge with QTAccount using Invalid Transacton Pin started !!!", true);
		NavigateHomePage();
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		RechargePageObj.ClickAirtimeDataButton();
		RechargePageObj.ClickNewAirtimeButton();
		RechargePageObj.ClickData();
		RechargePageObj.EnterPhoneNumber("0805" + RandomNigeriaPhoneGenerator());
		RechargePageObj.SelectGlo();
		RechargePageObj.ClickDatadropdown();
		RechargePageObj.EnterDataPlanAmount("100");
		RechargePageObj.SelectDataPlan();
		RechargePageObj.ClickNext();
		RechargePageObj.ClickPay();
		RechargePageObj.PayWithQuicktellerAccount();
		SendMoneyObj.InputTransactionPin("0000");
		SendMoneyObj.InvalidTransactionPINAssertion();

		Reporter.log("Test to perform recharge with QTAccount using Invalid Transacton Pin completed !!!", true);
	}

	//@Test(priority = 3, description = "This test case will perform Glo Datarecharge with QTAccount ")
	public void QTAccountGloDataRecharge() throws IOException, InterruptedException {

		Reporter.log("Test to perform Glo Datarecharge with QTAccount started !!!", true);
		//NavigateHomePage();
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		RechargePageObj.ClickAirtimeDataButton();
		RechargePageObj.ClickNewAirtimeButton();
		RechargePageObj.ClickData();
		RechargePageObj.EnterPhoneNumber("0805" + RandomNigeriaPhoneGenerator());
		RechargePageObj.SelectGlo();
		RechargePageObj.ClickDatadropdown();
		RechargePageObj.EnterDataPlanAmount("100");
		RechargePageObj.SelectDataPlan();
		RechargePageObj.ClickNext();
		RechargePageObj.ClickPay();
		RechargePageObj.PayWithQuicktellerAccount();
		SendMoneyObj.InputTransactionPin("8409");
		RechargePageObj.SuccessfulRechargeAssertion();
		RechargePageObj.ClickReceipt();
		RechargePageObj.CloseReceipt();
		RechargePageObj.ClickDoneBtn();
		LoginPageObj.ClickLogoutDropdownBtn();
		LoginPageObj.ClickLogoutButton();
		Reporter.log("Test to perform Glo Datarecharge with QTAccount completed !!!", true);
	}

	//@Test(priority = 4, description = "This test case will perform Mtn Datarecharge with QTAccount ")
	public void QTAccountMtnDataRecharge() throws IOException, InterruptedException {

		Reporter.log("Test to perform Mtn Datarecharge with QTAccount started !!!", true);
		NavigateHomePage();
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		RechargePageObj.ClickAirtimeDataButton();
		RechargePageObj.ClickNewAirtimeButton();
		RechargePageObj.ClickData();
		RechargePageObj.EnterPhoneNumber("0806" + RandomNigeriaPhoneGenerator());
		RechargePageObj.SelectMtn();
		RechargePageObj.ClickDatadropdown();
		RechargePageObj.EnterDataPlanAmount("100");
		RechargePageObj.SelectDataPlan();
		RechargePageObj.ClickNext();
		RechargePageObj.ClickPay();
		RechargePageObj.PayWithQuicktellerAccount();
		SendMoneyObj.InputTransactionPin("8409");
		RechargePageObj.SuccessfulRechargeAssertion();
		RechargePageObj.ClickReceipt();
		RechargePageObj.CloseReceipt();
		RechargePageObj.ClickDoneBtn();
		LoginPageObj.ClickLogoutDropdownBtn();
		LoginPageObj.ClickLogoutButton();
		Reporter.log("Test to perform Mtn Datarecharge with QTAccount completed !!!", true);
	}

	//@Test(priority = 5, description = "This test case will perform Airtel Datarecharge with QTAccount ")
	public void QTAccountAirtelDataRecharge() throws IOException, InterruptedException {

		Reporter.log("Test to perform Airtel Datarecharge with QTAccount started !!!", true);
		NavigateHomePage();
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		RechargePageObj.ClickAirtimeDataButton();
		RechargePageObj.ClickNewAirtimeButton();
		RechargePageObj.ClickData();
		RechargePageObj.EnterPhoneNumber("0802" + RandomNigeriaPhoneGenerator());
		RechargePageObj.SelectAirtel();
		RechargePageObj.ClickDatadropdown();
		RechargePageObj.EnterDataPlanAmount("100");
		RechargePageObj.SelectDataPlan();
		RechargePageObj.ClickNext();
		RechargePageObj.ClickPay();
		RechargePageObj.PayWithQuicktellerAccount();
		SendMoneyObj.InputTransactionPin("8409");
		RechargePageObj.SuccessfulRechargeAssertion();
		RechargePageObj.ClickReceipt();
		RechargePageObj.CloseReceipt();
		RechargePageObj.ClickDoneBtn();
		LoginPageObj.ClickLogoutDropdownBtn();
		LoginPageObj.ClickLogoutButton();
		Reporter.log("Test to perform Airtel Datarecharge with QTAccount completed !!!", true);
	}

	//@Test(priority = 6, description = "This test case will perform 9moblie Datarecharge with QTAccount ")
	public void QTAccount9mobileDataRecharge() throws IOException, InterruptedException {

		Reporter.log("Test to perform 9mobile Datarecharge with QTAccount started !!!", true);
		NavigateHomePage();
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		RechargePageObj.ClickAirtimeDataButton();
		RechargePageObj.ClickNewAirtimeButton();
		RechargePageObj.ClickData();
		RechargePageObj.EnterPhoneNumber("0809" + RandomNigeriaPhoneGenerator());
		RechargePageObj.Select9mobile();
		RechargePageObj.ClickDatadropdown();
		RechargePageObj.EnterDataPlanAmount("100");
		RechargePageObj.SelectDataPlan();
		RechargePageObj.ClickNext();
		RechargePageObj.ClickPay();
		RechargePageObj.PayWithQuicktellerAccount();
		SendMoneyObj.InputTransactionPin("8409");
		RechargePageObj.SuccessfulRechargeAssertion();
		RechargePageObj.ClickReceipt();
		RechargePageObj.CloseReceipt();
		RechargePageObj.ClickDoneBtn();
		LoginPageObj.ClickLogoutDropdownBtn();
		LoginPageObj.ClickLogoutButton();
		Reporter.log("Test to perform 9mobile Datarecharge with QTAccount completed !!!", true);
	}

	@Test(priority = 7, description = "This test case will validate user can not recharge data with Insufficent QTAccount balance")
	public void InsufficentQTAccountDataRecharge() throws IOException, InterruptedException {

		Reporter.log("Test to validate user can not recharge data with Insufficent QTAccount balance started !!!",
				true);
		NavigateHomePage();
		LoginPageObj.ClickSignInWithPhoneNumberButton();
		LoginPageObj.EnterPhoneNumber("09074258404");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		RechargePageObj.ClickAirtimeDataButton();
		RechargePageObj.ClickNewAirtimeButton();
		RechargePageObj.ClickData();
		RechargePageObj.EnterPhoneNumber("0805" + RandomNigeriaPhoneGenerator());
		RechargePageObj.SelectGlo();
		RechargePageObj.ClickDatadropdown();
		RechargePageObj.EnterDataPlanAmount("100");
		RechargePageObj.SelectDataPlan();
		RechargePageObj.ClickNext();
		RechargePageObj.ClickPay();
		RechargePageObj.InsuffientFundAssertion();
		Reporter.log("Test to validate user can not recharge data with Insufficent QTAccount balance completed !!!",
				true);
	}

	
	//@Test(priority = 9, description = "This test case will perform self recharge with OneTouch ")
	public void OneTouchAirtimeRecharge() throws IOException, InterruptedException {

		Reporter.log("Test to perform self recharge with OneTouch started !!!", true);
		NavigateHomePage();
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		RechargePageObj.ClickAirtimeDataButton();
		Thread.sleep(2000);
		RechargePageObj.ClickSelfSavedBene();
		Thread.sleep(1000);
		RechargePageObj.ClickData();
		Thread.sleep(1000);
		RechargePageObj.ClickDatadropdown();
		Thread.sleep(1000);
		RechargePageObj.EnterDataPlanAmount("100");
		Thread.sleep(1000);
		RechargePageObj.SelectDataPlan();
		Thread.sleep(1000);
		RechargePageObj.ClickPaywithOneTouch();
		Thread.sleep(2000);
		RechargePageObj.oneAssertion();
		RechargePageObj.ClickReceipt();
		RechargePageObj.oneTouchSuccessAssertion();
		RechargePageObj.CloseReceipt();
		RechargePageObj.ClickDoneBtn();
		LoginPageObj.ClickLogoutDropdownBtn();
		LoginPageObj.ClickLogoutButton();
		Reporter.log("Test to perform self recharge with OneTouch completed !!!", true);
	}

	@Test(priority = 10, description = "This test case will validate user cannot perform self recharge using OneTouch with InsufficientFund ")
	public void InsufficientOneTouchSelfRecharge() throws IOException, InterruptedException {

		Reporter.log(
				"Test to validate user cannot perform self recharge using OneTouch with InsufficientFund Started !!!",
				true);
		NavigateHomePage();
		LoginPageObj.ClickSignInWithPhoneNumberButton();
		LoginPageObj.EnterPhoneNumber("09074258404");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		RechargePageObj.ClickAirtimeDataButton();
		Thread.sleep(2000);
		RechargePageObj.ClickSelfSavedBene();
		Thread.sleep(1000);
		RechargePageObj.ClickData();
		Thread.sleep(1000);
		RechargePageObj.ClickDatadropdown();
		Thread.sleep(1000);
		RechargePageObj.EnterDataPlanAmount("100");
		Thread.sleep(1000);
		RechargePageObj.SelectDataPlan();
		Thread.sleep(1000);
		RechargePageObj.ClickPaywithOneTouch();
		RechargePageObj.InsufficientFundOneTouchSelfRechargeAssertion();
		Reporter.log(
				"Test to validate user cannot perform self recharge using OneTouch with InsufficientFund Completed !!!",
				true);
	}

	//@Test(priority = 11, description = "This test case will perform data recharge with Card ")
	public void CardDataRecharge() throws IOException, InterruptedException {

		Reporter.log("Test to perform data recharge with card started !!!", true);
		NavigateHomePage();
		// RechargePageObj.SelectCountryCode("Nigeria");
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		RechargePageObj.ClickAirtimeDataButton();
		RechargePageObj.ClickNewAirtimeButton();
		RechargePageObj.ClickData();
		RechargePageObj.EnterPhoneNumber("0805" + RandomNigeriaPhoneGenerator());
		RechargePageObj.SelectGlo();
		RechargePageObj.ClickDatadropdown();
		RechargePageObj.EnterDataPlanAmount("100");
		RechargePageObj.SelectDataPlan();
		RechargePageObj.ClickNext();
		RechargePageObj.ClickPay();
		RechargePageObj.ClickUseNewCard();
		RechargePageObj.InputCardNumber("5612330000000000099");
		RechargePageObj.InputCardExpiryDate("03/50");
		RechargePageObj.InputCardCVV("111");
		RechargePageObj.InputCardPIN("1234"); 
		RechargePageObj.ClickNext();
		RechargePageObj.SuccessfulRechargeAssertion();
		RechargePageObj.ClickReceipt();
		RechargePageObj.CloseReceipt();
		RechargePageObj.ClickDoneBtn();

		// LoginPageObj.ClickLogoutDropdownBtn();
		// LoginPageObj.ClickLogoutButton();
		Reporter.log("Test to perform data recharge with card completed !!!", true);
	}
	
	
	
	
	
	
}
