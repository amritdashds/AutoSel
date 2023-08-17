package EstgroUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject 
 {
	
	private WebDriver driver;

	public LoginPageObject(WebDriver driver)
	{
			this.driver = driver;
	}
	
	//Locator for login click
	By loginlink = By.xpath("//a[@href='account/login']");
	
	//Locator for Email field
	By Emailfield = By.xpath("//input[@class='form-control form-control-icon valid']");
		
	//Locator for password field
	By passw = By.xpath("//input[@class=\"form-control form-control-icon form-control-password  valid\"]");
	
	//Locator for login button
	By loginbtn = By.xpath("//button[@class='btn-custom btn-md w-100 dbtn-custom']");
	
	//Locator for logout button
	By logoutbtn = By.xpath("//a[@href='Identify/account/logout']");
		
	//Method to click loginlink
		public void loginlink() 
		{
			driver.findElement(loginlink).click();
		}
		
		//Method to enter Email
		public void enterUsername(String mail)
		{
			driver.findElement(Emailfield).sendKeys(mail);
		}
		
	//Method to enter password
	public void enterPassword(String pwd) 
	{
		driver.findElement(passw).sendKeys(pwd);
	}
	
	//Method to click on Login button
	public void clickLogin() 
	{
		driver.findElement(loginbtn).click();
	}
	
	//Method to click on logout button
		public void clickLogout() 
		{
			driver.findElement(logoutbtn).click();
		}
	
 }
