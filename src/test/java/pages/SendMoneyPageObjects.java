package pages;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.rebirthQuickteller.base.TestBase;

public class SendMoneyPageObjects extends TestBase {
	String actualmessage;
	String ExpectedTransfersuccessmessage = "Money sent!";
	String ExpectedFundTransfersuccessmessage = "Money Added!";
	String ExpectedReceiptAssertion = "Beneficiary Name";
	String ExpectedTransactionPINErrmessage = "Please enter correct current PIN and try again";
	String InsufficientFundTransferwithQTAccounterrormessage = "Insufficient funds. Add money to your account to pay.";
	String Transferbelow50nairaerrormessage = "Please make sure to input an amount of 50 Naira or more for your transaction";
	String ExpectedAccountName = "Ade Oye";
	String ExpectedGTBAccountName = "ROTIMI MODUPE AKINRIMISI";
	String ExpectedInvalidAccounNumbererrormessage = "Invalid Account Number";
	
	public SendMoneyPageObjects(WebDriver driver) {
		TestBase.driver = driver;
	}

	public void ClickSendMoney() throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("SendMoneyBtn_CSS"))).click();

	}

	public void ClickSendNow() throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("SendNowBtn_XPATH"))).click();

	}

	public void EnterAccountNumber(String text) throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("AccountNumber_NAME"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("AccountNumber_NAME"))).clear();
		chooseElement("AccountNumber_NAME").sendKeys(text);
		Reporter.log("Account Number entered successfully", true);

	}

	public void ClickBankDropdown() throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("BanksDropdownBtn_CSS"))).click();

	}

	public void SelectBank(String text) throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("BankDropdownSearch_CSS"))).click();
		chooseElement("BankDropdownSearch_CSS").sendKeys(text);
		chooseElement("BankDropdownSearch_CSS").click();
		Reporter.log("Search entered successfully", true);

	}

	public void SelectBankSearch() throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("SelectFrmBankSearch_CSS"))).click();

		Reporter.log("Select Search entered successfully", true);

	}

	public void ClickSNext() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ClickSNext_XPATH"))).click();
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
		Reporter.log("Next button clicked successfully", true);

	}

	public void ClickNext() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ClickNextBtn_XPATH"))).click();
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
		Reporter.log("Next button clicked successfully", true);

	}

	public void SaveasBeneficiary() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ClickSaveBeneficiary_CSS"))).click();
		Reporter.log("SaveasBeneficiary clicked successfully", true);

	}

	public void EnterAmount(String text) throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".send_to_amount"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".send_to_amount"))).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".send_to_amount"))).sendKeys(text);
	//	chooseElement("Amount_XPATH").sendKeys(text);
		Reporter.log("Amount Entered", true);
	}

	public void FundAmount(String text) throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".amount-to-send"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".amount-to-send"))).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".amount-to-send"))).sendKeys(text);
		Reporter.log("Amount Entered", true);
	}

	public void ClickSend() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
	//	wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ClickSendBtn_CSS"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ui > p"))).click();
		Reporter.log("Send button clicked successfully", true);
	}

	public void ClickUseNewCard() throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("NewCardBtn_CSS"))).click();
		Reporter.log("New card selected", true);
	}

	public void InputCardNumber(String text) throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("CardNumber_NAME"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("CardNumber_NAME"))).clear();
		chooseElement("CardNumber_NAME").sendKeys(text);
		Reporter.log("Card number input", true);
	}

	public void InputCardExpiryDate(String text) throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ExpiryDate_NAME"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ExpiryDate_NAME"))).clear();
		chooseElement("ExpiryDate_NAME").sendKeys(text);
		Reporter.log("CardExpiryDate input", true);
	}

	public void InputCardCVV(String text) throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("CVV_NAME"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("CVV_NAME"))).clear();
		chooseElement("CVV_NAME").sendKeys(text);
		Reporter.log("CardCVV input", true);

	}

	public void InputCardPIN(String text) throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("CardPin_NAME"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("CardPin_NAME"))).clear();
		chooseElement("CardPin_NAME").sendKeys(text);
		Reporter.log("Card Pin input", true);

	}

	public void ClickSaveCard() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("SaveCard_CSS"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("SaveCard_CSS"))).clear();
		Reporter.log("New card selected", true);

	}

	public void ClickNewButton() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ClickNew_XPATH"))).click();
		Reporter.log("New  button clicked successfully", true);

	}

	public void InputNarration(String text) throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("Narration_XPATH"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("Narration_XPATH"))).clear();
		chooseElement("Narration_XPATH").sendKeys(text);
		Reporter.log("Narration entered successfully", true);

	}

	public void SuccessfulTransferAssertion() throws IOException {

		String actualmessage = new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'Money sent!')]")))
				.getText();
		try {
			Assert.assertEquals(actualmessage, ExpectedTransfersuccessmessage);
			System.out.println("Actual success message  =" + actualmessage);
			Reporter.log("Successful Transfer Asserted successfully", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}

	public void SuccessfulFundTransferAssertion() throws IOException {

		String actualmessage = new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'Money Added!')]")))
				.getText();
		try {
			Assert.assertEquals(actualmessage, ExpectedFundTransfersuccessmessage);
			System.out.println("Actual success message  =" + actualmessage);
			Reporter.log("Successful FundTransfer Asserted successfully", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}

	public void InvalidTransactionPINAssertion() throws IOException {

		String actualmessage = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//p[contains(.,'Please enter correct current PIN and try again')]"))).getText();
		try {
			Assert.assertEquals(actualmessage, ExpectedTransactionPINErrmessage);
			System.out.println("Actual success message  =" + actualmessage);
			Reporter.log("Invalid Transaction Pin Asserted successfully", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}

	public void AssertiontoConfirmReceiptisVisible() throws IOException {
		String actualmessage = new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'Beneficiary Name')]")))
				.getText();
		try {
			Assert.assertEquals(actualmessage, ExpectedReceiptAssertion);
			System.out.println("Actual success message  =" + actualmessage);
			Reporter.log("Transaction Receipt is visible", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}

	public void ViewReceipt() throws IOException, InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ViewTransferReceipt_CSS"))).click();
			Reporter.log("Receipt Viewed Successfully", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}

	public void DownloadReceipt() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("DownloadReceipt_XPATH"))).click();
		Reporter.log("Receipt Downloaded Successfully", true);

	}

	public void SelectSavedBeneficiary() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("savedBeneficiary_CSS"))).click();
		Reporter.log("Receipt Downloaded Successfully", true);

	}

	public void PayWithQuicktellerAccount() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ClickPayWQuickteller_XPATH"))).click();
		Reporter.log("QuicktellerAccount Selected for Transfer Successfully", true);

	}

	public void TransferBtn() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ClickTransferbtn_XPATH"))).click();
		Reporter.log("Transfer Button Clicked Successfully", true);

	}

	public void InputTransactionPin(String text) throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("pin0"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("pin0"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("pin0"))).sendKeys(text);
		//chooseElement("ClickPinBtn_XPATH").sendKeys(text);
		Reporter.log("Transfer Pin Clicked Successfully", true);

	}

	public void CloseReceipt() throws IOException {
		try {
			chooseElement("closeReceipt_CSS").click();
			Reporter.log("Receipt closed successfully", true);
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}

	public void AddMoneyBtn() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ClickAddMoneyBtn_XPATH"))).click();
		Reporter.log("Add Money Button Clicked Successfully", true);

	}

	public void PayBtn() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ClickPayBtn_CSS"))).click();
		Reporter.log("Pay Button Clicked Successfully", true);

	}

	public void PaywithEcash() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".payment__view-options-card"))).click();
		Reporter.log("PaywithEcash Clicked Successfully", true);

	}

	public void InsufficientFundTransferwithQTAccountAssertion() throws IOException {
		String actualmessage = new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//span[contains(.,'Insufficient funds. Add money to your account to pay.')]")))
				.getText();
		try {
			Assert.assertEquals(actualmessage, InsufficientFundTransferwithQTAccounterrormessage);
			System.out.println("Actual error message  =" + actualmessage);
			Reporter.log("InsufficientFundTransferwithQTAccount validated", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}

	public void TransferwithAmountbelow50nairaAssertion() throws IOException {
		String actualmessage = new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".invalid-amount-error")))
				.getText();
		try {
			Assert.assertEquals(actualmessage, Transferbelow50nairaerrormessage);
			System.out.println("Actual error message  =" + actualmessage);
			Reporter.log("Transfer Below 50naira Validated", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}
	
	public void Click_SendtoBankAccount() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cta__tabs:nth-child(2)"))).click();
		Reporter.log("SendtoBankAccount Clicked Successfully", true);

	}
	
	public void QTAccountNameEnquiry_Validation() throws IOException {
		String actualmessage = new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'Ade Oye')]")))
				.getText();
		try {
			Assert.assertEquals(actualmessage, ExpectedAccountName);
			System.out.println("Actual account name  =" + actualmessage);
			Reporter.log("Name enquiry validated", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}
	
	
	public void GTBAccountNameEnquiry_Validation() throws IOException {
		String actualmessage = new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'ROTIMI MODUPE AKINRIMISI')]")))
				.getText();
		try {
			Assert.assertEquals(actualmessage, ExpectedGTBAccountName);
			System.out.println("Actual account name  =" + actualmessage);
			Reporter.log("Name enquiry validated", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}

	public void  InvalidAccountNumber_Validation() throws IOException {
		String actualmessage = new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'Invalid Account Number')]")))
				.getText();
		try {
			Assert.assertEquals(actualmessage, ExpectedInvalidAccounNumbererrormessage);
			System.out.println("Actual error message  =" + actualmessage);
			Reporter.log("Invalid account number validated", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}
	
	public void Click_SendtoAnyoneQuickteller() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cta__tabs:nth-child(1)"))).click();
		Reporter.log("SendtoAnyone on Quickteller Clicked Successfully", true);

	}
	
	public void SearchPhonenumber_Quicktag(String text) throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".\\_searchbar:nth-child(1) > .search_input"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".\\_searchbar:nth-child(1) > .search_input"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".\\_searchbar:nth-child(1) > .search_input"))).sendKeys(text);
		Reporter.log("Search by...", true);

	}
	
	public void Click_AccountSearched() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(.,'1350009240 . Quickteller')]"))).click();
		Reporter.log("Account Clicked Successfully", true);

	}
	
	
}
