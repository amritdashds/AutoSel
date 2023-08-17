package Estgro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EstgroForgot {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://staging-advisor.estgro.24livehost.com/");
		Thread.sleep(3000);				
		driver.findElement(By.xpath("//a[@href='account/login']")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//a[@href='account/forgot-password']")).click();
//		driver.findElement(By.xpath("//input[@class='form-control form-control-icon valid'])";
//		driver.quit();
		
	}

}
