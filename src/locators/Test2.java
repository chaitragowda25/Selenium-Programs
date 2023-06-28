package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) 
	{
		   WebDriver driver=new FirefoxDriver();
	 	   driver.manage().window().maximize();
	 	   driver.get("https://www.facebook.com/");

	 	   driver.findElement(By.id("email")).sendKeys("Chaitra Gowda");
	 	   driver.findElement(By.name("pass")).sendKeys("Chaitra@20");
	 	   driver.findElement(By.linkText("Forgotten password?")).click();
	 	   driver.findElement(By.id("identify_email")).sendKeys("8884892171");
	 	   driver.findElement(By.name("did_submit")).click();
	}

}
