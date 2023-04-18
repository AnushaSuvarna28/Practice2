package DataProvider;
import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class JSONFile 
{
	@Test
	public void demo() throws IOException 
	{
		ObjectMapper omap = new ObjectMapper();
		DataDrivenTesting ddt = omap.readValue(new File("./test-output/ddt.json"),DataDrivenTesting.class);
	}
}
