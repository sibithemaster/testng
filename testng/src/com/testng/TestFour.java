package com.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFour 
{
	@BeforeSuite
    public void firstCall()
    {
    	System.out.println("Before suite method...");
    }
	
	@BeforeTest
	public void beforeRunningTestcase()
	{
		System.out.println("Before running test cases....");
	}
	
	@Test
	public void settings()
	{
		System.out.println("Setting system proprty");
	}
	
	@Test
	public void gettingUrl()
	{
		System.out.println("Getting the url");
	}
	
	
	@AfterTest
	public void afterRunningTestcase()
	{
		System.out.println("After running test cases....");
	}
	
	@AfterSuite
	public void lastCall()
    {
    	System.out.println("After  suite method...");
    }
}
