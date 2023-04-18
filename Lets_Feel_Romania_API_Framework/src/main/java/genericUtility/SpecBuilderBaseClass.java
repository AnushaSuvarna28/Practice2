package genericUtility;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilderBaseClass 
{
	public ExcelUtility eu = new ExcelUtility();
	public FileUtility fu = new FileUtility();
	public WebDriverUtility wu = new WebDriverUtility();
	public RequestSpecification reqs;
	public ResponseSpecification resp;
	@BeforeSuite
	public void createSpecBuilder() throws IOException
	{
		 reqs = new RequestSpecBuilder().setBaseUri(fu.getDataFromPropertiesFile("baseURI")).setContentType(ContentType.JSON).build();
		 resp = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
	}
}
