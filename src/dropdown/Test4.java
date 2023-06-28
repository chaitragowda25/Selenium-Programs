package dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) throws InterruptedException 
	{
		  WebDriver driver = new FirefoxDriver();
	 	   driver.manage().window().maximize();
	 	   driver.get("https://www.facebook.com/");
	 	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	 	   driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

	 	  WebElement ele = driver.findElement(By.id("month"));
	 	  Select s = new Select(ele);
	 	  Thread.sleep(2000);

	 	  s.selectByIndex(0);
	 	  Thread.sleep(2000);
	 	  s.selectByValue("4");
	 	  Thread.sleep(2000);
	 	  s.selectByVisibleText("Dec");

	 	 List<WebElement> opt = s.getOptions();
	 	 System.out.println(opt.size());

	 	 ArrayList a = new ArrayList<>();

	 	 for(WebElement b:opt)
	 	 {
	 		 String text = b.getText();
	 		 System.out.println(text);
	 		 a.add(text);
	 	 }

	 	 Collections.sort(a);

	 	 System.out.println("**************After Sorting**************");

	 	 for(Object b:a)
	 	 {
	 		 System.out.println(b);

	 	 }
	 	 driver.close();

	}

}

