package com.section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo4 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("D:\\Anchu\\selenium\\testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet2");
		//String username = sh.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(username);
		//Double password = sh.getRow(1).getCell(0).getNumericCellValue();
		//System.out.println();.;;;
		DataFormatter format = new DataFormatter();
	    String value = 	format.formatCellValue(sh.getRow(1).getCell(0));
	    System.out.println(value);

	}
	

}
