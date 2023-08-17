package Estgro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EstgroLogin 

{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staging-advisor.estgro.24livehost.com/");
		Thread.sleep(3000);
//		driver.findElement(By.className("M6CB1c rr4y5c")).click();
//		driver.findElement(By.id("searchInput")).sendKeys("Selenium WebDriver");
		
		driver.findElement(By.xpath("//a[@href='account/login']")).click();
		Thread.sleep(3000);
		
//		Email 
		driver.findElement(By.xpath("//input[@class='form-control form-control-icon valid']")).sendKeys("lmj.adv@yopmail.com");
//		driver.findElement(By.cssSelector(".form-group>input")).sendKeys("lmj.adv@yopmail.com");
		Thread.sleep(3000);
		
//		Password
		driver.findElement(By.xpath("//input[@class=\"form-control form-control-icon form-control-password  valid\"]")).sendKeys("Dots@123");
		Thread.sleep(3000);
		
//		Submit
		driver.findElement(By.xpath("//button[@class='btn-custom btn-md w-100 dbtn-custom']")).click();
		Thread.sleep(3000);
				
		String Tring= driver.getTitle();
		System.out.println(Tring);
		
		String URL= driver.getCurrentUrl();
		System.out.println(URL);
		
		String PS= driver.getPageSource();
		System.out.println(PS);
		
		if (Tring.contains("Estgro")) 
		{
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Incorrect Title");
		}		
		
//		driver.findElement(By.xpath("//a[@href='Identify/account/logout']")).click();
		driver.quit();
		
	}

}
