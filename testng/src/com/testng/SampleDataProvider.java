package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleDataProvider {

	@Test(dataProvider = "LoginData",dataProviderClass = SamplesDataProvider.class)
	public void login(String username,String password)
	{
		System.out.println("User value == > "+username+" "+password);
	}
	
//	@DataProvider(name = "LoginData")
//	public Object[][] loginDataProvider()
//	{
//		Object[][] dataValue= {{"roshini@gmail.com","rosh12345"},{"deepak@gmail.com","deepak12345"},{"sibi@gmail.com","sibi12345"}};
//		return dataValue;
//		
//	}

}
