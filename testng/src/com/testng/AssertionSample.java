package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionSample 
{
	WebDriver driver;
  
	@BeforeClass
	public void setup()
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\AA\\workspace\\testng\\ab\\chromedriver.exe");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority = 1)
	public void findLogo()
	{
		WebElement logo= driver.findElement(By.xpath("//img[@alt='Facebook']"));
	//	Assert.assertTrue(logo.isDisplayed(),"logo not displayed");
		Assert.assertFalse(logo.isDisplayed(),"logo not displayed");
	}
	
	@Test(priority = 0)
	public void findPageTitle()
	{
		String s=driver.getTitle();
	//	Assert.assertEquals( s,"Facebook - log in or sign up","The title is not matched");
		Assert.assertEquals( s,"Facebook","The title is not matched");
	}
	
	@Test(priority = -1)
	void homePageLogin()
	{
		driver.findElement(By.id("email")).sendKeys("sibi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sibi@gmail.com");
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
