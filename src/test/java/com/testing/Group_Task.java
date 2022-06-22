package com.testing;

import org.testng.annotations.Test;

public class Group_Task {
	
	@Test(groups = "men")
	public void father() {
		System.out.println("Father");
	}
	
	@Test(groups = "men")
	public void brother() {
		System.out.println("Brother");
	}
	
	@Test(groups = "women")
	public void mother() {
		System.out.println("Mother");
	}
	
	@Test(groups = "women")
	public void sister() {
		System.out.println("Sister");
	}
	
	@Test(groups = "children")
	public void daughter() {
		System.out.println("Daughter");
	}
	
	@Test(groups = "children")
	public void son() {
		System.out.println("Son");
	}

}
