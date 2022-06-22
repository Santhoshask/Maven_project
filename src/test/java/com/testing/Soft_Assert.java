package com.testing;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
			
		@Test
		public void perform() {
			String exp="santhosh";
			String act="kanna";
		
			SoftAssert s=new SoftAssert();
			
			s.assertEquals(act, exp);
			System.out.println("Verification");
	}

}
