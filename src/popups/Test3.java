package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test3 
{

	public static void main(String[] args) 
	{
		FirefoxOptions option=new FirefoxOptions();
        option.addArguments("--disable-notifications");
        WebDriver driver1=new FirefoxDriver(option);
        
        
		driver1.manage().window().maximize();
		driver1.get("https://www.olx.in/");
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		
	}

}
