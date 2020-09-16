package techproedenglish01.techproedenglish01api;

import org.junit.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class Delete01 extends TestBaseDt {
	
	/*
	 For DELETE Request we need just Endpoint like GET Request, we do not need Request Body
	*/
	
	@Test
	public void delete01() {
		//Get the data before deleting
		Response responseGet = given().spec(spec01).when().get("/198"); 
		responseGet.prettyPrint();
		
		//The data after deleting
		Response responseDel = given().spec(spec01).when().delete("/198");
		responseDel.prettyPrint();
	}

}
