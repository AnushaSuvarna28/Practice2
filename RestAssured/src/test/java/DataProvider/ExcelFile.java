package DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelFile 
{
	@Test
	public void demo() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("D:\\ddt.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
				double teamSize = sh.getRow(i).getCell(3).getNumericCellValue();	
				if(teamSize>2)
				{
					String createdBy = sh.getRow(i).getCell(0).getStringCellValue();
					String pname =  sh.getRow(i).getCell(1).getStringCellValue();
					String status = sh.getRow(i).getCell(2).getStringCellValue();
					
					given().param("createdBy",createdBy)
					.param("pname",pname)
					.param("status",status)
					.teamSize("teamSize",teamSize)
					
					.when().post("/addProject")
			
					.then().log().all();
				}
		}
	}
}
