package com.section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LastRowAndCell
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("D:\\Anchu\\selenium\\testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
        int lastrow = sh.getLastRowNum();
        System.out.println("Last row number is "+lastrow);
        int cellnum =sh.getRow(0).getLastCellNum();
        System.out.println("Last cell number is "+cellnum);
        
	}

}
