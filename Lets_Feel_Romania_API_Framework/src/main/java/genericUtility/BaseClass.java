package genericUtility;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class BaseClass 
{
	public WebDriver driver;
	DatabaseUtility du = new DatabaseUtility();
	FileUtility fu = new FileUtility();
	WebDriverUtility wu = new WebDriverUtility();
	
	@BeforeSuite
	public void connectToDB() throws SQLException
	{
		du.connecToDB();
	}
	
	@AfterSuite
	public void disconnectFromDB() throws SQLException
	{
		du.closeDBConnection();
	}
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		String browser = fu.getDataFromPropertiesFile("browser");
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
	}
	@AfterClass
	public void closeBrowser()
	{
		wu.closeBrowser(driver);
	}
}
