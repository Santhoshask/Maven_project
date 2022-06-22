package com.testing;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Task {
	
	@Ignore
	@Test
	public void women() {
		System.out.println("Women");
	}
	
	@Test
	public void kids() {
		System.out.println("kids");
	}
	
	@Test(enabled = false)
	public void men() {
		System.out.println("Men");
	}
	
	@Test
	public void parent() {
		System.out.println("Parent");
	}
	
	@Test
	public void brother() {
		System.out.println("Brother");
	}
	

}
