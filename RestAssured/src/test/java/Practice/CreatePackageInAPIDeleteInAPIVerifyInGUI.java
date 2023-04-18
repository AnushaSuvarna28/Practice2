package Practice;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtility.JavaLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreatePackageInAPIDeleteInAPIVerifyInGUI 
{
	//pass
	JavaLibrary jlib = new JavaLibrary();
	String pname = "Namma_Kudla"+jlib.getRandomNumber();
	@Test
	public void create()
	{
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Anusha");
		jobj.put("projectName", pname);
		jobj.put("status", "Completed");
		jobj.put("teamSize", 3);
		
		Response res = given().body(jobj).contentType(ContentType.JSON)
		.when().post("/addProject");
		String actual = res.jsonPath().get("projectId");
		System.out.println(actual);
		
		//delete using api
		baseURI = "http://rmgtestingserver";
		port = 8084;
		when().delete("/projects/"+actual+"")
		.then().assertThat().statusCode(204).contentType(ContentType.JSON);
		
		//verify using gui
		WebDriver driver = new ChromeDriver();
		driver.get("http://rmgtestingserver:8084/welcome");	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra",Keys.TAB,"rmgy@9999",Keys.ENTER);
		driver.findElement(By.linkText("Projects")).click();
		List<WebElement> pids = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		//System.out.println(pids.size());
		boolean flag=false;
		for(WebElement pid:pids)
		{
			String projectid = pid.getText();
			if(actual.equalsIgnoreCase(projectid)) 
			{
			flag=true;
			break;
			}
		}
		Assert.assertFalse(flag);
		System.out.println("Project deleted successfully");
	}
}
