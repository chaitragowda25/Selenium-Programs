package scrollbar;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test0 
{

	public static void main(String[] args) throws InterruptedException
	{
		  WebDriver driver = new FirefoxDriver();
	 	   driver.manage().window().maximize();
	 	   driver.get("https://www.myntra.com/");
	 	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	 	   //typecasting
	 	   JavascriptExecutor js = (JavascriptExecutor) driver;
	 	   js.executeScript("window.scrollBy(0,5000)");

	 	   Thread.sleep(3000);

	 	   js.executeScript("window.scrollBy(0,-5000)");
	}

}
