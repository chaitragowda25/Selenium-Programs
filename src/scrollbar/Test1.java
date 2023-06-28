package scrollbar;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		   WebDriver driver = new FirefoxDriver();
	 	   driver.manage().window().maximize();
	 	   driver.get("https://www.myntra.com/");
	 	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	 	     WebElement ele = driver.findElement(By.xpath("//img[@alt='New arrivals in Toys']"));
	 	     Point loc = ele.getLocation();
	 	     int x = loc.getX();
	 	     int y = loc.getY();

	 	     JavascriptExecutor js = (JavascriptExecutor) driver;
	 	     js.executeScript("window.scrollBy("+x+","+y+")");

	 	     Thread.sleep(3000);

	 	     ele.click();

	}

}
