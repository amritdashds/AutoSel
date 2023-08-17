package EstgroUtils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class ElementUtil 
{
//
//	private WebDriver driver;	
//	
//
//	public ElementUtil(WebDriver driver) 
//	{
//		this.driver = driver;	
//	}
//	
	public void doSelectDropDownByIndex(By locator, int index) 
	{
			if (index < 0) 
			{
				System.out.println("please pass the right (+ve) index");
				return;
			}
//			Select select = new Select(getElement(locator));
//			select.selectByIndex(index);
		}
	
	public void doSendKeys(By locator, String value) throws Exception 
	{

		if (value == null)
		{
			System.out.println("value can not be null");
			throw new Exception("VALUECANNOTBENULL");
		}

		getElement(locator).sendKeys(value);
	}


	private Alert getElement(By locator)
	{
		return null;
	}
		}