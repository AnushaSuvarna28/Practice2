package CustomerModule;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.EndPointsLibrary;
import genericUtility.SpecBuilderBaseClass;

import static io.restassured.RestAssured.*;

import java.io.IOException;

public class CancelTour extends SpecBuilderBaseClass
{
	@Test
	public void cancelTour() throws EncryptedDocumentException, IOException
	{
		given().spec(reqs).pathParam("tour_id",eu.readDataFromExcel("endPointsRelated",2,1))
		.when().delete(EndPointsLibrary.cancelTour)
		.then().spec(resp).assertThat().statusCode(204).log().all();
	}
}
