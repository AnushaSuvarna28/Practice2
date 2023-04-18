package com.section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDatatoExcelFile 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		sh.createRow(4).createCell(4).setCellValue("admin123");
		FileOutputStream fos = new FileOutputStream("./src/test/resources/testdata.xlsx");
		book.write(fos);
		System.out.println("Pass");
	}

}
