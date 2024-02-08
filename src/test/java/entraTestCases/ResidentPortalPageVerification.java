package entraTestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestComponents.TestBase;
import commonUtility.CommonFunctions;
import entrataObjectRepo.ObjectRepository;

public class ResidentPortalPageVerification extends TestBase {
	WebDriver driver;

	@Test
	public void verify_ResidentPortal_page() throws IOException {

		driver = launchApplication();
		CommonFunctions com = new CommonFunctions();
		ObjectRepository pageobjects = new ObjectRepository(driver);

		pageobjects.AcceptCookies.click(); // Accept the cookies

		Actions action = new Actions(driver);

		action.moveToElement(pageobjects.Products).perform(); // To hover on products link we use action class
        com.waitUntilElementisVisible(driver, pageobjects.residentPortalheaderlink);
		pageobjects.residentPortalheaderlink.click();
		String ExpectedPageTitle = driver.getTitle();
		String ActualPageTitle = "Property Management Software | Entrata";

		Assert.assertEquals(ActualPageTitle, ExpectedPageTitle); // Page title verification

		// Stale element exception handled by try catch block
		try {
			com.waitUntilElementisClickable(driver, pageobjects.residentPortalScheduleDemoButton);
			pageobjects.residentPortalScheduleDemoButton.click();
		} catch (Exception e) {
			driver.navigate().refresh();
			com.waitUntilElementisClickable(driver, pageobjects.residentPortalScheduleDemoButton);
			pageobjects.residentPortalScheduleDemoButton.click();
		}
		// fill the resident portal Schedule Demo form

		pageobjects.firstname.sendKeys("Testfirstname");
		pageobjects.lastname.sendKeys("Testlastname");
		pageobjects.Email.sendKeys("abc@gmail.com");

		System.out.println("Able to fill the Schedule demo form");

		tearDown();

	}
}