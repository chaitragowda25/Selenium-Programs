package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test6 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
    	driver.get("https://www.facebook.com/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    	driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
    	WebElement button = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));

    	if(button.isSelected())
    	{
    		System.out.println("Pass : Button is selected");
    	}
    	else
    	{
    		System.out.println("Fail : Button is not selected");
    	}
    	driver.close();
		

	}

}
