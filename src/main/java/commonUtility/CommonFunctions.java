package commonUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {
	// Explicit wait
	// WebDriver driver;
	public WebDriver waitUntilElementisVisible(WebDriver driver, WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(e));
		wait.until(ExpectedConditions.elementToBeClickable(e));
		return driver;
	}

	public WebDriver waitUntilElementisClickable(WebDriver driver, WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(e));
		return driver;
	}
}
