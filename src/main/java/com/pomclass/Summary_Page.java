package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Page {
    public WebDriver driver;
	
	@FindBy(xpath="//div[@id='center_column']")
	private WebElement summary;
	
	public Summary_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSummary() {
		return summary;
	}

	public WebElement getP2() {
		return p2;
	}

	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
	private WebElement p2;

	


	
}
