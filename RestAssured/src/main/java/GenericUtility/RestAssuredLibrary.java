package GenericUtility;

import static io.restassured.response.Response.*;

import java.util.List;

import org.testng.Assert;

import io.restassured.response.Response;

public class RestAssuredLibrary 
{
	/*
	 * Consists of methods of Restassured
	 * @author Anusha
	 */
	public String getJsonData(Response response,String path)
	{
		String jsonData = response.jsonPath().get(path);
		return jsonData;
	}
	
	public void getJsonDatas(Response response,String path,String expData)
	{
		boolean flag = true;
		List<String> jsonDatas = response.jsonPath().get(path);
		for(String p:jsonDatas)
		{
			try
			{
			if(p.equalsIgnoreCase(expData))
			{
				flag = true;
			}
			}
			catch(Exception e)
			{
				
			}
		}
		Assert.assertTrue(flag);
		System.out.println("Project verified in API successfully");
	}
}
