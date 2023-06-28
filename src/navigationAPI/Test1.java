package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.navigate().to("https://www.amazon.com/");

		Thread.sleep(3000);
		driver.navigate().back();

		Thread.sleep(3000);
		driver.navigate().forward();

		Thread.sleep(3000);
		driver.navigate().refresh();

		driver.close();
    }
}
