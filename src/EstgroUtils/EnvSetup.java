package EstgroUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnvSetup {
	
	public static WebDriver webDriver;

	public static WebDriver Browser(String browser, String url) 
	{
				
		if (browser.equals("chrome")) 
		{
//			ChromeDriver CD = new ChromeDriver();
			webDriver = new ChromeDriver();
			}
				
		else if (browser.equals("firefox")) 
		{
//			FirefoxDriver FD = new FirefoxDriver();
		    webDriver = new FirefoxDriver();			
		}		
		webDriver.manage().window().maximize();
		return webDriver;
	}
}