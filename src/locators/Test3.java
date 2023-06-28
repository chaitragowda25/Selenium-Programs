package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 
{

	public static void main(String[] args)
	{
		   WebDriver driver=new FirefoxDriver();
	 	   driver.manage().window().maximize();
	 	   driver.get("https://demoapp.skillrary.com/login.php?type=login");

	 	   driver.findElement(By.partialLinkText("password?")).click();
		

	}

}
