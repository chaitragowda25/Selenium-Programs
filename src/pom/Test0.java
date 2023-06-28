package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test0 
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//WebElement ele = driver.findElement(By.name("q"));
          Test1 t=new Test1(driver);
          
		  driver.navigate().refresh();

		//ele.sendKeys("phone");
		t.serach("phone");
	}

}
