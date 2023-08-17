package EstgroUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllMethodz {

    private WebDriver driver;

    public AllMethodz(WebDriver driver) 
    {
        this.driver = driver;
    }
    public void enterUrl() 
    {
    	driver.manage().window().maximize();
        driver.get("https://staging-advisor.estgro.24livehost.com//");      
            }
    public void loginlink() 
    {
        WebElement url = driver.findElement(By.xpath("//a[@href='account/login']"));
//        driver.findElement(By.className("btn-custom btn-outlined dbtn-outlined")).click();
		url.click();
		
    }
    public void enterEmail(String email) 
    {
        WebElement emailInput = driver.findElement(By.xpath("//input[@class='form-control form-control-icon valid']"));
        emailInput.clear();
        emailInput.sendKeys(email);
        
    }
    public void enterPassword(String password) 
    {
        WebElement passwordInput = driver.findElement(By.xpath("//input[@class='form-control form-control-icon form-control-password  valid']"));
        passwordInput.clear();
        passwordInput.sendKeys(password);
      
    }
    public void submit() 
    {
        driver.findElement(By.xpath("//button[@class='btn-custom btn-md w-100 dbtn-custom']")).click();
    }
    public void logout() 
    {
        WebElement sidebar = driver.findElement(By.cssSelector(".main-sidebar.main-sidebar-new.d-flex.flex-column"));
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollTo(0, 0);", sidebar);

        driver.findElement(By.cssSelector("a[href='/Identity/Account/Logout']")).click();
    }
}