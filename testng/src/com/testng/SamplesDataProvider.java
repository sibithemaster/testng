package com.testng;

import org.testng.annotations.DataProvider;

public class SamplesDataProvider {

	@DataProvider(name = "LoginData")
	public Object[][] loginDataProvider()
	{
		Object[][] dataValue= {{"abc@gmail.com","abc12345"},{"cde@gmail.com","cde12345"},{"xyz@gmail.com","xyz12345"}};
		return dataValue;
		
	}
}
