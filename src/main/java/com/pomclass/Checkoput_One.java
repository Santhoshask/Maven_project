package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoput_One {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[2]")
	private WebElement p1;

	public Checkoput_One(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getP1() {
		return p1;
	}

}
