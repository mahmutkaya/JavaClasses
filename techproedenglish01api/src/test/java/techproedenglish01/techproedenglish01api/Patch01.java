package techproedenglish01.techproedenglish01api;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Patch01 extends TestBaseDt {
	
	/*
		 For PATCH Request(Partial Update) you need;
		 1)Endpoint ==> Mandatory
		 2)Request Body ==> Mandatory
		 3)Authorization ==> It depends on the API
		 4)Header ==> It depends on the API
	 */
	
	/*
						 {
						    "userId": 10,
						    "id": 198,
						    "title": "quis eius est sint explicabo",
						    "completed": true
					     }
	 */
	
	@Test
	public void patch01() {
		
		spec01.pathParam("id", 3);
		
		Map<String, String> reqBody = new HashMap<>();
		reqBody.put("title", "mahmut");
		
		//Normally after running the code I should see Suleyman as title on the console.
		//But that API does not let us to update data. Because of that I just asserted 
		//status code and content type.
		Response response = given().spec(spec01).body(reqBody).when().patch("/{id}");
		response.prettyPrint();
		
		response.then().assertThat().statusCode(200).contentType(ContentType.JSON);

		
	}

}
