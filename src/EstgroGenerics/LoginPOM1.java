package EstgroGenerics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import EstgroUtils.AllMethodz;

public class LoginPOM1
{

public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	
	AllMethodz Mez = new AllMethodz(driver);	
	Mez.enterUrl();	
	Mez.loginlink();	
	Mez.enterEmail("nkl.adv@yopmail.com");	
	Mez.enterPassword("Dots@123");	
	Mez.submit();
	
}}