package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {
	
	public WebDriver driver;

	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkBox;
	
	public Shipping_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getP3() {
		return p3;
	}

	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
	private WebElement p3; 

}
