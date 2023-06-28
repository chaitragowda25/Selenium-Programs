package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {

	public static void main(String[] args) 
	{
		   WebDriver driver = new FirefoxDriver();
	 	   driver.manage().window().maximize();
	 	   driver.get("https://www.amazon.com/");
	 	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	 	   WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));

	 	   Actions a = new Actions(driver);
	 	   a.contextClick(ele).perform();
		
	}

}
