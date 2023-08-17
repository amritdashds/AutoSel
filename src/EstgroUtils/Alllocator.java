package EstgroUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alllocator 
{

	static WebDriver driver;	
	

public static void main(String[] args) throws InterruptedException 
{
//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://staging-advisor.estgro.24livehost.com/");
//	Thread.sleep(3000);
	
	By loginlink = By.xpath("//a[@href='account/login']");
	getElement(loginlink).click();
	
	By mail = By.xpath("//input[@class='form-control form-control-icon valid']");
	getElement(mail).sendKeys("nkl.adv@yopmail.com");
	
	By pwd = By.xpath("//input[@class=\"form-control form-control-icon form-control-password  valid\"]");
	getElement(pwd).sendKeys("Dots@123");
	
	By loginbtn = By.xpath("//button[@class='btn-custom btn-md w-100 dbtn-custom']");
	getElement(loginbtn).click();
		
	By ps = By.xpath("//a[@href='/portal-settings']");	
	getElement(ps).click();
	
	By emailc = By.xpath("//a[@href='/portal-settings/email-configuration/edit-content']");
	getElement(emailc).click();
	
	By arrow = By.xpath("//img[@src='assets/images/back-arrow.svg']");
	getElement(arrow).click();
	
	By users = By.xpath("//a[@href='/manage-users/internal-users\']");
	getElement(users).click();
	
	By doc = By.xpath("//a[@href='/documents']");
	getElement(doc).click();
	
	By emailh = By.xpath("//a[@href='/email-history']");
	getElement(emailh).click();
	
	By clients = By.xpath("//a[@href='/clients']");
	getElement(clients).click();
	
	By pmt = By.xpath("//a[@href='/payment-history']");
	getElement(pmt).click();
	
	By help = By.xpath("//a[@href='/helpandsupport']");
	getElement(help).click();
	
	By ma = By.xpath("//a[@href='/account/my-account']");
	getElement(ma).click();
	
	By ba = By.xpath("//a[@href='/manage-business-account']");
	getElement(ba).click();
	
	By logoutbtn = By.xpath("//a[@href='Identify/account/logout']");
	getElement(logoutbtn).click();
	
}
public static WebElement getElement(By locator)
{
	return driver.findElement(locator);
}

}
