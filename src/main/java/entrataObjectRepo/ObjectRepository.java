package entrataObjectRepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectRepository {
	WebDriver driver;
	public ObjectRepository(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@class='button-default outline-dark-button']")
	public WebElement SignInButton;
	
	@FindBy(xpath="//a[contains(@title,'Client Login Button')]")
	public WebElement PropertyManagerLoginButton;
	
	@FindBy(id="entrata-username")
	public WebElement username;
	
	@FindBy(id="rcc-confirm-button")
	public WebElement AcceptCookies;
	
	@FindBy(xpath="//input[@name='company_user[password]']")
	public WebElement Password;
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	public WebElement SignIn;
	
	@FindBy(id="statusMessage")
	public WebElement ErrorMsg;
	
	@FindBy(xpath="//div[@class='nav-group']/a[text()='ResidentPortal']")
	public WebElement residentPortalheaderlink;
	
	@FindBy(xpath="(//div[@class='main-nav-link'])[1]")
	public WebElement Products;
	
	@FindBy(xpath="//a[contains(@title,'Resident')]")
	public WebElement residentPortalScheduleDemoButton;
	
	@FindBy(id="FirstName")
	public WebElement firstname;
	
	@FindBy(id="LastName")
	public WebElement lastname;
	
	@FindBy(id="Email")
	public WebElement Email;
}
