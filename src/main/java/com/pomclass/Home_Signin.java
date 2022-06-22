package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Signin {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@rel='nofollow']")
	private WebElement signpage;

	public Home_Signin(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignpage() {
		return signpage;
	}

}
