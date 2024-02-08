package TestComponents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

		
		WebDriver driver;
	   
	   public WebDriver launchApplication() throws IOException 
	   {
		   WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.entrata.com/");  
		    return driver;
	   }
	   
	   
	   
	   public void tearDown() 
	   {
		   driver.quit();
	   }
	   
	
}


