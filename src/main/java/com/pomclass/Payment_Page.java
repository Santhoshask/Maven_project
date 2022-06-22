package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {
 
	public WebDriver driver;
	
	@FindBy(xpath="//div[@id='center_column']")
	private WebElement payment;
	
	public Payment_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getCheque() {
		return cheque;
	}

	@FindBy(xpath="//a[@class='cheque']")
	private WebElement cheque;
}
