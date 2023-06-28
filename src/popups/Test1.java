package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 
{

	public static void main(String[] args)
	{
		   WebDriver driver = new FirefoxDriver();
	  	   driver.manage().window().maximize();
	 	   driver.get("https://www.redbus.in/");
	 	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


	 	   driver.findElement(By.xpath("//label[text()=' date']")).click();
	 	   driver.findElement(By.xpath("//td[text()='20']")).click();
	}
}
