package com.rebirthQuickteller.TestCases;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.SendMoneyPageObjects;
import com.rebirthQuickteller.base.TestBase;
import pages.LoginPageObjects;
import pages.RechargePageObjects;
import pages.SignUpPageObjects;

public class AirtimeRecharge extends TestBase {
	LoginPageObjects LoginPageObj = new LoginPageObjects(driver);
	RechargePageObjects RechargePageObj = new RechargePageObjects(driver);
	SignUpPageObjects SignUpPageObj = new SignUpPageObjects(driver);
	SendMoneyPageObjects SendMoneyObj = new SendMoneyPageObjects(driver);

	@Test(priority = 1, description = "This test case will check user should not be able to recharge with invalid phoneNumber")
	public void InvalidphoneNumberAirtimeRecharge() throws IOException, InterruptedException {
		Reporter.log("Test to check user should not be able to recharge with invalid phoneNumber started !!!", true);
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();

		// LoginPageObj.doitlatercllick();
		RechargePageObj.ClickAirtimeDataButton();
		RechargePageObj.ClickNewAirtimeButton();
		// RechargePageObj.SelectCountryCode("Nigeria");
		RechargePageObj.EnterPhoneNumber("08074");
		// RechargePageObj.ClickNext();
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

		// LoginPageObj.doitlatercllick();
		RechargePageObj.ClickAirtimeDataButton();
		RechargePageObj.ClickNewAirtimeButton();
		RechargePageObj.EnterPhoneNumber("0805" + RandomNigeriaPhoneGenerator());
		RechargePageObj.SelectGlo();
		RechargePageObj.EnterAmount("1000");
		RechargePageObj.ClickNext();
		RechargePageObj.ClickPay();
		RechargePageObj.PayWithQuicktellerAccount();
		SendMoneyObj.InputTransactionPin("0000");
		// RechargePageObj.PayBtn();
		SendMoneyObj.InvalidTransactionPINAssertion();

		Reporter.log("Test to perform recharge with QTAccount using Invalid Transacton Pin completed !!!", true);
	}

	@Test(priority = 3, description = "This test case will perform Glo recharge with QTAccount ")
	public void QTAccountGloAirtimeRecharge() throws IOException, InterruptedException {

		Reporter.log("Test to perform Glo recharge with QTAccount started !!!", true);
		NavigateHomePage();
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();

		// LoginPageObj.doitlatercllick();
		RechargePageObj.ClickAirtimeDataButton();
		RechargePageObj.ClickNewAirtimeButton();
		RechargePageObj.EnterPhoneNumber("0805" + RandomNigeriaPhoneGenerator());
		RechargePageObj.SelectGlo();
		RechargePageObj.EnterAmount("1000");
		RechargePageObj.ClickNext();
		RechargePageObj.ClickPay();
		RechargePageObj.PayWithQuicktellerAccount();
		SendMoneyObj.InputTransactionPin("8010");
		// RechargePageObj.PayBtn();
		RechargePageObj.SuccessfulRechargeAssertion();
		// Thread.sleep(2000);

		RechargePageObj.ClickReceipt();
		/*
		 * RechargePageObj.CloseReceipt(); RechargePageObj.ClickDoneBtn();
		 */

		// Thread.sleep(4000);
		// RechargePageObj.CloseReceipt();

		// LoginPageObj.ClickLogoutDropdownBtn();
		// LoginPageObj.ClickLogoutButton();
		Reporter.log("Test to perform Glo recharge with QTAccount completed !!!", true);
	}

	@Test(priority = 4, description = "This test case will perform Mtn recharge with QTAccount ")
	public void QTAccountMtnAirtimeRecharge() throws IOException, InterruptedException {

		Reporter.log("Test to perform Mtn recharge with QTAccount started !!!", true);
		NavigateHomePage();
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();

		// LoginPageObj.doitlatercllick();
		RechargePageObj.ClickAirtimeDataButton();
		RechargePageObj.ClickNewAirtimeButton();
		RechargePageObj.EnterPhoneNumber("0806" + RandomNigeriaPhoneGenerator());
		RechargePageObj.SelectMtn();
		RechargePageObj.EnterAmount("1000");
		RechargePageObj.ClickNext();
		RechargePageObj.ClickPay();
		RechargePageObj.PayWithQuicktellerAccount();
		SendMoneyObj.InputTransactionPin("8010");
		// RechargePageObj.PayBtn();
		RechargePageObj.SuccessfulRechargeAssertion();
		// Thread.sleep(2000);

		RechargePageObj.ClickReceipt();
		/*
		 * RechargePageObj.CloseReceipt(); RechargePageObj.ClickDoneBtn();
		 */

		// Thread.sleep(4000);
		// RechargePageObj.CloseReceipt();

		// LoginPageObj.ClickLogoutDropdownBtn();
		// LoginPageObj.ClickLogoutButton();
		Reporter.log("Test to perform Mtn recharge with QTAccount completed !!!", true);
	}

	@Test(priority = 5, description = "This test case will perform Airtel recharge with QTAccount ")
	public void QTAccountAirtelAirtimeRecharge() throws IOException, InterruptedException {

		Reporter.log("Test to perform Airtel recharge with QTAccount started !!!", true);
		NavigateHomePage();
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();

		// LoginPageObj.doitlatercllick();
		RechargePageObj.ClickAirtimeDataButton();
		RechargePageObj.ClickNewAirtimeButton();
		RechargePageObj.EnterPhoneNumber("0802" + RandomNigeriaPhoneGenerator());
		RechargePageObj.SelectAirtel();
		RechargePageObj.EnterAmount("1000");
		RechargePageObj.ClickNext();
		RechargePageObj.ClickPay();
		RechargePageObj.PayWithQuicktellerAccount();
		SendMoneyObj.InputTransactionPin("8010");
		// RechargePageObj.PayBtn();
		RechargePageObj.SuccessfulRechargeAssertion();
		// Thread.sleep(2000);

		RechargePageObj.ClickReceipt();
		/*
		 * RechargePageObj.CloseReceipt(); RechargePageObj.ClickDoneBtn();
		 */

		// Thread.sleep(4000);
		// RechargePageObj.CloseReceipt();

		// LoginPageObj.ClickLogoutDropdownBtn();
		// LoginPageObj.ClickLogoutButton();
		Reporter.log("Test to perform Airtel recharge with QTAccount completed !!!", true);
	}

	@Test(priority = 6, description = "This test case will perform 9moblie recharge with QTAccount ")
	public void QTAccount9mobileAirtimeRecharge() throws IOException, InterruptedException {

		Reporter.log("Test to perform 9mobile recharge with QTAccount started !!!", true);
		NavigateHomePage();
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();

		// LoginPageObj.doitlatercllick();
		RechargePageObj.ClickAirtimeDataButton();
		RechargePageObj.ClickNewAirtimeButton();
		RechargePageObj.EnterPhoneNumber("0809" + RandomNigeriaPhoneGenerator());
		RechargePageObj.Select9mobile();
		RechargePageObj.EnterAmount("1000");
		RechargePageObj.ClickNext();
		RechargePageObj.ClickPay();
		RechargePageObj.PayWithQuicktellerAccount();
		SendMoneyObj.InputTransactionPin("8010");
		// RechargePageObj.PayBtn();
		RechargePageObj.SuccessfulRechargeAssertion();
		// Thread.sleep(2000);

		RechargePageObj.ClickReceipt();
		/*
		 * RechargePageObj.CloseReceipt(); RechargePageObj.ClickDoneBtn();
		 */

		// Thread.sleep(4000);
		// RechargePageObj.CloseReceipt();

		// LoginPageObj.ClickLogoutDropdownBtn();
		// LoginPageObj.ClickLogoutButton();
		Reporter.log("Test to perform 9mobile recharge with QTAccount completed !!!", true);
	}

	@Test(priority = 7, description = "This test case will validate user can not recharge airtime with Insufficent QTAccount balance")
	public void InsufficentQTAccountAirtimeRecharge() throws IOException, InterruptedException {

		Reporter.log("Test to validate user can not recharge airtime with Insufficent QTAccount balance started !!!",
				true);
		NavigateHomePage();
		LoginPageObj.ClickSignInWithPhoneNumberButton();
		LoginPageObj.EnterPhoneNumber("09074258404");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();

		// LoginPageObj.doitlatercllick();
		RechargePageObj.ClickAirtimeDataButton();
		RechargePageObj.ClickNewAirtimeButton();
		RechargePageObj.EnterPhoneNumber("0805" + RandomNigeriaPhoneGenerator());
		RechargePageObj.SelectGlo();
		RechargePageObj.EnterAmount("100");
		RechargePageObj.ClickNext();
		RechargePageObj.ClickPay();
		RechargePageObj.InsuffientFundAssertion();
		Reporter.log("Test to validate user can not recharge airtime with Insufficent QTAccount balance completed !!!",
				true);
	}

	@Test(priority = 8, description = "This test case will validate user can not recharge with amount below #50")
	public void ValidateAirtimeRechargeBelow50naira() throws IOException, InterruptedException {

		Reporter.log("Test to validate user can not recharge with amount below #50 started !!!", true);
		NavigateHomePage();
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();

		// LoginPageObj.doitlatercllick();
		RechargePageObj.ClickAirtimeDataButton();
		RechargePageObj.ClickNewAirtimeButton();
		RechargePageObj.EnterPhoneNumber("0805" + RandomNigeriaPhoneGenerator());
		RechargePageObj.SelectGlo();
		RechargePageObj.EnterAmount("10");
		RechargePageObj.AirtimeRechargeBelow50nairaAssertion();
		Reporter.log("Test to validate user can not recharge with amount below #50 completed !!!", true);
	}

	@Test(priority = 9, description = "This test case will perform self recharge with OneTouch ")
	public void OneTouchAirtimeRecharge() throws IOException, InterruptedException {

		Reporter.log("Test to perform self recharge with OneTouch started !!!", true);
		NavigateHomePage();
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		RechargePageObj.ClickAirtimeDataButton();
		Thread.sleep(5000);
		RechargePageObj.ClickSelfSavedBene();
		RechargePageObj.EnterAmount1("100");
		RechargePageObj.ClickPaywithOneTouch();
		// RechargePageObj.SuccessfulRechargeAssertion();
		RechargePageObj.oneAssertion();
		RechargePageObj.ClickReceipt();
		RechargePageObj.oneTouchSuccessAssertion();
		/*
		 * RechargePageObj.CloseReceipt(); RechargePageObj.ClickDoneBtn();
		 */
		// LoginPageObj.ClickLogoutDropdownBtn();
		// LoginPageObj.ClickLogoutButton();
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
		Thread.sleep(1000);
		RechargePageObj.ClickSelfSavedBene();
		RechargePageObj.EnterAmount1("100000000");
		RechargePageObj.ClickPaywithOneTouch();
		RechargePageObj.InsufficientFundOneTouchSelfRechargeAssertion();
		Reporter.log(
				"Test to validate user cannot perform self recharge using OneTouch with InsufficientFund Completed !!!",
				true);
	}

	@Test(priority = 11, description = "This test case will perform recharge with Card ")
	// 4
	public void CardAirtimeRecharge() throws IOException, InterruptedException {

		Reporter.log("Test to perform recharge with card started !!!", true);
		NavigateHomePage();
		// RechargePageObj.SelectCountryCode("Nigeria");
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();

		// LoginPageObj.doitlatercllick();
		RechargePageObj.ClickAirtimeDataButton();
		RechargePageObj.ClickNewAirtimeButton();
		RechargePageObj.EnterPhoneNumber("0805" + RandomNigeriaPhoneGenerator());
		RechargePageObj.SelectGlo();
		RechargePageObj.EnterAmount("1000");
		RechargePageObj.ClickNext();
		RechargePageObj.ClickPay();
		RechargePageObj.ClickUseNewCard();
		RechargePageObj.InputCardNumber("5612330000000000099");
		RechargePageObj.InputCardExpiryDate("03/50");
		RechargePageObj.InputCardCVV("111");
		RechargePageObj.InputCardPIN("1234");
		// RechargePageObj.ClickSaveCard();
		RechargePageObj.ClickNext();

		RechargePageObj.SuccessfulRechargeAssertion();

		RechargePageObj.ClickReceipt();
		/*
		 * RechargePageObj.CloseReceipt(); RechargePageObj.ClickDoneBtn();
		 */

		// LoginPageObj.ClickLogoutDropdownBtn();
		// LoginPageObj.ClickLogoutButton();
		Reporter.log("Test to perform recharge with card completed !!!", true);
	}

}
