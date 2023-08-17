package JAVAPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle {

	public static void main(String[] args) {
		
//		String chromeDriverPath = "D:\\Amrit\\Allzz\\BroswerDrivers\\chromedriver.exe";
//
//		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "D:\\Amrit\\Allzz\\geckodriver-v0.33.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
//		driver.findElement(By.className("M6CB1c rr4y5c")).click();
//		driver.findElement(By.id("searchInput")).sendKeys("Selenium WebDriver");
		String Tring= driver.getTitle();
		System.out.println(Tring);
		if (Tring.equals("Google")) 
		{
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Incorrect Title");
		}
				
		driver.close();
		
	}

}
