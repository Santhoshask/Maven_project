package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Placement {
	
	public WebDriver driver;
	
	public Order_Placement(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPlacement() {
		return placement;
	}

	@FindBy(xpath="//div[@id='center_column']")
	private WebElement placement;

}
