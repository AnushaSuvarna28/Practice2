package com.section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo2 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("D:\\Anchu\\selenium\\testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		Row row = sh.getRow(0);
		Cell cell = row.getCell(0);
		String value1 = cell.getStringCellValue();
		System.out.println(value1);
		Row row1 = sh.getRow(0);
		Cell cell1 = row1.getCell(0);
		String value11 = cell1.getStringCellValue();

	}

}
