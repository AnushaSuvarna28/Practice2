package AdminModule;

import org.testng.annotations.Test;

import genericUtility.EndPointsLibrary;
import genericUtility.SpecBuilderBaseClass;

import static io.restassured.RestAssured.*;

public class GetAllToursTest extends SpecBuilderBaseClass
{
	@Test
	public void getAllTours()
	{
		given().spec(reqs)
		.when().get(EndPointsLibrary.getAllTours)
		.then().spec(resp).assertThat().statusCode(200).log().all();
	}
}
