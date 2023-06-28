package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test0 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);
		//back
		driver.navigate().back();

		Thread.sleep(3000);
		//forward
		driver.navigate().forward();

		Thread.sleep(3000);
		//refresh
		driver.navigate().refresh();

		driver.close();
    }
}

