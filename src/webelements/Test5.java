package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test5 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
 	    driver.manage().window().maximize();
 	    driver.get("https://www.facebook.com/");
 	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

 	   WebElement login = driver.findElement(By.xpath("//button[@value=\"1\"]"));

 	   if(login.isEnabled())
 	   {
 		   System.out.println("Pass: Element is enabled");
 		   login.click();

 	   }
 	   else
 	   {
 		   System.out.println("Fail: Element is not enabled");
 	   }

	}

}
