package parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTestingMethods
{

	WebDriver driver;
	
	@Test
	void logo() throws InterruptedException
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement logo=driver.findElement(By.xpath("//i[@data-visualcompletion='css-img']"));		
		Assert.assertTrue(logo.isDisplayed());
	}
	
	@Test
	void homePageTitle() throws InterruptedException
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),"Instagram");
	}
	@AfterMethod
	void close()
	{
		driver.quit();
	}
}

