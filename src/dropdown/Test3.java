package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) 
	{
		   WebDriver driver = new FirefoxDriver();
	 	   driver.manage().window().maximize();
	 	   driver.get("https://demoapp.skillrary.com/");
	 	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	 	    WebElement dd = driver.findElement(By.id("cars"));
	 	    Select s = new Select(dd);
		    s.selectByIndex(0);
		    s.selectByValue("199");
		    s.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");

		    System.out.println(s.isMultiple());

		    if(s.isMultiple())
		    {
		    	s.deselectAll();
		    }
		

	}

}
