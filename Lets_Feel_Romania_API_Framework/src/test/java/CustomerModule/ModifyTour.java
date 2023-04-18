package CustomerModule;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.EndPointsLibrary;
import genericUtility.SpecBuilderBaseClass;

import static io.restassured.RestAssured.*;

import java.io.IOException;

import pojoUtility.BookTourPage;

public class ModifyTour extends SpecBuilderBaseClass
{
	@Test
	public void modifyTour() throws EncryptedDocumentException, IOException
	{
		String a[] = new String[3];
		for(int i=0;i<a.length;i++)
		{
			a[i] =  eu.readDataFromExcel("updateTour",i,0);
		}
		BookTourPage btp = new BookTourPage(a[0],a[1],a[2]);
		given().spec(reqs).body(btp).pathParam("tour_id",eu.readDataFromExcel("endPointsRelated",3,1))
		.when().put(EndPointsLibrary.modifyTour)
		.then().spec(resp).assertThat().statusCode(200).log().all();
	}
}
