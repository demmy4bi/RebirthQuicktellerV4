package com.rebirthQuickteller.TestCases;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.rebirthQuickteller.base.TestBase;

import pages.LoginPageObjects;
import pages.SendMoneyPageObjects;
import pages.SignUpPageObjects;

public class SendMoney  extends TestBase {

	SendMoneyPageObjects SendMoneyObj = new SendMoneyPageObjects(driver);
	LoginPageObjects LoginPageObj = new LoginPageObjects(driver);
	SignUpPageObjects SignUpPageObj = new SignUpPageObjects(driver);

	@Test(priority = 1, description = "This test case will perform transfer with QtAccount")
	public void QtAccountTransferWithValidDetails() throws IOException, InterruptedException {
		Reporter.log("Test to perform transfer with QTAccount started !!!", true);
		// NavigateHomePage();
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();

		SendMoneyObj.ClickSendMoney();
		SendMoneyObj.Click_SendtoBankAccount();	
		//SendMoneyObj.ClickNewButton();
		// SendMoneyObj.ClickSendNow();
		SendMoneyObj.EnterAccountNumber("1350008463");
		SendMoneyObj.ClickBankDropdown();
		SendMoneyObj.SelectBank("Quickteller");
		SendMoneyObj.SelectBankSearch();
		SendMoneyObj.QTAccountNameEnquiry_Validation();
		SendMoneyObj.EnterAmount("100");
		// SendMoneyObj.SaveasBeneficiary();
		SendMoneyObj.ClickSNext();
		SendMoneyObj.InputNarration("Bizza Bizza");
		SendMoneyObj.ClickSend();
		SendMoneyObj.PayWithQuicktellerAccount();
		SendMoneyObj.InputTransactionPin("8010");
		SendMoneyObj.SuccessfulTransferAssertion();
		SendMoneyObj.ViewReceipt();
		// SendMoneyObj.AssertiontoConfirmReceiptisVisible();
		// SendMoneyObj.CloseReceipt();

		Reporter.log("Test to perform transfer with QTAccount completed !!!", true);
	}

	@Test(priority = 2, description = "This test case will perform transfer with QtAccount Using Invalid Pin")
	public void QtAccountTransferWithInValidPIN() throws IOException, InterruptedException {
		Reporter.log("Test to perform transfer with QTAccount Using Invalid Pin started !!!", true);
		NavigateHomePage();
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();

		SendMoneyObj.ClickSendMoney();
		SendMoneyObj.Click_SendtoBankAccount();	
		// SendMoneyObj.ClickSendNow();
		SendMoneyObj.EnterAccountNumber("1350008463");
		SendMoneyObj.ClickBankDropdown();
		SendMoneyObj.SelectBank("Quickteller");
		SendMoneyObj.SelectBankSearch();
		// SendMoneyObj.SaveasBeneficiary();
		SendMoneyObj.EnterAmount("1000");
		SendMoneyObj.ClickSNext();
		SendMoneyObj.InputNarration("Bizza Bizza");
		SendMoneyObj.ClickSend();
		SendMoneyObj.PayWithQuicktellerAccount();
		SendMoneyObj.InputTransactionPin("0000");
		SendMoneyObj.InvalidTransactionPINAssertion();

		// SendMoneyObj.AssertiontoConfirmReceiptisVisible();
		// SendMoneyObj.CloseReceipt();

		Reporter.log("Test to perform transfer with QTAccount Using Invalid Pin completed !!!", true);
	}

	@Test(priority = 3, description = "This test case will perform Fund QtAccount with Ecash")
	public void FundAccountWithEcash() throws IOException, InterruptedException {
		Reporter.log("Test to perform Fund QTAccount with Ecash started !!!", true);
		NavigateHomePage();
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("09125490124");
		LoginPageObj.EnterEmail("dadubiaro@interswitch.com");
		LoginPageObj.EnterPassword("password");
		LoginPageObj.ClickSignInButton();
		SendMoneyObj.AddMoneyBtn();
		SendMoneyObj.FundAmount("500");
		SendMoneyObj.PayBtn();
		SendMoneyObj.PaywithEcash();
		SendMoneyObj.SuccessfulFundTransferAssertion();
		SendMoneyObj.ViewReceipt();
		// SendMoneyObj.AssertiontoConfirmReceiptisVisible();
		// SendMoneyObj.CloseReceipt();

		Reporter.log("Test to perform Fund QTAccount with Ecash completed !!!", true);
	}

	@Test(priority = 4, description = "This test case will validate user cannot perform Fund QtAccount with amount below #50")
	public void FundAccountWithAmountbelow50naira() throws IOException, InterruptedException {
		Reporter.log("Test to validate user cannot perform Fund QtAccount with amount below #50 started !!!", true);
		NavigateHomePage();
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("09125490124");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		SendMoneyObj.AddMoneyBtn();
		SendMoneyObj.FundAmount("10");
		SendMoneyObj.TransferwithAmountbelow50nairaAssertion();
		Reporter.log("Test to validate user cannot perform Fund QtAccount with amount below #50 completed !!!", true);
	}

	@Test(priority = 5, description = "This test case will validate user can not perform transfer with insuffient QT account balance")
	public void InsufficientFundTransferwithQTAccount() throws IOException, InterruptedException {
		Reporter.log("Test to validate user can not perform transfer with insuffient QT account balance started !!!",
				true);

		NavigateHomePage();
		LoginPageObj.ClickSignInWithPhoneNumberButton();
		LoginPageObj.EnterPhoneNumber("09074258404");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		SendMoneyObj.ClickSendMoney();
		SendMoneyObj.Click_SendtoBankAccount();	
		// SendMoneyObj.ClickSendNow();
		SendMoneyObj.EnterAccountNumber("1350008463");
		SendMoneyObj.ClickBankDropdown();
		SendMoneyObj.SelectBank("Quickteller");
		SendMoneyObj.SelectBankSearch();
		// SendMoneyObj.SaveasBeneficiary();
		SendMoneyObj.EnterAmount("1000");
		SendMoneyObj.ClickSNext();
		SendMoneyObj.InputNarration("Bizza Bizza");
		SendMoneyObj.ClickSend();
		SendMoneyObj.InsufficientFundTransferwithQTAccountAssertion();
		Reporter.log("Test to validate user can not perform transfer with insuffient QT account balance completed !!!",
				true);
	}

	@Test(priority = 6, description = "This test case will validate user can not perform transfer with amount below #50")
	public void TransferwithAmountbelow50naira() throws IOException, InterruptedException {
		Reporter.log("Test to validate user can not perform transfer with amount below #50 started !!!", true);

		NavigateHomePage();
		LoginPageObj.ClickSignInWithPhoneNumberButton();
		LoginPageObj.EnterPhoneNumber("09074258404");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		SendMoneyObj.ClickSendMoney();
		SendMoneyObj.Click_SendtoBankAccount();	
		// SendMoneyObj.ClickSendNow();
		SendMoneyObj.EnterAccountNumber("1350008463");
		SendMoneyObj.ClickBankDropdown();
		SendMoneyObj.SelectBank("Quickteller");
		SendMoneyObj.SelectBankSearch();
		// SendMoneyObj.SaveasBeneficiary();
		SendMoneyObj.EnterAmount("10");
		SendMoneyObj.TransferwithAmountbelow50nairaAssertion();
		Reporter.log("Test to validate user can not perform transfer with amount below #50 completed !!!", true);
	}

	@Test(priority = 7, description = "This test case will perform Fund QtAccount with CARD")
	public void FundAccountWithValidCardDetails() throws IOException, InterruptedException {
		Reporter.log("Test to perform Fund QTAccount with Card started !!!", true);
		NavigateHomePage();
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("09125490124");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();

		SendMoneyObj.AddMoneyBtn();
		SendMoneyObj.FundAmount("580");
		SendMoneyObj.PayBtn();
		SendMoneyObj.ClickUseNewCard();
		SendMoneyObj.InputCardNumber("5612330000000000099");
		SendMoneyObj.InputCardExpiryDate("03/50");
		SendMoneyObj.InputCardCVV("111");
		SendMoneyObj.InputCardPIN("1234");
		SendMoneyObj.ClickNext();
		SendMoneyObj.SuccessfulFundTransferAssertion();
		SendMoneyObj.ViewReceipt();
		// SendMoneyObj.AssertiontoConfirmReceiptisVisible();
		// SendMoneyObj.CloseReceipt();

		Reporter.log("Test to perform Fund QTAccount with Card completed !!!", true);
	}

	@Test(priority = 8, description = "This test case will perform transfer with card")
	public void CardTransferWithValidDetails() throws IOException, InterruptedException {
		Reporter.log("Test to perform transfer with card started !!!", true);
		NavigateHomePage();
		// LoginPageObj.ClickSignInWithPhoneNumberButton();
		// LoginPageObj.EnterPhoneNumber("08098487373");
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		SendMoneyObj.ClickSendMoney();
		SendMoneyObj.Click_SendtoBankAccount();	
		// SendMoneyObj.ClickSendNow();
		SendMoneyObj.EnterAccountNumber("1350008937");
		SendMoneyObj.ClickBankDropdown();
		SendMoneyObj.SelectBank("Quickteller");
		SendMoneyObj.SelectBankSearch();
		// SendMoneyObj.SaveasBeneficiary();
		SendMoneyObj.EnterAmount("500");
		SendMoneyObj.ClickSNext();
		SendMoneyObj.InputNarration("Bizza Bizza");
		SendMoneyObj.ClickSend();
		SendMoneyObj.ClickUseNewCard();
		SendMoneyObj.InputCardNumber("5612330000000000099");
		SendMoneyObj.InputCardExpiryDate("03/50");
		SendMoneyObj.InputCardCVV("111");
		SendMoneyObj.InputCardPIN("1234");
		SendMoneyObj.ClickNext();
		SendMoneyObj.SuccessfulTransferAssertion();
		SendMoneyObj.ViewReceipt();
		SendMoneyObj.AssertiontoConfirmReceiptisVisible();
		SendMoneyObj.CloseReceipt();
		Reporter.log("Test to perform transfer with card completed !!!", true);
	}

	@Test(priority = 9, description = "This test case will validate user can not transfer using valid QtAccount with different bank name")
	public void ValidQTAccountNumberInvalidBankName_Transfer() throws IOException, InterruptedException {
		Reporter.log("Test to validate user can not transfer using valid QtAccount with different bank name started !!!", true);
		 NavigateHomePage();
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		SendMoneyObj.ClickSendMoney();
		SendMoneyObj.Click_SendtoBankAccount();	
		SendMoneyObj.EnterAccountNumber("1350008463");
		SendMoneyObj.ClickBankDropdown();
		SendMoneyObj.SelectBank("Guaranty Trust Bank");
		SendMoneyObj.SelectBankSearch();
	    SendMoneyObj.InvalidAccountNumber_Validation();

		Reporter.log("Test to validate user can not transfer using valid QtAccount with different bank name completed !!!", true);
	}
	
	
	@Test(priority = 10, description = "This test case will validate user can not transfer using Invalid QtAccountNumber")
	public void InvalidQTAccountNumberValidBankName_Transfer() throws IOException, InterruptedException {
		Reporter.log("Test to validate user can not transfer using Invalid QtAccountNumber started !!!", true);
		 NavigateHomePage();
			LoginPageObj.EnterEmail("demmy4bi@gmail.com");
			LoginPageObj.EnterPassword("Ademola1@");
			LoginPageObj.ClickSignInButton();
			SendMoneyObj.ClickSendMoney();
			Thread.sleep(1000);
			SendMoneyObj.Click_SendtoBankAccount();	
		SendMoneyObj.EnterAccountNumber("0000008123");
		SendMoneyObj.ClickBankDropdown();
		SendMoneyObj.SelectBank("Quickteller");
		SendMoneyObj.SelectBankSearch();
	    SendMoneyObj.InvalidAccountNumber_Validation();

		Reporter.log("Test to validate user can not transfer using Invalid QtAccountNumber completed !!!", true);
	}
	
	
	@Test(priority = 11, description = "This test case will perform transfer with QtAccount to GTBAccount")
	public void QtAccountTransferToGTBAccount() throws IOException, InterruptedException {
		Reporter.log("Test to perform transfer with QtAccount to GTBAccount started !!!", true);
		 NavigateHomePage();
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		SendMoneyObj.ClickSendMoney();
		SendMoneyObj.Click_SendtoBankAccount();	
		SendMoneyObj.EnterAccountNumber("0037320662");
		SendMoneyObj.ClickBankDropdown();
		SendMoneyObj.SelectBank("Guaranty Trust Bank");
		SendMoneyObj.SelectBankSearch();
		SendMoneyObj.GTBAccountNameEnquiry_Validation();
		SendMoneyObj.EnterAmount("105");
		SendMoneyObj.ClickSNext();
		SendMoneyObj.InputNarration("Bizza Bizza");
		SendMoneyObj.ClickSend();
		SendMoneyObj.PayWithQuicktellerAccount();
		SendMoneyObj.InputTransactionPin("8010");
		SendMoneyObj.SuccessfulTransferAssertion();
		SendMoneyObj.ViewReceipt();
		Reporter.log("Test to perform transfer with QtAccount to GTBAccount completed !!!", true);
	}
	
	@Test(priority = 12, description = "This test case will validate user can not transfer using valid GTBAccount with different bank name")
	public void ValidGTBAccountNumberInvalidBankName_Transfer() throws IOException, InterruptedException {
		Reporter.log("Test to validate user can not transfer using valid GTBAccount with different bank name started !!!", true);
		 NavigateHomePage();
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		SendMoneyObj.ClickSendMoney();
		SendMoneyObj.Click_SendtoBankAccount();	
		SendMoneyObj.EnterAccountNumber("0037320662");
		SendMoneyObj.ClickBankDropdown();
		SendMoneyObj.SelectBank("Quickteller");
		SendMoneyObj.SelectBankSearch();
	    SendMoneyObj.InvalidAccountNumber_Validation();

		Reporter.log("Test to validate user can not transfer using valid GTBAccount with different bank name completed !!!", true);
	}
	
	
	@Test(priority = 13, description = "This test case will validate user can not transfer using Invalid GBTAccountNumber")
	public void InvalidGTBAccountNumberValidBankName_Transfer() throws IOException, InterruptedException {
		Reporter.log("Test to validate user can not transfer using Invalid GTBAccountNumber started !!!", true);
		 NavigateHomePage();
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		SendMoneyObj.ClickSendMoney();
		SendMoneyObj.Click_SendtoBankAccount();	
		SendMoneyObj.EnterAccountNumber("0000008123");
		SendMoneyObj.ClickBankDropdown();
		SendMoneyObj.SelectBank("Guaranty Trust Bank");
		SendMoneyObj.SelectBankSearch();
	    SendMoneyObj.InvalidAccountNumber_Validation();

		Reporter.log("Test to validate user can not transfer using Invalid GTBAccountNumber completed !!!", true);
	}
	
	@Test(priority = 14, description = "This test case will perform transfer to another QtAccount using Quicktag")
	public void QTQuicktagTransfer() throws IOException, InterruptedException {
		Reporter.log("Test to perform transfer to another QtAccount using Quicktag started !!!", true);
		 NavigateHomePage();
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		SendMoneyObj.ClickSendMoney();
		SendMoneyObj.Click_SendtoAnyoneQuickteller();
		SendMoneyObj.SearchPhonenumber_Quicktag("demmy4bi");
		SendMoneyObj.Click_AccountSearched();
		SendMoneyObj.FundAmount("120");
		SendMoneyObj.InputNarration("Bizza Bizza");
		SendMoneyObj.ClickSend();
		SendMoneyObj.PayWithQuicktellerAccount();
		SendMoneyObj.InputTransactionPin("8010");
		SendMoneyObj.SuccessfulTransferAssertion();
		SendMoneyObj.ViewReceipt();
		Reporter.log("Test to perform transfer to another QtAccount using Quicktag completed !!!", true);
	}
	
	@Test(priority = 15, description = "This test case will perform transfer to another QtAccount using phonenumber")
	public void QTPhonenumberTransfer() throws IOException, InterruptedException {
		Reporter.log("Test to perform transfer to another QtAccount using phonenumber started !!!", true);
		 NavigateHomePage();
		LoginPageObj.EnterEmail("demmy4bi@gmail.com");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		SendMoneyObj.ClickSendMoney();
		SendMoneyObj.Click_SendtoAnyoneQuickteller();
		SendMoneyObj.SearchPhonenumber_Quicktag("09125490124");
		SendMoneyObj.Click_AccountSearched();
		SendMoneyObj.FundAmount("190");
		SendMoneyObj.InputNarration("Bizza Bizza");
		SendMoneyObj.ClickSend();
		SendMoneyObj.PayWithQuicktellerAccount();
		SendMoneyObj.InputTransactionPin("8010");
		SendMoneyObj.SuccessfulTransferAssertion();
		SendMoneyObj.ViewReceipt();
		Reporter.log("Test to perform transfer to another QtAccount using phonenumber completed !!!", true);
	}
	
	
}
