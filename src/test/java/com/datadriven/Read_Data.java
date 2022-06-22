package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	public static void readAllData() throws IOException {
		
		File f= new File("C:\\Users\\kanna\\eclipse-workspace\\MavenProject\\detail.xlsx");
		FileInputStream fis= new FileInputStream(f);
		Workbook w= new XSSFWorkbook(fis);
		org.apache.poi.ss.usermodel.Sheet sheetAt= w.getSheetAt(0);
		
		int numberOfRows=sheetAt.getPhysicalNumberOfRows();
		for(int i=0; i<numberOfRows;i++) {
			Row row= sheetAt.getRow(i);
			int numberOfCells=row.getPhysicalNumberOfCells();
			for(int j=0;j<numberOfCells; j++) {
				Cell cell= row.getCell(j);
				CellType cellType= cell.getCellType();
				if(cellType.equals(CellType.STRING)) {
					String val=cell.getStringCellValue();
					System.out.println(val);
				}
				else if(cellType.equals(CellType.NUMERIC)) {
					double val=cell.getNumericCellValue();
					int num= (int) val;
					System.out.println(num);
				}
			}
			
		}	
		
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		readAllData();
		
	}

}
