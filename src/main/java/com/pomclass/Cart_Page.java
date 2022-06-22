package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement clear;
	
	public Cart_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClear() {
		return clear;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddcart() {
		return addcart;
	}

	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement quantity;
		
	@FindBy(xpath="//select[@id='group_1']")
	private WebElement size;
	
	@FindBy(name="Pink")
	private WebElement color;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement addcart;

}
