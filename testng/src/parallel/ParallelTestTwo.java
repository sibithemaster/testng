package parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTestTwo {

	WebDriver driver;
	
	@Test
	void login()
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/");		
		driver.findElement(By.name("username")).sendKeys("sibi");
		driver.findElement(By.name("password")).sendKeys("sibi");
		
	}
	
	@AfterMethod
	void close()
	{
		driver.quit();
	}
}
