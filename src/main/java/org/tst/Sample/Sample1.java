package org.tst.Sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample1 {
public static void main(String[] args) throws IOException {
	//file loc
	File Loc = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Sample\\src\\Excel\\Rajitha.xlsx");
	//con obj
	FileInputStream stream = new FileInputStream(Loc);
	//workbook
	Workbook w = new XSSFWorkbook(stream);
	//sheet
	Sheet s = w.getSheet("Rajitha");
	//no of rows
//	int count = s.getPhysicalNumberOfRows();
	//print the rows
//	for(int i=0;i<count;i++) {
//		Row r = s.getRow(i);
		
	
//	System.out.println(count);
	//row
//	Row r = s.getRow(1);
	//no of cells
//	int count1 = r.getPhysicalNumberOfCells();
//	System.out.println(count1);
	//to get all  cells in a row
//	for (int j=0;j<count1;j++) {
//		Cell c1 = r.getCell(j);
//		System.out.println(c1);
//	}
//	}
	//cell
//	Cell c = r.getCell(1);
//	System.out.println(c);
	for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
    	Row r = s.getRow(i);
    	for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
    		Cell c = r.getCell(j);
    		
    //1-text 0 - number
    int type = c.getCellType();
    if(type==1) {
    	String name1 = c.getStringCellValue();
    }
    
    if(type==0) {
    	double d = c.getNumericCellValue();
    long l =(long)d;
    String name1 = String.valueOf(l);
    }
    
    	
    	}
    }
}

	
}

