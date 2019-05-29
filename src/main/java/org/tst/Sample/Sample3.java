package org.tst.Sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample3 {

public static void main(String[] args) throws IOException {
	File loc = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Sample\\src\\Excel\\Hello.xlsx");
Workbook w = new XSSFWorkbook();
Sheet s = w.createSheet("Test");
Row r = s.createRow(0);
Cell c = r.createCell(0);
c.setCellValue("Rajitha");
FileOutputStream o = new FileOutputStream(loc);
w.write(o);
System.out.println("Done");
}
}
