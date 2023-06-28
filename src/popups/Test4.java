package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test4 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
	 	driver.manage().window().maximize();
	 	driver.get("https://www.olx.in/");
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	 	String parent = driver.getWindowHandle();
	 	System.out.println(parent);

	 	driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.youtube.com/");

		Set<String> child = driver.getWindowHandles();
		System.out.println(child);

		driver.quit();
     }
}
