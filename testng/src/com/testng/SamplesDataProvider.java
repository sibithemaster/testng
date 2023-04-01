package com.testng;

import org.testng.annotations.DataProvider;

public class SamplesDataProvider {

	@DataProvider(name = "LoginData")
	public Object[][] loginDataProvider()
	{
		Object[][] dataValue= {{"roshini@gmail.com","rosh12345"},{"deepak@gmail.com","deepak12345"},{"sibi@gmail.com","sibi12345"}};
		return dataValue;
		
	}
}
