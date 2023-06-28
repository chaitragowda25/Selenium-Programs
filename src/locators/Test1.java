package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args)
	{
		   WebDriver driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/");

		   driver.findElement(By.id("email")).sendKeys("chaitragowda2025@gmail.com");
		   driver.findElement(By.name("pass")).sendKeys("Chaitra@20");
		   driver.findElement(By.name("login")).click();
	}

}
