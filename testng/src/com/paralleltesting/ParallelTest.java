package com.paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest 
{

	WebDriver driver;

	
	@Test
	void logo()
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\git\\testng\\testng\\ab\\chromedriver.exe");
		driver=new ChromeDriver(co);
		driver.get("//https://www.orangehrm.com/");
		WebElement logo=driver.findElement(By.xpath("//img[@alt='OrangeHRM Logo'][1]"));
		Assert.assertTrue(logo.isDisplayed());
	}
	
	@Test
	void homePageTitle()
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\git\\testng\\testng\\ab\\chromedriver.exe");
		driver=new ChromeDriver(co);
		driver.get("//https://www.orangehrm.com/");
		String title=driver.getTitle();
		Assert.assertEquals(title,"OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM");
	}
	@AfterTest
	void close()
	{
		driver.quit();
	}
}

