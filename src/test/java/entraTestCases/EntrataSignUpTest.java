package entraTestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestComponents.TestBase;
import commonUtility.CommonFunctions;
import entrataObjectRepo.ObjectRepository;

public class EntrataSignUpTest extends TestBase {

	// verify error message for incorrect credentials for property manager.

	WebDriver driver;

	@Test
	public void VerifyErrorMessageOnSignOnPage() throws IOException {
		driver = launchApplication(); // launch the application
		CommonFunctions comfuncion = new CommonFunctions();
		ObjectRepository pageobjects = new ObjectRepository(driver);

		pageobjects.AcceptCookies.click(); // Accept the cookies

		driver = comfuncion.waitUntilElementisVisible(driver, pageobjects.SignInButton);// Explicit wait

		pageobjects.SignInButton.click();
		pageobjects.PropertyManagerLoginButton.click();
		pageobjects.username.sendKeys("DemoUsername");
		pageobjects.Password.sendKeys("demopassword");
		pageobjects.SignIn.click();
		String ExpectedMessgae = pageobjects.ErrorMsg.getText();
		String ActualMessage = "The username and password provided are not valid. Please try again.";

		Assert.assertEquals(ActualMessage, ExpectedMessgae); // Assertion to verify the expected error message.

		System.out.println("Correct Error Message is coming after giving wrong credentials");
		tearDown();

	}
}
