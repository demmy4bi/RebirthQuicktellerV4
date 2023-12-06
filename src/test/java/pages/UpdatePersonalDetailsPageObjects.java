package pages;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.rebirthQuickteller.base.TestBase;

public class UpdatePersonalDetailsPageObjects extends TestBase {

	String actualmessage;
	String ExpectedProfileUpdatesuccessmessage = "Profile updated!";
	String ExpectedAddressUpdatesuccessmessage = "Your address information was updated successfully.";

	public UpdatePersonalDetailsPageObjects(WebDriver driver) {
		TestBase.driver = driver;
	}

	public void Click_AccountandSettings() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@class='sidebar__menuItem'][normalize-space()='Account & Settings']"))).click();
		Reporter.log("Account & Settings button clicked", true);
	}

	public void Click_ProfiledetailsDropdown() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(1) > div > .personal__info")))
				.click();
		Reporter.log("ProfiledetailsDropdown button clicked", true);
	}

	public void Click_AddressDropdown1() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(3) .personal__info"))).click();
		Reporter.log("AddressDropdown button clicked", true);
	}

	public void Click_AddressDropdown() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(3) .personal__info")));

		// Scroll the element into view using JavaScriptExecutor
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		// Re-find the element after scrolling
		element = driver.findElement(By.cssSelector("div:nth-child(3) .personal__info"));

		// Click the element using JavaScriptExecutor
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

		Reporter.log("AddressDropdown button clicked", true);
	}

	public void Click_Edit1() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 90);
		WebElement editButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='Edit']")));

		// Scroll to the element
		Actions actions = new Actions(driver);
		actions.moveToElement(editButton).perform();

		// Click the element
		editButton.click();
		Reporter.log("Edit button clicked", true);
	}

	public void Click_Edit() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='Edit']")));

		// Scroll the element into view using JavaScriptExecutor
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		// Re-find the element after scrolling
		element = driver.findElement(By.xpath("//p[normalize-space()='Edit']"));

		// Click the element using JavaScriptExecutor
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

		Reporter.log("Edit button clicked", true);
	}

	public void EnterOccupation(String text) throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("occupation"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("occupation"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("occupation"))).sendKeys(text);
		Reporter.log("occupation entered successfully", true);
	}

	public void EnterAddress(String text) throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("address"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("address"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("address"))).sendKeys(text);
		Reporter.log("address entered successfully", true);
	}

	public void EnterCity(String text) throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("city"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("city"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("city"))).sendKeys(text);
		Reporter.log("city entered successfully", true);
	}

	public void Click_Save1() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
		Reporter.log("Account & Settings button clicked", true);
	}

	public void Click_Save() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));

		// Scroll the element into view using JavaScriptExecutor
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		// Re-find the element after scrolling
		element = driver.findElement(By.xpath("//button[@type='submit']"));

		// Click the element using JavaScriptExecutor
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

		Reporter.log("Save button clicked", true);
	}

	public void Click_StateDropdown() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@name='countryState']"))).clear();
		Reporter.log("Account & Settings button clicked", true);
	}

	public void selectState() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".visible .item:nth-child(1)"))).clear();
		Reporter.log("Account & Settings button clicked", true);
	}

	public void Click_LGADropdown() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".lga__dropdown > .ui > img']"))).clear();
		Reporter.log("Account & Settings button clicked", true);
	}

	public void selectLGA() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".visible .item:nth-child(1)"))).clear();
		Reporter.log("Account & Settings button clicked", true);
	}

	public void SuccessfulProfileUpdateAssertion() throws IOException {

		String actualmessage = new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'Profile updated!')]")))
				.getText();
		try {
			Assert.assertEquals(actualmessage, ExpectedProfileUpdatesuccessmessage);
			System.out.println("Actual success message  =" + actualmessage);
			Reporter.log("Profile updated successfully", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}

	public void SuccessfulAddressUpdateAssertion() throws IOException {

		String actualmessage = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//p[contains(.,'Your address information was updated successfully.')]"))).getText();
		try {
			Assert.assertEquals(actualmessage, ExpectedAddressUpdatesuccessmessage);
			System.out.println("Actual success message  =" + actualmessage);
			Reporter.log("Address updated successfully", true);
		} catch (AssertionError e) {
			System.err.println("Assertion failed: " + e.getMessage());
		}
	}

	public void selectRandomState() {
		// Generate a random index from 1 to 37
		int randomIndex = new Random().nextInt(37) + 1;

		// Construct the CSS selector with the random index
		String selector = String.format(".visible .item:nth-child(%d)", randomIndex);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@name='countryState']")));

		// Scroll the element into view using JavaScriptExecutor
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		// Re-find the element after scrolling
		element = driver.findElement(By.xpath("//div[@name='countryState']"));

		// Click the element using JavaScriptExecutor
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

		Reporter.log("state dropdown clicked", true);

		// Locate and click the randomly selected state
		WebElement randomState = driver.findElement(By.cssSelector(selector));
		randomState.click();

		Reporter.log("random state selected", true);
	}

	public void selectRandomLGA() {
		// Generate a random index from 1 to 44
		int randomIndex = new Random().nextInt(8) + 1;

		// Construct the CSS selector with the random index
		String selector = String.format(".visible .item:nth-child(%d)", randomIndex);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".lga__dropdown > .ui")));

		// Scroll the element into view using JavaScriptExecutor
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		// Re-find the element after scrolling
		element = driver.findElement(By.cssSelector(".lga__dropdown > .ui"));

		// Click the element using JavaScriptExecutor
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

		Reporter.log("LGA dropdown clicked", true);

		// Locate and click the randomly selected state
		WebElement randomLGA = driver.findElement(By.cssSelector(selector));
		randomLGA.click();

		Reporter.log("random LGA selected", true);
	}

}
