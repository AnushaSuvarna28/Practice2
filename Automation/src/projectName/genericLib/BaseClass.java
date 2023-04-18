package projectName.genericLib;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import projectName.elementRepository.LoginLocators;
import projectName.elementRepository.LogoutLocators;

public class BaseClass 
{
	public WebDriver driver;
	public static WebDriver listnerDriver;
	public DataUtility du = new DataUtility();
	/*@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void launchBrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
				System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
		}
		else if (browser.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver","D:\\Anchu\\selenium\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}*/
	@BeforeClass(alwaysRun = true)
	public void launchBrowser()
	{
				System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				listnerDriver = driver;
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();
	}
	@BeforeMethod(alwaysRun = true)
	public void login() throws EncryptedDocumentException, IOException
	{
				driver.get(du.getDataFromPropertiesFile("url"));
				/*driver.findElement(By.id("username")).sendKeys(du.getDataFromPropertiesFile("username"));
				driver.findElement(By.name("pwd")).sendKeys(du.getDataFromPropertiesFile("password"));
				driver.findElement(By.id("keepLoggedInLabel")).click();
				driver.findElement(By.id("loginButton")).click();*/
				LoginLocators ll = new LoginLocators(driver);
				ll.loginApp(du.getDataFromPropertiesFile("username"), du.getDataFromPropertiesFile("password"));
	}
	@AfterMethod(alwaysRun = true)
	public void logout()
	{
				//driver.findElement(By.id("logoutLink")).click();
		        LogoutLocators ll = new LogoutLocators(driver);
		        ll.logoutApp();
	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
				driver.close();
	}

}
