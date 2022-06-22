package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver;

	@FindBy(xpath= "(//input[@type='text'])[3]")
	private WebElement userid;
	
	@FindBy(xpath= "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath= "//button[@id='SubmitLogin']")
	private WebElement signin;
	
	public Login_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserid() {
		return userid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin() {
		return signin;
	}

}
