package projectName.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility 
{

	public String getDataFromPropertiesFile(String key) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Anchu\\selenium\\commondata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
	public String getDataFromExcelsheet(String sheet,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Anchu\\selenium\\testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheet);
		DataFormatter format = new DataFormatter();
		String value = format.formatCellValue(sh.getRow(rownum).getCell(cellnum));
		return value;
	}

}
