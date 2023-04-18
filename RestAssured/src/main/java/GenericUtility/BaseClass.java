package GenericUtility;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;
public class BaseClass 
{
	public WebDriver driver;
	public DatabaseLibrary dlib = new DatabaseLibrary();
	public JavaLibrary jlib = new JavaLibrary();
	public RestAssuredLibrary rlib = new RestAssuredLibrary();
	public WebDriverUtility wu = new WebDriverUtility();
	public ExcelUtility eu = new ExcelUtility();
	public RequestSpecification reqs;
	public ResponseSpecification resp;
	
	@BeforeSuite
	public void bsConfig() throws SQLException
	{
		dlib.connectToDb();
		//System.out.println("Connect to the database successfully");
//		baseURI = "http://rmgtestingserver";
//		port = 8084;
		reqs = new RequestSpecBuilder().setBaseUri("http://rmgtestingserver:8084")
				.setContentType(ContentType.JSON).build();
		resp = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
	}
	@AfterSuite
	public void asConfig() throws SQLException
	{
		dlib.closeConnectionToDb();
		//System.out.println("Disconnected from the database successfully");
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//System.out.println("Launched browser successfully");
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
		//System.out.println("Closed browser successfully");
	}
	@BeforeMethod
	public void loginApp()
	{
		driver.get(IConstants.appURL);
		LoginPage lp = new LoginPage(driver);
		lp.loginAplctn(IConstants.appUserName,IConstants.appPassword);
		//System.out.println("Login to application successfully");
	}
	@AfterMethod
	public void logoutApp()
	{
		HomePage hp = new HomePage(driver);
		hp.clickLogoutBN();
		//System.out.println("Logout from application successfully");
	}
}
