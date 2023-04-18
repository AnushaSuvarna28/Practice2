package GenericUtilities;
import java.io.IOException;
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
import org.testng.annotations.Test;

import POMUtility.HomePage;
import POMUtility.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	public FileUtility fu = new FileUtility();
	public DatabaseUtility du = new DatabaseUtility();
	@BeforeSuite
	public void connectToDB() throws SQLException
	{
		du.connectToDB();
	}
	@BeforeClass
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void loginAplctn() throws IOException
	{
		String url = fu.readDataFromProperties("url");
		String username = fu.readDataFromProperties("username");
		String password = fu.readDataFromProperties("password");
		driver.get(url);
		LoginPage lp = new LoginPage(driver);
		lp.loginToAplctn(username, password);
	}
	@AfterMethod
	public void logoutAplctn()
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLogoutBN();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	@AfterSuite
	public void disconnectFromDb() throws SQLException
	{
		du.disconnectToDB();
	}
}
