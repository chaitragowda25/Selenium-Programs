package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Testcase1 
{
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void tc1()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		Reporter.log(title,true);
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(title, "Facebook – log in or sign up");
		
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		s.assertAll();
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}
}
