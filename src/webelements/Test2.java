package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
  	    driver.manage().window().maximize();
  	    driver.get("https://www.facebook.com/");
  	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


  	   WebElement srachtb = driver.findElement(By.name("login"));
  	   Dimension s = srachtb.getSize();
  	   int h = s.getHeight();
  	   System.out.println("Height of the element "+ h);

  	   int w = s.getWidth();
  	   System.out.println("Width of the element "+ w);

  	   driver.close();
	}

}
