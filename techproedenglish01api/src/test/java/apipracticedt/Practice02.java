package apipracticedt;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import techproedenglish01.techproedenglish01api.TestBaseDt;

public class Practice02 extends TestBaseDt {
	/*
	When 
		I send a GET request to REST API URL 
		https://restful-booker.herokuapp.com/booking/1   
    Then 
	    HTTP Status Code should be 200
	    And Response format should be "application/JSON"
	    And first name should be "Sally"
	    And lastname should be "Smith"
	    And totalprice should be 705
	    And checkin date should be "2015-02-16"
	    And checkout date should be "2017-06-20"
	    
	    Note: For Base URL use spec02
	    Note: For actual data use JsonPath
        Note: For expected data use Map
        Note: Use Hard Assertion and Soft Assertion
*/

	@Test
	public void practice01() {
		// 1.set url
		spec02.pathParam("id", 1);

		// 2.set expected data
		JSONObject expectedData = new JSONObject();
		expectedData.put("statuscode", 200);
		expectedData.put("firstname", "Susan");
		expectedData.put("lastname", "Brown");
		expectedData.put("totalprice", 522);
		expectedData.put("checkin", "2016-10-04");
		expectedData.put("checkout", "2019-12-24");

		// 3.get actual data
		Response res = RestAssured.given().spec(spec02).when().get("/{id}");
		res.prettyPrint();

		// Assertion by using body()
		res.then().assertThat().
			statusCode(expectedData.getInt("statuscode")).
			contentType(ContentType.JSON).
			body(
				"firstname", equalTo(expectedData.getString("firstname")), 
				"lastname", equalTo(expectedData.getString("lastname")), 
				"totalprice", equalTo(expectedData.getInt("totalprice")),
				"bookingdates.checkin", equalTo(expectedData.getString("checkin")), 
				"bookingdates.checkout", equalTo(expectedData.getString("checkout"))
				);

		// Assertion by using assertEquals(), assertTrue(), assertFalse()

		// To get actual data from response body, you can use JsonPath
		JsonPath json = res.jsonPath();
		
		assertEquals(expectedData.getInt("statuscode"), res.getStatusCode());
		assertEquals(expectedData.getString("firstname"), json.getString("firstname"));
		assertEquals(expectedData.getString("lastname"), json.getString("lastname"));
		assertEquals(expectedData.getInt("totalprice"), json.getInt("totalprice"));
		assertEquals(expectedData.getString("checkin"), json.getString("bookingdates.checkin"));
		assertEquals(expectedData.getString("checkout"), json.getString("bookingdates.checkout"));

		// Use De-Serialization with GSON
		Map<String, Object> booking = res.as(HashMap.class);
		System.out.println(booking);
		
		assertEquals(expectedData.getInt("statuscode"), res.getStatusCode());
		assertEquals(expectedData.getString("firstname"), booking.get("firstname"));
		assertEquals(expectedData.getString("lastname"), booking.get("lastname"));
		assertEquals(expectedData.getInt("totalprice"), booking.get("totalprice"));
		assertTrue(booking.get("bookingdates").toString().contains(expectedData.getString("checkin")));
		assertTrue(booking.get("bookingdates").toString().contains(expectedData.getString("checkout")));
		
		/*
	      Note:
		  asString() is used to convert Response objects to String
		  toString() is used to convert Object objects to String
		*/
			
	  //Soft Assertion
			
			SoftAssert softAssert = new SoftAssert();
			
			//To get actual data from response body, you can use JsonPath
			softAssert.assertEquals(json.getString("firstname"), expectedData.getString("firstname"));
			softAssert.assertEquals(json.getString("lastname"), expectedData.getString("lastname"));
			softAssert.assertEquals(json.getInt("totalprice"), expectedData.getInt("totalprice"));
			softAssert.assertEquals(json.getString("bookingdates.checkin"), expectedData.getString("checkin"));
			softAssert.assertEquals(json.getString("bookingdates.checkout"), expectedData.getString("checkout"));

			//Use De-Serialization with ObjectMapper
			softAssert.assertEquals(booking.get("firstname"), expectedData.getString("firstname"));
			softAssert.assertEquals(booking.get("lastname"), expectedData.getString("lastname"));
			softAssert.assertEquals(booking.get("totalprice"), expectedData.getInt("totalprice"));
			softAssert.assertTrue(booking.get("bookingdates").toString().contains(expectedData.getString("checkin")));
			softAssert.assertTrue(booking.get("bookingdates").toString().contains(expectedData.getString("checkout")));
			
			softAssert.assertAll();
	}

}
