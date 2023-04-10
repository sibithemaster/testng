package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestThree 
{

	@BeforeClass
    void fisrtClassCall()
    {
         System.out.println("This is first class calling test cases....");	
    }
	
	@BeforeMethod
	void firstMethod()
	{
		System.out.println("This is before method");
	}
	
	
	@Test
	void signup()
	{
		System.out.println("This is signup method");
	}
	
	@Test
	void signin()
	{
		System.out.println("This is signup method");
	}
	
	@Test
	void profile()
	{
		System.out.println("This is proile method");
	}
	
	@Test
	void logout()
	{
		System.out.println("This is logout method");
	}
	
	@AfterMethod
	void lastMethod()
	{
		System.out.println("This is after method");
	}
	
	
	@AfterClass
	void lastClassCall()
    {
         System.out.println("This is class close method....");	
    }
}
