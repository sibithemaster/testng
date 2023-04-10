package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne 
{
    
	@Test
	public void setup(){
		System.out.println("This is setup method");
		Assert.fail();
	}
	@Test
	public void login(){
		System.out.println("This is login method");
	}
	@Test
	public void close(){
		System.out.println("This is close method");
	}
	
	
}
