package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
  	    driver.manage().window().maximize();
  	    driver.get("https://demo.vtiger.com/vtigercrm/index.php");
  	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

  	  driver.findElement(By.xpath("//button[@class=\"button buttonBlue\"]")).submit();
		
		

	}

}
