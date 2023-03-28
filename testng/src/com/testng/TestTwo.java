package com.testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTwo 
{

	
	@Test(priority = 2)
	public void showDetails()
	{
		System.out.println("This is show demethod");
	}
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("This is login method");
	}
	
	@Test(priority = 3)
	public void logout()
	{
		System.out.println("This is logout method");
	}

}
