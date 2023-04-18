package AdminModule;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.EndPointsLibrary;
import genericUtility.SpecBuilderBaseClass;
import io.restassured.specification.RequestSpecification;
import pojoUtility.CreateTourPage;

import static io.restassured.RestAssured.*;

import java.io.IOException;

public class CreateTourTest extends SpecBuilderBaseClass
{
	@Test
	public void createTour() throws EncryptedDocumentException, IOException
	{
		String a[] = new String[6];
		for(int i=0;i<a.length;i++)
		{
			a[i] =  eu.readDataFromExcel("projectCreation",i,1);
			System.out.println(a[i]);
		}
		CreateTourPage ctp = new CreateTourPage(a[0],a[1],a[2],a[3],a[4],a[5]);
		given().spec(reqs).body(ctp)
		.when().post(EndPointsLibrary.createTour)
		.then().spec(resp).assertThat().statusCode(201).log().all();
	}
}

