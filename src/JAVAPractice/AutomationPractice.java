package JAVAPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Click on Radio Button Example
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		
		// Click on Dropdown Example
		WebElement dd = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		dd.click();
		Select drop = new Select(dd);
		drop.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Thread.sleep(2000);
		
		WebElement cd = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		cd.sendKeys("Ind");
				
//		List<WebElement> options = driver.findElements(By.xpath("//input[@id='autocomplete']"));
		List<WebElement> optionz = driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete')]//li"));
		for (WebElement option : optionz) 
		{
			if (option.getText().equalsIgnoreCase("India")) 
			{
				option.click();
				break;
			}			
			
		}
		System.out.println("Perfect");
		driver.quit();
	}

}
