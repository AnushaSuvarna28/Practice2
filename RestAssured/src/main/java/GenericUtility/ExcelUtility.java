package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	public String readDataFromExcel(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("path of file");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetname);
		DataFormatter format = new DataFormatter();
		String value = format.formatCellValue(sh.getRow(rownum).getCell(cellnum));
		return value;
	}
	
	public void writeDataToExcel(String sheetname,int rownum,int cellnum,String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("path of file");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetname);
		sh.createRow(rownum).createCell(cellnum).setCellValue(value);
		FileOutputStream fos = new FileOutputStream("path of file");
		book.write(fos);
	}
	
	public int getLastRowNum(String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("path of the file");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetname);
		int lastrow = sh.getLastRowNum();
		return lastrow;
	}
	
	public String[][] getMultipleDataFromExcel(String sh,String exp) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("D:\\ddt.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sht = book.getSheet("Sheet1");
		DataFormatter format = new DataFormatter();
		int lastrow = sht.getLastRowNum();
		int lastcell = sht.getRow(0).getLastCellNum();
		int count =0;
		for(int i=1;i<=lastrow;i++)
		{
			Row r = sht.getRow(i);
			String v = format.formatCellValue(r.getCell(2));
			if(v.equals(exp))
				count++;
			}
		int k=0;
		String[][] str=new String[count][lastcell];
		for(int i=1;i<=lastrow;i++)
		{
			Row r = sht.getRow(i);
			String v = format.formatCellValue(r.getCell(2));
			if(v.equals("Completed"))
			{
				for(int j=0;j<lastcell;j++)
				{
					String value = format.formatCellValue(r.getCell(j));
					str[k][j] = value;
				}
				k++;
			}
		}
		return str;
		
		
	}
}

