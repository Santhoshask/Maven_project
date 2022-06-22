package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Printed_Page {
	
	public WebDriver driver;

	@FindBy(xpath="//div[@class='product-container']")
	private WebElement color;
	
	@FindBy(xpath="//a[@class='color_pick']")
	private WebElement pickcolor;
	
	public Printed_Page(WebDriver driver2) {
        this.driver=driver2;
        PageFactory.initElements(driver, this);
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getPickcolor() {
		return pickcolor;
	}

	
}
