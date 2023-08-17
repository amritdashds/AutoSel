package EstgroGenerics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import EstgroUtils.LoginPageObject;

public class LoginPOM2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
  		driver.manage().window().maximize();
		driver.get("https://staging-advisor.estgro.24livehost.com/");
		Thread.sleep(3000);
		
		LoginPageObject home = new LoginPageObject(driver);
		home.loginlink();
		
		home.enterUsername("mkl.adv@yopmail.com");
		home.enterPassword("Dots@123");
		home.clickLogin();
		
		}
}