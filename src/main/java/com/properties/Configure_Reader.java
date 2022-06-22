package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configure_Reader {

	public static Properties p;

	public Configure_Reader() throws IOException {
		File f = new File("C:\\Users\\kanna\\eclipse-workspace\\MavenProject\\src\\main\\java\\com\\properties\\adactin.properties");
		FileInputStream fs = new FileInputStream(f);
		p = new Properties();
		p.load(fs);
	}

	public String getUrl() {

		String url = p.getProperty("url");
		return url;
	}

	public String getUserid() {
		String userid = p.getProperty("userid");
		return userid;
	}

	public String getPasword() {
		String password = p.getProperty("password");
		return password;
	}

	public String getQuantity() {
		String quantity = p.getProperty("quantity");
		return quantity;
	}

	public String getSize() {
		String size = p.getProperty("size");
		return size;
	}

	
	
	
	
	
	
	
	public String getScreenshot1() {
		String ss1 = p.getProperty("screenshot1");
		return ss1;
	}

	public String getScreenshot2() {
		String ss2 = p.getProperty("screenshot2");
		return ss2;
	}

	public String getScreenshot3() {
		String ss3 = p.getProperty("screenshot3");
		return ss3;
	}

}
