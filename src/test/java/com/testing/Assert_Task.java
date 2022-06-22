package com.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Task {

	@Test
	public void task() {
		String exp="santhosh";
		String act="kanna";
	    
	  Assert.assertEquals(act, exp);
	  System.out.println("validation");
	}
	
}
