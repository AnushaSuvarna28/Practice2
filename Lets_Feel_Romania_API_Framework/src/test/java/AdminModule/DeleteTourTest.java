package AdminModule;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.EndPointsLibrary;
import genericUtility.SpecBuilderBaseClass;

import static io.restassured.RestAssured.*;

import java.io.IOException;

public class DeleteTourTest extends SpecBuilderBaseClass
{
	@Test 
	public void deleteTour() throws EncryptedDocumentException, IOException
	{
		given().spec(reqs).pathParam("tour_id",eu.readDataFromExcel("endPointsRelated",0,1))
		.when().delete(EndPointsLibrary.deleteTour)
		.then().spec(resp).assertThat().statusCode(204).log().all();
	}
}
