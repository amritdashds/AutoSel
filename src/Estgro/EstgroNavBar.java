package Estgro;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EstgroNavBar {

	public static void main(String[] args) throws InterruptedException {
		
//		String chromeDriverPath = "D:\\Amrit\\Allzz\\BroswerDrivers\\chromedriver.exe";
//
//		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://staging-advisor.estgro.24livehost.com/");
		Thread.sleep(3000);
		
		try 
		{
			WebElement url = driver.findElement(By.xpath("//a[@href='account/login']"));
			url.click();
		} 
		finally
		{
			System.out.println("Issue in clicking");
		}		
		
//		driver.findElement(By.className("M6CB1c rr4y5c")).click();
//		driver.findElement(By.id("searchInput")).sendKeys("Selenium WebDriver");
		
		driver.findElement(By.xpath("//a[@href='account/login']")).click();
		Thread.sleep(3000);
		
//		Email 
		driver.findElement(By.xpath("//input[@class=\"form-control form-control-icon valid\"]")).sendKeys("nkl.adv@yopmail.com");
//		driver.findElement(By.cssSelector(".form-group>input")).sendKeys("lmj.adv@yopmail.com");
		
//		Password
		driver.findElement(By.xpath("//input[@class=\"form-control form-control-icon form-control-password  valid\"]")).sendKeys("Dots@123");
		driver.findElement(By.xpath("//button[@class='btn-custom btn-md w-100 dbtn-custom']")).click();
		Thread.sleep(9000);
				
		driver.findElement(By.xpath("//a[@href='/portal-settings']")).click();
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//a[@href='/portal-settings/email-configuration/edit-content']")).click();
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//img[@src='assets/images/back-arrow.svg']")).click();
		Thread.sleep(3000);		
		
		driver.findElement(By.xpath("//a[@href='/manage-users/internal-users\']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='/documents']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='/email-history']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='/clients']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='/payment-history']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='/helpandsupport']")).click();
		Thread.sleep(6000);
	  
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector('.main-sidebar.main-sidebar-new.d-flex.flex-column').scrollTop=500");
//		js.executeScript("var element = document.querySelector('.main-sidebar.main-sidebar-new.d-flex.flex-column'); element.scrollTop = 5000;");
		Thread.sleep(6000);		
		
		driver.findElement(By.xpath("//a[@href='/account/my-account']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='/manage-business-account']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='/Identity/Account/Logout']")).click();
		Thread.sleep(3000);
			
		driver.quit();
		
	}

}
