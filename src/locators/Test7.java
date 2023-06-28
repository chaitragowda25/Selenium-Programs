package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test7
{

	public static void main(String[] args) 
	{
		 WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("username")).sendKeys("chaitragowda2025");
		driver.findElement(By.name("password")).sendKeys("Shantha@620#");
		driver.findElement(By.xpath("(//div[contains(@class,'x9f619')])[4]")).click();
	}

}
