package com.testing;

import org.testng.annotations.Test;

public class Expected_Expection {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void demo() {
		
		
		int a=20;
		 
		System.out.println(a/0);

	}

}
