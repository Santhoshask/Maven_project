package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Check {
	public WebDriver driver;
	
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[7]")
	private WebElement AdrsCheck;

	public Address_Check(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdrsCheck() {
		return AdrsCheck;
	}

}
