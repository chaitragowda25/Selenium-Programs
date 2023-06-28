package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test7 {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.facebook.com/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    	WebElement ele = driver.findElement(By.xpath("//h2[contains(@class,\"_8eso\")]"));
    	System.out.println(ele.getText());

    	driver.close();
		

	}

}
