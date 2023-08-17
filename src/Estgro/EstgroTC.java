package Estgro;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EstgroTC {

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		try 
		{
			driver.get("https://staging-advisor.estgro.24livehost.com/");
			
		}
		finally 
		{
			System.out.println("URL not found");
		}
						
		driver.findElement(By.xpath("//a[@href='account/login']")).click();
		Thread.sleep(3000);
		
//		Email & Password
		driver.findElement(By.xpath("//input[@class=\"form-control form-control-icon valid\"]")).sendKeys("nkl.adv@yopmail.com");
		driver.findElement(By.xpath("//input[@class=\"form-control form-control-icon form-control-password  valid\"]")).sendKeys("Dots@123");
		
		Thread.sleep(3000);
				
		driver.findElement(By.xpath("//a[@href='/portal-settings']")).click();
		driver.findElement(By.xpath("//a[@href='/portal-settings/email-configuration/edit-content']")).click();		
		driver.findElement(By.xpath("//img[@src='assets/images/back-arrow.svg']")).click();
		
		driver.findElement(By.xpath("//a[@href='/portal-settings']")).click();	
		driver.findElement(By.xpath("//a[@href='/portal-settings/service-level/set']")).click();	
		driver.findElement(By.xpath("//img[@src='assets/images/back-arrow.svg']")).click();
					
		driver.findElement(By.xpath("//a[@href='/portal-settings']")).click();
		driver.findElement(By.xpath("//a[@href='/portal-settings/customise-client-portal']")).click();
		driver.findElement(By.xpath("//img[@src='assets/images/back-arrow.svg']")).click();
		
		driver.findElement(By.xpath("//a[@href='/portal-settings']")).click();	
		driver.findElement(By.xpath("//a[@href='/portal-settings/setup-payments']")).click();	
		driver.findElement(By.xpath("//img[@src='assets/images/back-arrow.svg']")).click();
		
		driver.findElement(By.xpath("//a[@href='/portal-settings']")).click();		
		driver.findElement(By.xpath("//a[@href='/portal-settings/set-preference']")).click();		
		driver.findElement(By.xpath("//img[@src='assets/images/back-arrow.svg']")).click();
		
		
		driver.findElement(By.xpath("//a[@href='/portal-settings']")).click();			
		driver.findElement(By.xpath("//a[@href='/portal-settings/accredited/request']")).click();			
		driver.findElement(By.xpath("//img[@src='assets/images/back-arrow.svg']")).click();
		
		
		driver.findElement(By.xpath("//a[@href='/portal-settings']")).click();			
		driver.findElement(By.xpath("//a[@href='/portal-settings/recommendation-list']")).click();		
		driver.findElement(By.xpath("//img[@src='assets/images/back-arrow.svg']")).click();
	
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector('.main-sidebar.main-sidebar-new.d-flex.flex-column').scrollTop=500");
//		js.executeScript("var element = document.querySelector('.main-sidebar.main-sidebar-new.d-flex.flex-column'); element.scrollTop = 5000;");
		Thread.sleep(6000);		
		
		driver.findElement(By.xpath("//a[@href='/Identity/Account/Logout']")).click();
		Thread.sleep(3000);
			
		driver.quit();
		
	}

}
