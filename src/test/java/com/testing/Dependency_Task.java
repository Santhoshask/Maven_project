package com.testing;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency_Task {
	
	@Test
	public void vegetables() {
		System.out.println("Vegetables");
	}
	
	@Test(dependsOnMethods = "vegetables")
	public void food() {
		System.out.println("Food");
	}

}
