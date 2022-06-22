package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Page {
	
	public WebDriver driver;

	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement Dresses;
	
	@FindBy(xpath="(//a[@class='subcategory-name'])[2]")
	private WebElement Evedress;
	
	public Dress_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDresses() {
		return Dresses;
	}

	public WebElement getEvedress() {
		return Evedress;
	}

}
