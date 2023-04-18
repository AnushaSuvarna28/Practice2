package genericUtility;

import io.restassured.response.Response;

public class RestAssuredUtility 
{
	public String getJsonData(Response res, String path)
	{
		String data = res.jsonPath().get(path);
		return data;
	}
}
