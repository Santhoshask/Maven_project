package com.properties;

import java.io.IOException;

public class File_Reader_Manager {

	private File_Reader_Manager() {
		
	}
	
	public static File_Reader_Manager getInstanceFRM() {
		File_Reader_Manager frm=new File_Reader_Manager();
		return frm;

	}
	

	public Configure_Reader getInstanceCR() throws IOException {
		Configure_Reader cr= new Configure_Reader(); 
       return cr;
	}
}
