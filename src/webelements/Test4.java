package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 {

	public static void main(String[] args) 
	{
		    WebDriver driver=new FirefoxDriver();
	  	    driver.manage().window().maximize();
	  	    driver.get("https://www.myntra.com/");
	  	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	  	  WebElement usertb = driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]"));

		   if(usertb.isDisplayed())
		   {
			   System.out.println("Pass: Element is displayed");
			   usertb.sendKeys("admin1234567890");
		   }
		   else
		   {
			   System.out.println("Fail: Element is not displayed");
		   }
		
	}

}
