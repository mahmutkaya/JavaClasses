package apipracticedt;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import techproedenglish01.techproedenglish01api.TestBaseDt;
import utilities.JsonUtils;

public class Practice01 extends TestBaseDt{
	/*
	When 
	I send a GET request to REST API URL 
	https://restful-booker.herokuapp.com/booking/1001   
	Then 
	HTTP Status Code should be 404
	And response body contains "Not Found"
	And response body does not contain "JavaApi" 
	And header "Server" should be "Cowboy"
	And header "Content-Type" should be "text/plain; charset=utf-8"
	And header "Via" should be "1.1 vegur"
	Note: For Base URL use spec02
	Note: Use Map for expected values
	Note: Use Hard Assertion and Soft Assertion
	*/
	
	@Test
	public void practice01() {
		// 1. set the URL
		spec02.pathParam("id", 1001);
		
		// 2. set expected data
		Map<String, String> expectedData = new HashMap<>();
		expectedData.put("trueText", "Not Found");
		expectedData.put("falseText", "JavaApi");
		expectedData.put("Server", "Cowboy");
		expectedData.put("Content-Type", "text/plain; charset=utf-8");
		expectedData.put("Via", "1.1 vegur");
		
		// 3. get actual data
		Response res = RestAssured.given().spec(spec02).when().get("/{id}");
		res.prettyPrint();
		
		// we can not use objectMapper or gson to convert response if res body is not json format
		// Map<String, String> actualData = JsonUtils.convertJsonToJava(res.asString(), HashMap.class);
		// System.out.println(actualData);
		
		// 4. make assertions - hard
		res.then().assertThat()
					.statusCode(404)
					.headers("Server", expectedData.get("Server"),
							"Content-Type", expectedData.get("Content-Type"),
							"Via", expectedData.get("Via"));
		
		Assert.assertTrue(res.asString().contains(expectedData.get("trueText")));
		Assert.assertFalse(res.asString().contains(expectedData.get("falseText")));
		
		// 5. make assertions - soft
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(res.getHeader("Server"), expectedData.get("Server"));
		soft.assertEquals(res.getHeader("Content-Type"), expectedData.get("Content-Type"));
		soft.assertEquals(res.getHeader("Via"), expectedData.get("Via"));
		
		soft.assertTrue(res.asString().contains(expectedData.get("trueText")));
		soft.assertFalse(res.asString().contains(expectedData.get("falseText")));
		
		soft.assertAll();
		

	}

}
