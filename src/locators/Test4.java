package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
         driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");		
         driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manger");
    }
}
