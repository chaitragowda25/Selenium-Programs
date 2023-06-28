package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Facebook fb=new Facebook(driver);
		fb.emailaddresstb("chaitragowda2025@gmail.com");
		fb.passwordtb("Chaitra@20");
		fb.loginbutton();
	}
}
