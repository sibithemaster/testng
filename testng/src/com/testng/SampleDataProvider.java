package com.testng;

import org.testng.annotations.Test;

public class SampleDataProvider {

	@Test(dataProvider = "LoginData",dataProviderClass = SamplesDataProvider.class)
	public void login(String username,String password)
	{
		System.out.println(username+" "+password);
	}
	

}
