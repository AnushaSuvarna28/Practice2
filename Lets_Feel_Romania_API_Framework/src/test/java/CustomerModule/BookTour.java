package CustomerModule;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.EndPointsLibrary;
import genericUtility.SpecBuilderBaseClass;
import static io.restassured.RestAssured.*;

import java.io.IOException;

import pojoUtility.BookTourPage;

public class BookTour extends SpecBuilderBaseClass
{
	@Test
	public void bookTour() throws EncryptedDocumentException, IOException
	{
		String a[] = new String[3];
		for(int i=0;i<a.length;i++)
		{
			a[i] =  eu.readDataFromExcel("bookTour",i,0);
		}
		BookTourPage btp = new BookTourPage(a[0],a[1],a[2]);
		given().spec(reqs).body(btp).pathParam("tour_name",eu.readDataFromExcel("endPointsRelated",4,1))
		.when().post(EndPointsLibrary.bookTour)
		.then().spec(resp).assertThat().statusCode(201).log().all();
	}
}
