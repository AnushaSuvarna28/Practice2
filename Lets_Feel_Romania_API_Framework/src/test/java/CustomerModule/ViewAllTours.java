package CustomerModule;

import org.testng.annotations.Test;

import genericUtility.EndPointsLibrary;
import genericUtility.SpecBuilderBaseClass;
import static io.restassured.RestAssured.*;

public class ViewAllTours extends SpecBuilderBaseClass
{
	@Test
	public void viewAllTours()
	{
		given().spec(reqs)
		.when().get(EndPointsLibrary.viewAllTours)
		.then().spec(resp).assertThat().statusCode(200).log().all();
	}
}
