package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.Reporter;

import com.rebirthQuickteller.base.TestBase;

public class RechargePageObjects extends TestBase {

	String actualmessage;
	String Expectedrechargesuccessmessage = "Airtime Purchase Successful!";

	public RechargePageObjects(WebDriver driver) {
		TestBase.driver = driver;
	}

	public void ClickAirtimeDataButton() throws IOException, InterruptedException {

		chooseElement("AirtimeDataBtn_XPATH").click();
		Reporter.log("Airtime button clicked successfully", true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}

	public void ClickNewAirtimeButton() throws IOException, InterruptedException {

		chooseElement("NewAirtime_XPATH").click();
		Reporter.log("New Airtime button clicked successfully", true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}

	public void SelectCountryCode(String text) throws IOException, InterruptedException {

		chooseElement("ClickCountryCodeDropdown_CSS").click();
		chooseElement("ClickSearchCountryCode_CSS").click();
		chooseElement("ClickSearchCountryCode_CSS").sendKeys(text);
		chooseElement("SelectFrmSearch_CSS").click();

		Reporter.log("Country code selected successfully", true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}

	public void ClickNext() throws IOException, InterruptedException {
		chooseElement("ClickNextBtn_XPATH").click();
		Reporter.log("Next button clicked successfully", true);
		Thread.sleep(1000);
	}

	public void EnterPhoneNumber(String text) throws IOException, InterruptedException {

		chooseElement("phoneNumber_NAME").clear();
		chooseElement("phoneNumber_NAME").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Reporter.log("PhoneNumber Entered", true);
		Thread.sleep(1000);
	}

	public void EnterRechargeAmount(String text) throws IOException, InterruptedException {
		chooseElement("RechargeAmount_XPATH").clear();
		chooseElement("RechargeAmount_XPATH").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Reporter.log("Amount Entered", true);
		Thread.sleep(1000);

	}

	public void ClickPay() throws InterruptedException, IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//button[contains(.,'Pay')]"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(500);

		chooseElement("PayBtn_XPATH").click();
		Thread.sleep(1000);

		Reporter.log("Pay button clicked", true);
	}

	public void ClickUseNewCard() throws IOException {
		chooseElement("NewCardBtn_CSS").click();
		Reporter.log("New card selected", true);
	}

	public void InputCardNumber(String text) throws IOException, InterruptedException {
		chooseElement("CardNumber_NAME").clear();
		chooseElement("CardNumber_NAME").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Card number input", true);
		Thread.sleep(1000);
	}

	public void InputCardExpiryDate(String text) throws IOException, InterruptedException {
		chooseElement("ExpiryDate_NAME").clear();
		chooseElement("ExpiryDate_NAME").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("CardExpiryDate input", true);
		Thread.sleep(1000);
	}

	public void InputCardCVV(String text) throws IOException, InterruptedException {
		chooseElement("CVV_NAME").clear();
		chooseElement("CVV_NAME").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("CardCVV input", true);
		Thread.sleep(1000);
	}

	public void InputCardPIN(String text) throws IOException, InterruptedException {
		chooseElement("CardPin_NAME").clear();
		chooseElement("CardPin_NAME").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("CardCVV input", true);
		Thread.sleep(1000);
	}

	public void ClickSaveCard() throws IOException, InterruptedException {
		chooseElement("SaveCard_CSS").click();
		Reporter.log("New card selected", true);
		Thread.sleep(1000);
	}

	public void SuccessfulRechargeAssertion() throws IOException {
		actualmessage = chooseElement("SuccessRechargeAssert_XPATH").getText();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Actual success message  =" + actualmessage);
		Assert.assertEquals(actualmessage, Expectedrechargesuccessmessage);

		System.out.println("Recharge Successful");
	}

	public void ClickReceipt() throws IOException {
		chooseElement("Receipt_XPATH").click();
		Reporter.log("Receipt clicked", true);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	}

	public void ViewReceipt() throws IOException {
		chooseElement("Clickviewreceipt_CSS").click();
		Reporter.log("Receipt viewed successfully", true);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	}

	public void CloseReceipt() throws IOException {
		chooseElement("closeReceipt_CSS").click();
		Reporter.log("Receipt closed successfully", true);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	}

}
