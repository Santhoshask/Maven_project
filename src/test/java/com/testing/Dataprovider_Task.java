package com.testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Task {
	
	
	@Test(dataProvider = "input")
	public void data(String username, String password) {
		System.out.println("username:" + username);
		System.out.println("password:" + password);
		
	}
    @DataProvider
	public Object[][] input() {
		return new Object[][] {
			{"santhosh", "1234"},
			{"kanna", "5678"},
			{"worth", "9123"}			
		};
		
	}
	
}
