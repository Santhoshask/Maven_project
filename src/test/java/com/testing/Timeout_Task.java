package com.testing;

import org.testng.annotations.Test;

public class Timeout_Task {

	@Test(timeOut = 1000)
	public void login() throws InterruptedException {
		
		System.out.println("12345");
		Thread.sleep(1000);
		
		System.out.println("Testing software");
		Thread.sleep(1000);
		
		System.out.println("987456");
		Thread.sleep(1000);
	}
		
}
