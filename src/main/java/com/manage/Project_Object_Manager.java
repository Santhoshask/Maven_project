package com.manage;

import org.openqa.selenium.WebDriver;

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

public class Project_Object_Manager {
	
	public WebDriver driver;
	
	private Login_Page lp;
	
	public Project_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}

	public Login_Page getInput() {
		if(lp==null) {
		lp=new Login_Page(driver);
		}
		return lp;
	}
	
	private Home_Signin hs;
	
	public Home_Signin signinPage() {
	     if(hs==null) {
		   hs= new Home_Signin(driver);
	     }
	     return hs;
	}
	
	private Dress_Page dp;
	
	public Dress_Page dressPage() {
		if(dp==null) {
			dp=new Dress_Page(driver);
		}
		return dp;
	}
	
    private Printed_Page pp;
	
	public Printed_Page printedPage() {
		if(pp==null) {
			pp=new Printed_Page(driver);
		}
		return pp;
	}
	
	private Cart_Page cp;
	
	public Cart_Page cartPage() {	
		if(cp==null) {
			cp=new Cart_Page(driver);
		}
		return cp;
	}
	
	private Checkoput_One co;
	
	public Checkoput_One checkOut() {
		if(co==null) {
			co=new Checkoput_One(driver);
		}
		return co;
	}
	
	private Summary_Page sp;
	
	public Summary_Page summaryPage() {
		if(sp==null) {
			sp=new Summary_Page(driver);
		}
		return sp;
	}
		
	private Address_Check ac;
	
	public Address_Check addressCheck() {
		if(ac==null) {
			ac=new Address_Check(driver);
		}
		return ac;
	}
	
	private Shipping_Page shp;
	
	public Shipping_Page shippingPage() {
		if(shp==null) {
			shp=new Shipping_Page(driver);
		}
		return shp;
	}
	
	private Payment_Page pay;
	
	public Payment_Page paymentPage() {
		if(pay==null) {
			pay=new Payment_Page(driver);
		}
		return pay;
	}
	
	private Confirm_Page cop;
	
	public Confirm_Page confirmPage() {
		if(cop==null) {
			cop=new Confirm_Page(driver);
		}
		return cop;
	}
	
	private Order_Placement orp;
	
	public Order_Placement orderPlace() {
		if(orp==null) {
			orp=new Order_Placement(driver);
		}
		return orp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
