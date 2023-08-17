package Estgro;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class EstgroPS {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://staging-advisor.estgro.24livehost.com/");
		Thread.sleep(3000);
				
		driver.findElement(By.xpath("//a[@href='account/login']")).click();
		Thread.sleep(3000);
		
//		Email & Password 
		driver.findElement(By.xpath("//input[@class=\"form-control form-control-icon valid\"]")).sendKeys("zxc.adv@yopmail.com");
		driver.findElement(By.xpath("//input[@class=\"form-control form-control-icon form-control-password  valid\"]")).sendKeys("Dots@123");
		
		//Login Button
		driver.findElement(By.xpath("//button[@class='btn-custom btn-md w-100 dbtn-custom']")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//a[@href='/portal-settings']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/portal-settings/email-configuration/edit-content']")).click();		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='assets/images/back-arrow.svg']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='/portal-settings']")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/portal-settings/service-level/set']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='assets/images/back-arrow.svg']")).click();
		Thread.sleep(3000);
					
		driver.findElement(By.xpath("//a[@href='/portal-settings']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/portal-settings/customise-client-portal']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='assets/images/back-arrow.svg']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='/portal-settings']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/portal-settings/setup-payments']")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='assets/images/back-arrow.svg']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='/portal-settings']")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/portal-settings/set-preference']")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='assets/images/back-arrow.svg']")).click();
		Thread.sleep(3000);
				
		driver.findElement(By.xpath("//a[@href='/portal-settings']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/portal-settings/accredited/request']")).click();			
		driver.findElement(By.xpath("//img[@src='assets/images/back-arrow.svg']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[@href='/portal-settings']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/portal-settings/recommendation-list']")).click();		
		driver.findElement(By.xpath("//img[@src='assets/images/back-arrow.svg']")).click();
		Thread.sleep(3000);
			
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector('.main-sidebar.main-sidebar-new.d-flex.flex-column').scrollTop=500");
//		js.executeScript("var element = document.querySelector('.main-sidebar.main-sidebar-new.d-flex.flex-column'); element.scrollTop = 5000;");
		Thread.sleep(6000);		
		
		driver.findElement(By.xpath("//a[@href='/Identity/Account/Logout']")).click();
		Thread.sleep(3000);
			
		driver.quit();
		
	}

}
