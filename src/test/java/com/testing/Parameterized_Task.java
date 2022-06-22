package com.testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Task {
	
	@Test
	@Parameters({"emp_name", "password"})
	public void emp_Details(String emp_name, String password) {
		
		System.out.println("emp_name:" + emp_name);
		System.out.println("password:" + password );
		
	}

}
