package pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.rebirthQuickteller.assertions.Assertions;
import com.rebirthQuickteller.base.TestBase;

public class LoginPageObjects extends TestBase {

	String actualerrormessage;
	String Emailexpectederrormessage = "This email is not registered to an account";
	String Passwordexpectederrormessage = "Incorrect password, 3 attempts remaining.";
	String PhoneNumberexpectederrormessage = "This mobile number is not registered to an account";
	String InvalidEmailexpectederrormessage = "Email address must be a valid email";
	String InvalidPasswordexpectederrormessage = "Password must be valid";
	String InvalidphoneNumberexpectederrormessage = "Provide a valid phone number";
	
	
	public LoginPageObjects(WebDriver driver) {
		TestBase.driver = driver;
	}

	public void EnterEmail(String text) throws IOException, InterruptedException {

		chooseElement("Email_NAME").clear();
		chooseElement("Email_NAME").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("emailAddress entered successfully", true);
		Thread.sleep(3000);
	}

	public void EnterPassword(String text) throws IOException, InterruptedException {

		chooseElement("password_NAME").clear();
		chooseElement("password_NAME").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Password entered successfully", true);
		Thread.sleep(3000);
	}

	public void EnterPhoneNumber(String text) throws IOException, InterruptedException {

		chooseElement("phoneNumber_NAME").clear();
	 	chooseElement("phoneNumber_NAME").sendKeys(text);
		Reporter.log("phoneNumber entered successfully", true);
		Thread.sleep(3000);
	}

	public void ClickSignInButton() throws IOException, InterruptedException {

		chooseElement("SignIn_CSS").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("SignIn button clicked successfully", true);
		Thread.sleep(1000);

	}

	public void ValidateHomePageUrl() {

		// actualSignInurl driver.getCurrentUrl()
		String expURL = "https://rebirth.quickteller.com/dashboard";
		Boolean responses = Assertions.ValidateUrl(driver, expURL);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Get URL to confirm user is been redirected to dashboard homepage is" + responses);

	}

	public void ClickLogoutButton() throws IOException {

		chooseElement("Logout_CSS").click();
		Reporter.log("Logout successfully", true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void ClickLogoutDropdownBtn() throws IOException {
		chooseElement("LogoutDropdownBtn_CSS").click();
	}

	public void ClickSignInWithPhoneNumberButton() throws IOException, InterruptedException {
		chooseElement("ClickSignINphoneNumber_CSS").click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Reporter.log("Sign In with PhoneNumber button clicked successfully", true);
		Thread.sleep(3000);
	}

	public void UnregisteredEmailAssertion() throws IOException {
		actualerrormessage = chooseElement("InvalidSignInAsertion_CSS").getText();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Actual error message  =" + actualerrormessage);
		Assert.assertEquals(actualerrormessage, Emailexpectederrormessage);

		System.out.println("Test Passed");
	}

	public void UnregisteredPhoneNumberAssertion() throws IOException {
		actualerrormessage = chooseElement("InvalidSignInAsertion_CSS").getText();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Actual error message  =" + actualerrormessage);
		Assert.assertEquals(actualerrormessage, PhoneNumberexpectederrormessage);

		System.out.println("Test Passed");
	}

	public void InvalidPasswordAssertion() throws IOException {
		actualerrormessage = chooseElement("InvalidSignInAsertion_CSS").getText();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Actual error message  =" + actualerrormessage);
		Assert.assertEquals(actualerrormessage, Passwordexpectederrormessage);

		System.out.println("Test Passed");

	}

	public void ClickForgotPasswordButton() throws IOException {
		chooseElement("forgotPassword_LINKTEXT").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void ClickResetPasswordButton() throws IOException, InterruptedException {
		chooseElement("ResetPassword_CSS").click();
		Thread.sleep(3000);
	}

	public void ClickOpenEmailBtn() throws IOException, InterruptedException {
		chooseElement("ResetPassword_CSS").click();
		Thread.sleep(3000);
	}

	public void ClickGmail() throws IOException {
		chooseElement("openEmail_CSS").click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	public void SwitchWindow() throws InterruptedException {
		// Switch Window
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String ParentWindow = it.next();
		String ChildWindow = it.next();
		driver.switchTo().window(ChildWindow);
		Thread.sleep(3000);

		// SwitchbacktoParent
		driver.switchTo().window(ParentWindow);
		Thread.sleep(3000);

	}
	
	public void doitlatercllick() throws IOException {
		chooseElement("Doitlater_CSS").click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	public void InvalidEmailInputAssertion() throws IOException {
		actualerrormessage = chooseElement("InvalidEmailAsssertion_XPATH").getText();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Actual error message  =" + actualerrormessage);
		Assert.assertEquals(actualerrormessage, InvalidEmailexpectederrormessage);

		System.out.println("Invalid Email Asserted");
	}
	
	public void InvalidphoneNumberInputAssertion() throws IOException {
		actualerrormessage = chooseElement("InvalidaphoneNumberAssertion_XPATH").getText();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Actual error message  =" + actualerrormessage);
		Assert.assertEquals(actualerrormessage, InvalidphoneNumberexpectederrormessage);

		System.out.println("Invalid Email Asserted");
	}
	
	
	
	public void InvalidPasswordInputAssertion() throws IOException {
		actualerrormessage = chooseElement("InvalidPasswordAssertion_XPATH").getText();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Actual error message  =" + actualerrormessage);
		Assert.assertEquals(actualerrormessage, InvalidPasswordexpectederrormessage);

		System.out.println("Invalid Password Asserted");
	}
	
	public void InvalidPasswordInput() throws IOException, InterruptedException {
		chooseElement("password_NAME").clear();
		type("password_NAME", "txtPassword2");
	    chooseElement("password_NAME").sendKeys(Keys.TAB);
		chooseElement("password_NAME").clear();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Password entered successfully", true);
		Thread.sleep(3000);
	}
	
	
	public void ClickRememberMe() throws IOException {
		chooseElement("RemmeberMe_CSS").click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);	
	}
	
	
	public void EyePassword() throws IOException {
		chooseElement("EyePassword_CSS").click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);	
	}
	
}
