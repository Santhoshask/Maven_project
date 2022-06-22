package com.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Iretry_Task {
	
	@Test(retryAnalyzer = Rerun.class)
	public void username() {
		
		String exp="santhosh";
        String act="kanna";		
	    Assert.assertEquals(act, exp);
	
	}
	
	@Test
	public void password() {
		
		String exp="123456";
        String act="123456";		
	    Assert.assertEquals(act, exp);
		
	}
	

}
