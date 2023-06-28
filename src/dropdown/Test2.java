package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
	 	   driver.manage().window().maximize();
	 	   driver.get("https://demoapp.skillrary.com/");
	 	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	 	    WebElement dd = driver.findElement(By.id("cars"));
	 	    Select s = new Select(dd);
		    s.selectByIndex(3);
		    s.selectByValue("99");
		    s.selectByVisibleText("More Than INR 500 ( 55 )  ");

		    s.deselectByIndex(3);
		    s.deselectByValue("99");
		    s.deselectByVisibleText("More Than INR 500 ( 55 )  ");
     }
}

