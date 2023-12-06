package com.rebirthQuickteller.TestCases;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.rebirthQuickteller.base.TestBase;

import pages.LoginPageObjects;
import pages.UpdatePersonalDetailsPageObjects;

public class UpdatePersonalDetails extends TestBase {

	TestBase test = new TestBase();
	UpdatePersonalDetailsPageObjects PersonalDetailsPageObj = new UpdatePersonalDetailsPageObjects(driver);
	LoginPageObjects LoginPageObj = new LoginPageObjects(driver);

	@Test(priority = 1, description = "This test case will perform occupation update")
	public void UpdateOccupation() throws IOException, InterruptedException {

		Reporter.log("Test to verify user can update occupation started !!!",
				true);
		LoginPageObj.ClickSignInWithPhoneNumberButton();
		LoginPageObj.EnterPhoneNumber("09125490124");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		LoginPageObj.ValidateHomePageUrl();
		PersonalDetailsPageObj.Click_AccountandSettings();
		PersonalDetailsPageObj.Click_ProfiledetailsDropdown();
		// PersonalDetailsPageObj.lastnameAssertion();

		// PersonalDetailsPageObj.EditAssertion();
		// PersonalDetailsPageObj.Click();
		PersonalDetailsPageObj.Click_Edit();
		PersonalDetailsPageObj.EnterOccupation(generateRandomName());
		PersonalDetailsPageObj.Click_Save();
		PersonalDetailsPageObj.SuccessfulProfileUpdateAssertion();
		Reporter.log("Test to verify user can update occupation completed !!!",
				true);
	}

	@Test(priority = 2, description = "This test case will perform address update")
	public void UpdateAddress() throws IOException, InterruptedException {
		NavigateHomePage();
		Reporter.log("Test to verify user can update address started !!!",
				true);
		LoginPageObj.ClickSignInWithPhoneNumberButton();
		LoginPageObj.EnterPhoneNumber("09125490124");
		LoginPageObj.EnterPassword("Ademola1@");
		LoginPageObj.ClickSignInButton();
		LoginPageObj.ValidateHomePageUrl();
		PersonalDetailsPageObj.Click_AccountandSettings();
		PersonalDetailsPageObj.Click_AddressDropdown();
		// PersonalDetailsPageObj.lastnameAssertion();

		// PersonalDetailsPageObj.EditAssertion();
		// PersonalDetailsPageObj.Click();
		PersonalDetailsPageObj.Click_Edit();
		PersonalDetailsPageObj.selectRandomState();
		PersonalDetailsPageObj.selectRandomLGA();
		PersonalDetailsPageObj.EnterAddress(RandomStreetGenerator());
		PersonalDetailsPageObj.EnterCity(RandomCityGenerator());
		PersonalDetailsPageObj.Click_Save();
		PersonalDetailsPageObj.SuccessfulAddressUpdateAssertion();
		Reporter.log("Test to verify user can update address completed !!!",
				true);
	}

}
