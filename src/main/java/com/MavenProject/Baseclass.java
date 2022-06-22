package com.MavenProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
      public static WebDriver driver;
      //browser launch
      public static WebDriver browserLaunch(String browsername){
	if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	else if(browsername.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	return driver;		
  }
      //get url
      
      public static void launchUrl(String url) {
		
    	  driver.get(url);
	}
     //get title
      public static void getTitle() {
		String title=driver.getTitle();
		System.out.println(title);
	}
      //close
      public static void closeBrowser() {
    	  driver.close();
	}
      //sendkeys
      public static void sendInput(WebElement element, String input) {
    	  element.sendKeys(input);
	}
      //click
      public static void clickOption(WebElement element) {
    	  element.click();	
	}
      //dropdown selectbyvalue
      public static void byValue(WebElement element,String value) {
          Select input=new Select(element);
          input.selectByValue(value);
	}
    //dropdown selectbyindex
      public static void byIndex(WebElement element, int value) {
    	  Select input=new Select(element);
          input.selectByIndex(value);
	}
    //dropdown selectbytext
      public static void byText(WebElement element, String value) {
    	  Select input=new Select(element);
          input.selectByVisibleText(value);
	}
     //Quit
      public static void quit() {
    	  driver.quit();
    } 
     //navigate to
      public static void navigateTo(String input) {
    	  driver.navigate().to(input);
      }
      //navigate back
      public static void navigateBack() {
    	  driver.navigate().back();
      }
      //navigate forward
      public static void navigateForward() {
    	  driver.navigate().forward();
      }
      //navigate refresh
      public static void navigateRefresh() {
    	  driver.navigate().refresh();
      }
      //click and hold
      public static void clickandHold(WebElement drag, WebElement drop) {
    	  Actions pro=new Actions(driver);
    	  pro.clickAndHold(drag).release(drop).build().perform();
	  }
      //drag and drop
      public static void dragandDrop(WebElement drag, WebElement drop) {
    	  Actions pro=new Actions(driver);
  		  pro.dragAndDrop(drag, drop).build().perform();
	  }  
      //move to element
      public static void movetoElement(WebElement element) {
    	  Actions pro=new Actions(driver);
    	  pro.moveToElement(element).build().perform();
	  }
      //context click
      public static void contextClick(WebElement element) {
    	  Actions pro=new Actions(driver);
    	  pro.contextClick(element).build().perform();
      }
      //Alert
      public static void alertOption() {
    	  Alert alert = driver.switchTo().alert();
  		  alert.accept();
      }
      //Alert prompt
      public static void alertPromt(String input) {
    	  Alert prompt = driver.switchTo().alert();
    	  prompt.sendKeys(input);
  		  prompt.accept();
      }
      //waits
      public static void waits() {
    	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  }
      //radio button
      public static void radioButton(WebElement element) {	 
          element.click();
	  }
      //is selected
      public static void isSelected(WebElement button1, WebElement button2) {
    	  if(button1.isSelected())
  	    {
  	    	System.out.println("the uncheck button is seletcted");
  	    }else if(button2.isSelected())
  	    {
  	    	System.out.println("the check button is unselected");
  	    }
	  }
      //check box
      public static void checkBox(WebElement element) {	 
          element.click();
	  }
      //scrolldown
      public static void scrollDown(WebElement element) {
  		  JavascriptExecutor js=(JavascriptExecutor)driver;
    	  js.executeScript("arguments[0].scrollIntoView()", element);
	  }
    //get current url
      public static void getCurrentUrl() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
    //get text
      public static void getText(WebElement element) {
		System.out.println(element.getText());
	} 
    //get attribute
      public static void getAttribute(WebElement element,String input) {
		System.out.println(element.getAttribute(input));
	}
    //get options
      public static void getOptions(Select input) {
          List<WebElement> op =input.getOptions();	
        	  System.out.println(op);
	}       
    //get first selected option
      public static void getFirstOption(Select input) {
		WebElement firstOption=input.getFirstSelectedOption();
		String text=firstOption.getText();
		System.out.println(text);
	} 
      //get all selected options
      public static void getAllOptions(Select input) {
          List<WebElement> op =input.getOptions();	
          for(int i=0;i<op.size();i++) {
        	  String options=op.get(i).getText();
        	  System.out.println(options);
          }
	}     
    //robot
      public static void robot() throws AWTException {
		Robot robo= new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
    //frame
     public static void frame(int value) {
		 driver.switchTo().frame(value);
	}
     //frame default
     public static void frameDefault() {
		 driver.switchTo().defaultContent();
	}
    //is displayed  
    public static void isDisplayed(WebElement element) {
         element.isDisplayed();
         System.out.println("isdisplayed");
	}  
    //screenshot
    public static void screenShot(String input ) throws IOException {
		TakesScreenshot img=(TakesScreenshot)driver;
        File sor=img.getScreenshotAs(OutputType.FILE);
        File des= new File(input);
        FileHandler.copy(sor,des);
	}
    //clear
    public static void clear(WebElement element) {
		element.clear();
	}
    
     
      
      
      
}