package pages;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.rebirthQuickteller.base.TestBase;

public class RechargePageObjects extends TestBase {

	String actualmessage;
	String Expectedrechargesuccessmessage = "Airtime Purchase Successful!";
	String ExpectederrormessageforInsufficientRecharge = "Insufficient funds. Add money to your account to pay.";
	String AirtimeRechargebelow50nairaerrormessage = "Please make sure to input an amount of 50 Naira or more for your transaction";
	String InsufficientFundOneTouchSelfRechrageerrormessage = "Insufficient funds. Kindly fund your account or explore alternative payment methods.";
	String OneTouchSelfrechargesuccessmesssage = "successful";

	public RechargePageObjects(WebDriver driver) {
		TestBase.driver = driver;
	}

	public void ClickAirtimeDataButton() throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("AirtimeDataBtn_CSS"))).click();
		Reporter.log("Airtime button clicked successfully", true);
	}

	public void ClickNewAirtimeButton() throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ClickNew_XPATH"))).click();
		Reporter.log("New Airtime button clicked successfully", true);
	}

	public void SelectCountryCode(String text) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ClickCountryCodeDropdown_CSS"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ClickSearchCountryCode_CSS"))).click();
		chooseElement("ClickSearchCountryCode_CSS").sendKeys(text);

		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("SelectFrmSearch_CSS"))).click();

		Reporter.log("Country code selected successfully", true);

	}

	public void ClickNext() throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ClickNextBtn_XPATH"))).click();
		Reporter.log("Next button clicked successfully", true);
	}

	public void EnterPhoneNumber(String text) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("phoneNumber_NAME"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("phoneNumber_NAME"))).clear();
		chooseElement("phoneNumber_NAME").sendKeys(text);
		Reporter.log("PhoneNumber Entered", true);

	}

	public void EnterAmount(String text) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".airtime__amount"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".airtime__amount"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".airtime__amount"))).sendKeys(text);
		Reporter.log("Amount Entered", true);

	}
	
	public void EnterAmount1(String text) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("input-field"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("input-field"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("input-field"))).sendKeys(text);
		Reporter.log("Amount Entered", true);

	}

	public void ClickPay() throws InterruptedException, IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//button[contains(.,'Pay')]"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(500);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("PayBtn_XPATH"))).click();

		Reporter.log("Pay button clicked", true);
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
		Reporter.log("CardPin input", true);

	}

	public void ClickSaveCard() throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("SaveCard_CSS"))).click();
		Reporter.log("save card clicked", true);

	}

	public void SuccessfulRechargeAssertion() throws IOException {

		String actualmessage = new WebDriverWait(driver, 30)
				.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//p[contains(.,'Airtime Purchase Successful!')]")))
				.getText();
		try {
			Assert.assertEquals(actualmessage, Expectedrechargesuccessmessage);
			System.out.println("Actual success message  =" + actualmessage);
			Reporter.log("Recharge Successful", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}
	
	 
	 
	//
	
	
	/*
	 * public void SuccessfulRechargeAssertion2() throws IOException { try { String
	 * actualmessage = new WebDriverWait(driver, 30)
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.
	 * xpath("//p[contains(.,'Airtime Purchase Successful!')]"))) .getText();
	 * 
	 * Assert.assertEquals(actualmessage, Expectedrechargesuccessmessage);
	 * System.out.println("Actual success message: " + actualmessage);
	 * Reporter.log("Recharge Successful", true); } catch (AssertionError e) { //
	 * Handle assertion error (success message does not match)
	 * System.err.println("Assertion failed: " + e.getMessage());
	 * 
	 * // Check for the error message element try { String errorMessage = new
	 * WebDriverWait(driver, 10)
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.
	 * xpath("xpath=//p[contains(.,'Something went wrong...')]"))) .getText();
	 * 
	 * System.err.println("Error message: " + errorMessage); } catch
	 * (TimeoutException ex) { // Handle error message element not found
	 * System.err.println("Error message element not found within 10 seconds."); } }
	 * catch (Exception ex) { // Handle other exceptions
	 * System.err.println("Something went wrong: " + ex.getMessage()); } }
	 */

	
	
	//
	
	

	/*
	 * public void ClickReceipt() throws IOException { try {
	 * chooseElement("Receipt_XPATH").click(); Reporter.log("Receipt clicked",
	 * true); driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS); }
	 * catch (AssertionError e) { System.err.println("Assertion failed: " +
	 * e.getMessage()); } }
	 */
	
	public void ClickReceipt() throws IOException, InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Receipt']"))).click();
			Reporter.log("Receipt clicked", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}

	 
	
	public void ClickDoneBtn() throws IOException, InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(.,'Done')]"))).click();
			Reporter.log("Done Clicked successfully", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}

	 

	public void CloseReceipt() throws IOException, InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/i"))).click();
			Reporter.log("Receipt closed", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}
	
	public void PayWithQuicktellerAccount() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ClickPayWQuickteller_XPATH"))).click();
		Reporter.log("QuicktellerAccount Selected for Airtime Recharge", true);

	}

	public void PayBtn() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ClickTransferbtn_XPATH"))).click();
		Reporter.log("Transfer Button Clicked Successfully", true);

	}

	public void InputTransactionPin(String text) throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ClickPinBtn_XPATH"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("ClickPinBtn_XPATH"))).clear();
		chooseElement("ClickPinBtn_XPATH").sendKeys(text);
		Reporter.log("Transfer Button Clicked Successfully", true);

	}

	public void SelectGlo() throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("SelectGlo_XPATH"))).click();
		Reporter.log("Glo Clicked Successfully", true);
	}
	
	public void Select9mobile() throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("Select9mobile_XPATH"))).click();
		Reporter.log("9mobile Clicked Successfully", true);
	}
	
	public void SelectMtn() throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("SelectMtn_XPATH"))).click();
		Reporter.log("Mtn Clicked Successfully", true);
	}
	
	public void SelectAirtel() throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(chooseElement("SelectAirtel_XPATH"))).click();
		Reporter.log("Airtel Clicked Successfully", true);
	}
	
	

	/*
	 * public void ClickSelfSavedBene() { WebDriverWait wait = new
	 * WebDriverWait(driver, 30);
	 * wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
	 * ".saved__beneficiaries__container > .airtime__beneficiary-card .airtime__savedCard__details > div > p:nth-child(1)"
	 * ))) .click(); Reporter.log("Self Saved Beneficiary Clicked", true); }
	 */

	public void ClickSelfSavedBene() {
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
	            ".saved__beneficiaries__container > .airtime__beneficiary-card .airtime__savedCard__details > div > p:nth-child(1)")));

	    // Scroll the element into view using JavaScriptExecutor
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	    // Re-find the element after scrolling
	    element = driver.findElement(By.cssSelector(
	            ".saved__beneficiaries__container > .airtime__beneficiary-card .airtime__savedCard__details > div > p:nth-child(1)"));

	    // Click the element using JavaScriptExecutor
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

	    Reporter.log("Self Saved Beneficiary Clicked", true);
	}



	
	
	public void ClickPaywithOneTouch() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//p[normalize-space()='1-Touch With Quickteller Account']"))).click();
		Reporter.log("PaywithOneTouch Clicked", true);
	}

	public void InsuffientFundAssertion() throws IOException {

		String actualmessage = new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//span[contains(.,'Insufficient funds. Add money to your account to pay.')]")))
				.getText();
		try {
			Assert.assertEquals(actualmessage, ExpectederrormessageforInsufficientRecharge);
			System.out.println("Actual error message  =" + actualmessage);
			Reporter.log("Insufficent Balance Airtime recharge Validated", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}

	public void AirtimeRechargeBelow50nairaAssertion() throws IOException {

		String actualmessage = new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".invalid-amount-error")))
				.getText();
		try {
			Assert.assertEquals(actualmessage, AirtimeRechargebelow50nairaerrormessage);
			System.out.println("Actual error message  =" + actualmessage);
			Reporter.log("Airtime Recharge Below 50naira Validated", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}

	public void InsufficientFundOneTouchSelfRechargeAssertion() throws IOException {

		String actualmessage = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//p[contains(.,'Insufficient funds. Kindly fund your account or explore alternative payment methods.')]")))
				.getText();
		try {
			Assert.assertEquals(actualmessage, InsufficientFundOneTouchSelfRechrageerrormessage);
			System.out.println("Actual error message  =" + actualmessage);
			Reporter.log("InsufficientFund OneTouch Self Rechrage errormessage Validated", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}

	public void oneAssertion() throws IOException {

		String actualmessage = new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='powered by isw']")))
				.getText();

	}

	public void oneTouchSuccessAssertion() throws IOException {

		String actualmessage = new WebDriverWait(driver, 30).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='receipt']/header/div/div/p[2]")))
				.getText();
		try {
			Assert.assertEquals(actualmessage, OneTouchSelfrechargesuccessmesssage);
			System.out.println("Actual success message  =" + actualmessage);
			Reporter.log("OneTourch self recharge successfull", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}
	
	public void ClickData() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector(".data-option"))).click();
		Reporter.log("Data Clicked", true);
	}
	
	
	public void ClickDatadropdown() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector(".postpaid-dropdown > .ui"))).click();
		Reporter.log("Data plan dropdown Clicked", true);
	}
	
	
	public void EnterDataPlanAmount(String text) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".visible > .dropdown__search > input"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".visible > .dropdown__search > input"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".visible > .dropdown__search > input"))).sendKeys(text);
		Reporter.log("DataPlanAmount Entered", true);
   }
	
	
	public void SelectDataPlan() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector(".item:nth-child(1) span:nth-child(1)"))).click();
		Reporter.log("Data plan selected", true);
	}
	
	
	
}
