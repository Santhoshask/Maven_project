package com.MavenProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.manage.Project_Object_Manager;
import com.pomclass.Address_Check;
import com.pomclass.Cart_Page;
import com.pomclass.Checkoput_One;
import com.pomclass.Confirm_Page;
import com.pomclass.Dress_Page;
import com.pomclass.Home_Signin;
import com.pomclass.Login_Page;
import com.pomclass.Order_Placement;
import com.pomclass.Payment_Page;
import com.pomclass.Printed_Page;
import com.pomclass.Shipping_Page;
import com.pomclass.Summary_Page;
import com.properties.File_Reader_Manager;

public class Runner extends Baseclass {
	
	public static WebDriver driver=browserLaunch("chrome");
	public static Project_Object_Manager pom=new Project_Object_Manager(driver);	
	public static void main(String[] args) throws IOException {		

		waits();
		String url=File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		launchUrl(url);

		clickOption(pom.signinPage().getSignpage());
		String userid=File_Reader_Manager.getInstanceFRM().getInstanceCR().getUserid();
		sendInput(pom.getInput().getUserid(), userid);
		String password=File_Reader_Manager.getInstanceFRM().getInstanceCR().getPasword();
		sendInput(pom.getInput().getPassword(),password);
     	clickOption(pom.getInput().getSignin());
     	
     	
     	clickOption(pom.dressPage().getDresses());
		clickOption(pom.dressPage().getEvedress());
		
		movetoElement(pom.printedPage().getColor());
		clickOption(pom.printedPage().getPickcolor());	
		
        clear(pom.cartPage().getClear());
        String quantity=File_Reader_Manager.getInstanceFRM().getInstanceCR().getQuantity();
        sendInput(pom.cartPage().getQuantity(),quantity);
        String size=File_Reader_Manager.getInstanceFRM().getInstanceCR().getSize();
        byValue(pom.cartPage().getSize(),size);
        clickOption(pom.cartPage().getColor());
        clickOption(pom.cartPage().getAddcart());
        
        clickOption(pom.checkOut().getP1());
        
        scrollDown(pom.summaryPage().getSummary());
        String screenshot1=File_Reader_Manager.getInstanceFRM().getInstanceCR().getScreenshot1();
        screenShot(screenshot1);
        clickOption(pom.summaryPage().getP2());
         
        clickOption(pom.addressCheck().getAdrsCheck());
        
        clickOption(pom.shippingPage().getCheckBox());
        clickOption(pom.shippingPage().getP3());
        
        scrollDown(pom.paymentPage().getPayment());
        String screenshot2=File_Reader_Manager.getInstanceFRM().getInstanceCR().getScreenshot2();
        screenShot(screenshot2);
        clickOption(pom.paymentPage().getCheque());
        
        clickOption(pom.confirmPage().getConfirm());
        
        scrollDown(pom.orderPlace().getPlacement());
        String screenshot3=File_Reader_Manager.getInstanceFRM().getInstanceCR().getScreenshot3();
        screenShot(screenshot3);

   }
}