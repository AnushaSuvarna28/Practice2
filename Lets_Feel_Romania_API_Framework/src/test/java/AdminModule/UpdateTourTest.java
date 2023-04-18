package AdminModule;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.EndPointsLibrary;
import genericUtility.SpecBuilderBaseClass;

import static io.restassured.RestAssured.*;
import pojoUtility.CreateTourPage;

public class UpdateTourTest extends SpecBuilderBaseClass
{
	@Test
	public void updateTour() throws EncryptedDocumentException, IOException
	{
		String a[] = new String[6];
		for(int i=0;i<a.length;i++)
		{
			a[i] =  eu.readDataFromExcel("projectUpdation",i,1);
			System.out.println(a[i]);
		}
	CreateTourPage ctp = new CreateTourPage(a[0],a[1],a[2],a[3],a[4],a[5]);
	given().spec(reqs).body(ctp).pathParam("tour_id",eu.readDataFromExcel("endPointsRelated",1,1))
	.when().put(EndPointsLibrary.updateTour)
	.then().spec(resp).assertThat().statusCode(200).log().all();
	}
}
