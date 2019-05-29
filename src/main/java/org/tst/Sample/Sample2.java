package org.tst.Sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample2 {
	public static void main(String[] args) throws IOException {
		File Loc = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Sample\\src\\Excel\\Rajitha.xlsx");
		FileInputStream stream = new FileInputStream(Loc);
	    Workbook w = new XSSFWorkbook(stream);
	    Sheet s = w.getSheet("Rajitha");
	    //for update
	    Row r = s.getRow(1);
	    Cell c = r.getCell(0);
	    String name = c.getStringCellValue();
	    if(name.equals("Likhitha")){
	    	c.setCellValue("PrudviLikhitha");
	    }
	    
	    FileOutputStream o = new FileOutputStream(Loc);
	    //write in wk
	    w.write(o);
	    System.out.println("Done");
	//    for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
	 //   	Row r = s.getRow(i);
	//    	for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
//	    		Cell c = r.getCell(j);
	    		
	    //1-text 0 - number
	//    int type = c.getCellType();
	  //  if(type==1) {
	   // 	String name1 = c.getStringCellValue();
	   // 	System.out.println(name1);
	   // }
	   // 
	   // if(type==0) {
	    //	if(DateUtil.isCellDateFormatted(c)) {
	    //		Date d = c.getDateCellValue();
	    //		SimpleDateFormat s1 = new SimpleDateFormat("dd-MMM-yy");
	    	//	String name = s1.format(d);
	    	//	System.out.println(name);
	    //	}else {
	    	
	   // 	double d = c.getNumericCellValue();
	   // long l =(long)d;
	   // String name2 = String.valueOf(l);
	   // System.out.println(name2);
	    //}}
	    
	    	
	    	}
	    
	}


