package GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	public void readDataFromExcel(String sh,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(IPathConstant.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sht = book.getSheet(sh);
		DataFormatter format = new DataFormatter();
		String value = format.formatCellValue(sht.getRow(rownum).getCell(cellnum));
	}
	
	public void writeDataToExcel(String sh,int rownum,int cellnum,String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(IPathConstant.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sht = book.getSheet(sh);
		sht.createRow(rownum).createCell(cellnum).setCellValue(value);
		FileOutputStream fout = new FileOutputStream(IPathConstant.excelPath);
		book.write(fout);
	}
	
	public String[][] readMultipleDataFromExcel(String sh) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(IPathConstant.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sht = book.getSheet(sh);
		int lastrow = sht.getLastRowNum();
		int lastcell = sht.getRow(0).getLastCellNum();
		String a[][] = new String[lastrow+1][lastcell];
		DataFormatter format = new DataFormatter();
		for(int i=0;i<=lastrow;i++)
		{
			for(int j=0;j<lastcell;j++)
			{
				a[i][j] = format.formatCellValue(sht.getRow(i).getCell(j));
			}
		}
		return a;
	}
}
