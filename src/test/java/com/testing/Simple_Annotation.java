package com.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	@BeforeSuite
	public void propertySetting() {
		System.out.println("Porperty Setting");
	}
	
	@BeforeTest
	public void browserLaunch() {
		System.out.println("Browser Launch");
	}
	
	@BeforeClass
	public void urlLaunch() {
		System.out.println("Url Launch");
	}
	
	@BeforeMethod
	public void signIn() {
		System.out.println("Sign In");
	}
	
	@Test(priority = 0)
	public void women() {
		System.out.println("Women");
	}
	
	@Test(priority = -1)
	public void kids() {
		System.out.println("kids");
	}
	
	@Test(invocationCount = 3)
	public void men() {
		System.out.println("Men");
	}
	
	@AfterMethod
	public void signOut() {
		System.out.println("Sign Out");
	}
	
	@AfterClass
	public void homePage() {
		System.out.println("Home Page");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterSuite
	public void quitBrowser() {
		System.out.println("Quit Browser");
	}
	
	
	
	
	
	
	
	
	
}
