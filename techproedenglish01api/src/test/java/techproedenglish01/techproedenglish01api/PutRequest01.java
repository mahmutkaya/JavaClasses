package techproedenglish01.techproedenglish01api;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutRequest01 extends TestBaseDt {
	
	/*
			 For PUT Request(Full Update) we need;
			 1)Endpoint ==> Mandatory
			 2)Request Body ==> Mandatory
			 3)Authorization ==> It depends on the API
			 4)Headers ==> It depends on the API
	 */

	/*
		 When 
		   I send PUT Request to http://dummy.restapiexample.com/api/v1/update/2
		 Then 
		   Status code is 200
		   Content Type is "application/json"
		   "status" key has value "success"
		   "message" key has value "Successfully! Record has been updated."
		   
		 Note: Create Request Body in 3 different ways  
	*/
	
	@Test
	public void put01() {
		
		spec04.pathParams("function", "update",
				          "id", 2);
		
		//Use Map to create Request Body
		Map<String, String> reqBody = new HashMap<>();
		reqBody.put("name", "Selim Ceren");
		reqBody.put("salary", "8888888");
		reqBody.put("age", "87");
		
		Response response = given().spec(spec04).body(reqBody).when().put("/{function}/{id}");
		response.prettyPrint();
		
		//Hard assertion for all steps
		response.
			then().
			assertThat().
			statusCode(200).
			contentType(ContentType.JSON).
			body("status", Matchers.equalTo("success"),
				 "message", Matchers.equalTo("Successfully! Record has been updated."));
		
		//Soft Assertion together with De-Serialization
		HashMap<String, Object> map = response.as(HashMap.class);
		System.out.println(map);
		
		SoftAssert softAssert = new SoftAssert();

		softAssert.assertEquals(map.get("status"), "success");
		softAssert.assertEquals(map.get("message"),"Successfully! Record has been updated.");

		softAssert.assertAll();
		
	}

}

