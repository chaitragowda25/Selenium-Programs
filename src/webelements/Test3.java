package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
 	    driver.manage().window().maximize();
 	    driver.get("https://www.facebook.com/");
 	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

 	    WebElement srachtb = driver.findElement(By.id("email"));

 	    System.out.println(srachtb.getAttribute("name"));
 	    System.out.println(srachtb.getAttribute("aria-label"));
 	    System.out.println(srachtb.getAttribute("type"));


 	    driver.close();

		
	}

}
