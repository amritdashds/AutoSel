package JAVAPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> WL= driver.findElements(By.tagName("a"));
		
		for (int i = 0; i < WL.size(); i++)
{
            WebElement link = WL.get(i);
            
            String linkText = link.getText();
            
            String linkUrl = link.getAttribute("a");
                        
            if (!linkText.isEmpty()) 
            {
                           
            System.out.println("Link " + i + ": " + linkText + " - " + linkUrl);
            
            }
        }
		
		driver.quit();
	}
	
	}