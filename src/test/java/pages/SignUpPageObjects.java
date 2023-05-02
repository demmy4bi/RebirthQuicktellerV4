package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.rebirthQuickteller.base.TestBase;

public class SignUpPageObjects extends TestBase {

	String actualmessage;
	String WelcometoQuicktellersuccessmessage = "Welcome to Quickteller!";
	String ProfileUpdatesuccessmessage = "Profile updated!";
	String PinSetsuccessmessage = "Your Quickteller PIN has been set successfully.";
	String Emailsentmessage = "You’ve got mail !!";
	String AlreadyexistPhonenumbererrmessage = "Account already exists";
	String InvalidOTPPhoneNumberVerification = "Incorrect code, Please try again.";
	String InvalidphoneNumberexpectederrormessage = "Provide a valid phone number";
	
	
	public SignUpPageObjects(WebDriver driver) {
		TestBase.driver = driver;
	}

	public void EnterEmail(String text) throws IOException, InterruptedException {

		chooseElement("Email_NAME").clear();
		chooseElement("Email_NAME").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("emailAddress entered successfully", true);
		Thread.sleep(3000);
	}

	public void ClickSignUpButton() throws IOException, InterruptedException {
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.cssSelector(".second__text > span"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
		chooseElement("ClickSignUPPBtn_CSS").click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Reporter.log("SignUp button clicked successfully", true);
		Thread.sleep(1000);
	}

	public void ClickTermConditionButton() throws IOException, InterruptedException {

		chooseElement("TickTermsConditionBtn_NAME").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("SignIn button clicked successfully", true);
		Thread.sleep(1000);

	}

	public void ClickSignUp() throws IOException, InterruptedException {

		chooseElement("SignUp_CSS").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("SignUp button clicked successfully", true);
		Thread.sleep(3000);

	}

	public void Clickemail() throws IOException, InterruptedException {

		chooseElement("Selectemail_CSS").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("SignIn button clicked successfully", true);
		Thread.sleep(3000);

	}

	public void ClickOpenEmailBtn() throws IOException, InterruptedException {

		chooseElement("openEmailBtn_CSS").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("SignIn button clicked successfully", true);
		Thread.sleep(3000);

	}

	public void ClickSignuphPhoneNumber() throws IOException, InterruptedException {
		chooseElement("SignUpWithPhoneNumber_XPATH").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("SignIn button clicked successfully", true);
		Thread.sleep(3000);
	}

	public void EnterPhoneNumber(String text) throws IOException, InterruptedException {

		chooseElement("phoneNumber_NAME").clear();
		chooseElement("phoneNumber_NAME").sendKeys(text);
		Reporter.log("phoneNumber entered successfully", true);
		Thread.sleep(3000);
	}

	public void EnterPassword(String text) throws IOException, InterruptedException {

		chooseElement("password_NAME").clear();
		chooseElement("password_NAME").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Password entered successfully", true);
		Thread.sleep(3000);
	}

	public void EnterconfirmPassword(String text) throws IOException, InterruptedException {

		chooseElement("ConfirmPassword_NAME").clear();
		chooseElement("ConfirmPassword_NAME").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("confirmPassword entered successfully", true);
		Thread.sleep(3000);
	}

	public void EnterOTP(String text) throws IOException, InterruptedException {
		chooseElement("InputOtp_XPATH").clear();
		chooseElement("InputOtp_XPATH").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("OTP entered successfully", true);
		Thread.sleep(3000);
	}

	public void ClickNext() throws IOException, InterruptedException {
		chooseElement("ClickNextBtn_XPATH").click();
		Reporter.log("Next button clicked successfully", true);
		Thread.sleep(1000);
	}

	public void ClickGetStarted() throws IOException, InterruptedException {
		chooseElement("GetStarted_CSS").click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Reporter.log("Get Started button clicked successfully", true);

	}

	public void EnterFirstName(String text) throws IOException, InterruptedException {

		chooseElement("FirstName_NAME").clear();
		chooseElement("FirstName_NAME").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("FirstName_NAME entered successfully", true);
		Thread.sleep(3000);
	}

	public void EnterLastName(String text) throws IOException, InterruptedException {

		chooseElement("LastName_NAME").clear();
		chooseElement("LastName_NAME").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("LastName NAME entered successfully", true);
		Thread.sleep(3000);
	}

	public void EnterDateofBirth(String text) throws IOException, InterruptedException {

		chooseElement("DateofBirth_CSS").clear();
		chooseElement("DateofBirth_CSS").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("DateofBirth entered successfully", true);
		Thread.sleep(3000);
	}

	public void EnterPin(String text) throws IOException, InterruptedException {

		chooseElement("Pin_CSS").clear();
		chooseElement("Pin_CSS").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Pin entered successfully", true);
		Thread.sleep(3000);
	}

	public void EnterconfirmPin(String text) throws IOException, InterruptedException {

		chooseElement("ConfirmPin_CSS").clear();
		chooseElement("ConfirmPin_CSS").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("ConfirmPin entered successfully", true);
		Thread.sleep(3000);
	}

	public void ClickSavePin() throws IOException, InterruptedException {
		chooseElement("SavePin_XPATH").click();
		Reporter.log("SavePin button clicked successfully", true);
		Thread.sleep(1000);
	}

	public void SelectGender() {

		WebElement dropdownElement = driver.findElement(By.name("gender"));
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText("Male");
	}

	public void EnterQuickTag(String text) throws IOException, InterruptedException {

		chooseElement("quickTag_NAME").clear();
		chooseElement("quickTag_NAME").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("quickTag NAME entered successfully", true);
		Thread.sleep(3000);
	}

	public void EnterRefferalName(String text) throws IOException, InterruptedException {

		chooseElement("refferedBy_NAME").clear();
		chooseElement("refferedBy_NAME").sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("RefferalName entered successfully", true);
		Thread.sleep(3000);
	}

	public void WelcometoQuicktellerAssertion() throws IOException {
		actualmessage = chooseElement("WelcomeToQuicktellerAssertion_XPATH").getText();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		System.out.println("Actual signup success message  =" + actualmessage);
		Assert.assertEquals(actualmessage, WelcometoQuicktellersuccessmessage);

		System.out.println("WelcometoQuickteller message asserted");
	}

	public void ProfileUpdateAssertion() throws IOException {
		actualmessage = chooseElement("ProfileUpdatedAssertion_XPATH").getText();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Actual profile update success message  =" + actualmessage);
		Assert.assertEquals(actualmessage, ProfileUpdatesuccessmessage);

		System.out.println("Profile Update success message Asserted");
	}

	public void PinSetSuccessAssertion() throws IOException {
		actualmessage = chooseElement("PinSetSuccessAssertion_XPATH").getText();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Actual pin set success message  =" + actualmessage);
		Assert.assertEquals(actualmessage, PinSetsuccessmessage);

		System.out.println("Pin set success message Asserted");
	}

	public void EmailSentAssertion() throws IOException {
		actualmessage = chooseElement("EmailSentAssertion_XPATH").getText();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		System.out.println("Emailsent message  =" + actualmessage);
		Assert.assertEquals(actualmessage, Emailsentmessage);

		System.out.println("Pin set success message Asserted");
	}

	public void AlreadyExistphonenumberAssertion() throws IOException {
		actualmessage = chooseElement("AlreadyExistPhonenumberAssertion_XPATH").getText();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		System.out.println("AlreadyexistPhonenumber error message  =" + actualmessage);
		Assert.assertEquals(actualmessage, AlreadyexistPhonenumbererrmessage);

		System.out.println("AlreadyexistPhonenumber error message Asserted");
	}

	public void InvalidOTPPhoneNumberVerificationAssertion() throws IOException {
		actualmessage = chooseElement("InvalidOTPPhoneNumberVerification_XPATH").getText();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		System.out.println("InvalidOTPPhoneNumberVerification error message  =" + actualmessage);
		Assert.assertEquals(actualmessage, InvalidOTPPhoneNumberVerification);

		System.out.println("Invalid OTP PhoneNumber Verification error message Asserted");
	}

	public void InvalidphoneNumberInputAssertion() throws IOException {
		actualmessage = chooseElement("InvalidaphoneNumberAssertion_XPATH").getText();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Actual error message  =" + actualmessage);
		Assert.assertEquals(actualmessage, InvalidphoneNumberexpectederrormessage);

		System.out.println("Invalid Email Asserted");
	}
	
	public void ClickPersonaliseAccountBtn() throws IOException, InterruptedException {

		chooseElement("PersonaliseAccountBtn_CSS").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Personalise Account  button clicked successfully", true);
		Thread.sleep(1000);

	}

	public void SelectInterests() throws IOException, InterruptedException {

		chooseElement("EntertainmentInterest_XPATH").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chooseElement("InvestmentInterest_XPATH").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chooseElement("MoneyInterest_XPATH").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chooseElement("TransportationInterest_XPATH").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chooseElement("PaymentInterest_XPATH").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chooseElement("LoanInterest_XPATH").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Interest selected successfully", true);
		Thread.sleep(1000);

	}

	public void ClickVerifyEmail() throws IOException, InterruptedException {

		chooseElement("VerifyEmail_CSS").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Verify email clicked successfully", true);
		Thread.sleep(1000);

	}

	public void SelectCountryCode() throws IOException, InterruptedException {

		chooseElement("ClickSignUpCountryCodeDropdown_CSS").click();
		//chooseElement("ClickSearchCountryCode_CSS").click();
		//chooseElement("ClickSearchCountryCode_CSS").sendKeys(text);
		//Thread.sleep(3000);
		chooseElement("SelectfrmDropdown_CSS").click();

		Reporter.log("Country code selected successfully", true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}

	public void ClickClose() throws IOException, InterruptedException {

		chooseElement("close_CSS").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Close clicked successfully", true);
		Thread.sleep(1000);

	}

}
