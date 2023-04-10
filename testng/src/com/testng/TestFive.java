package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFive 
{

	@Test
	public void government()
	{
		System.out.println("This is government method...");
	}
	
	@Test(dependsOnMethods ="government")
	public void road() 
	{
		System.out.println("This is road method");	
	
	}

	@Test(dependsOnMethods ="road")
	public void car()
	{
		System.out.println("This is car method...");
	    Assert.fail();
	}

	@Test(dependsOnMethods ={"car","road"},alwaysRun = true)
	public void customer()
	{
		System.out.println("This is customer method");
	}



}
