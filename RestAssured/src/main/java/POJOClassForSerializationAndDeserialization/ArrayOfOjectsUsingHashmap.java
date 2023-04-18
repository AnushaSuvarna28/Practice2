package POJOClassForSerializationAndDeserialization;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.HashMap;

import org.testng.annotations.Test;

import com.sun.xml.bind.v2.runtime.Name;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ArrayOfOjectsUsingHashmap 
{
	@Test
	public void ser()
	{
		
		HashMap hmap = new HashMap();
		hmap.put("createdBy","Aush");
		hmap.put("projectName", "ah"+Math.random());
		hmap.put("status","Ongoin");
		hmap.put("teamSize",4);
		
		
		HashMap hmap1 = new HashMap();
		hmap1.put("createdBy","Anusha");
		hmap1.put("projectName", "ahc"+Math.random());
		hmap1.put("status","Ongoing");
		hmap1.put("teamSize",4);
		 Object []str= {hmap,hmap1};
		String arr = Arrays.toString(str);
		System.out.println(arr);
		try {
			System.out.println("fgghvvghghghghhghhghj");
			FileWriter fw=new FileWriter("./array.json");
			File file=new File("./array.json");
			System.out.println("hhhhhhhhhhhhhhhhhhh");
			fw.write(Arrays.toString(str));
			fw.flush();
			fw.close();
			System.out.println("hhhhhhhhhhhhhhhhhhh");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	//System.out.println(Arrays.toString(str));
	//System.out.println(str);
	baseURI = "http://rmgtestingserver";
	port = 8084;
	File file=new File("./array.json");
	given().body(file).contentType(ContentType.JSON)
	.when().post("/addProject")
	.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
	}
}
