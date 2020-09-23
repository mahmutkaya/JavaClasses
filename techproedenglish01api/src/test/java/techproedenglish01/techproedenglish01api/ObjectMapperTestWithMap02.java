package techproedenglish01.techproedenglish01api;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import utilities.JsonUtils;

public class ObjectMapperTestWithMap02 extends TestBaseDt{
	/*
	When 
	I send a GET request to REST API URL
	https://restful-booker.herokuapp.com/booking/5 
	Then 
	HTTP Status Code should be 200
	And response content type is “application/JSON” 
	And response body should be like; 
	{ "firstname": "Sally", 
	"lastname": "Ericsson", 
	"totalprice": 111,
	"depositpaid": false, 
	"bookingdates": { "checkin": "2017-05-23", 
						"checkout":"2019-07-02" }
	}
	*/
	
	@Test
	public void jsonFromApiToJava() {
		//1.Set the url
		spec02.pathParam("id", 5);
		
		//2.put the expected values into java object(map)
		Map<String, Object> expectedMap = new HashMap<>();
		expectedMap.put("firstname", "ihsan Bugra");
		expectedMap.put("lastname", "MFY");
		expectedMap.put("totalprice", 317);
		expectedMap.put("depositpaid", true);
//		expectedMap.put("bookingdates", "{ \"checkin\": \"2017-05-23\",\"checkout\":\"2019-07-02\" }");
		expectedMap.put("checkin", "2016-09-16");
		expectedMap.put("checkout", "2019-04-23");
		
		Response res = RestAssured.given().spec(spec02).when().get("/{id}");
		res.prettyPrint();
		
		//get the actual data as a map
		// Map<String, Object> actualMap = res.as(HashMap.class);
		Map<String, Object> actualMap = JsonUtils.convertJsonToJava(res.asString(), HashMap.class);
		System.out.println(actualMap);
		
		//make assertions - hard
		res.then().assertThat().statusCode(200).contentType(ContentType.JSON);
		
		Assert.assertEquals(expectedMap.get("firstname"), actualMap.get("firstname"));
		Assert.assertEquals(expectedMap.get("lastname"), actualMap.get("lastname"));
		Assert.assertEquals(expectedMap.get("totalprice"), actualMap.get("totalprice"));
		Assert.assertTrue(actualMap.get("bookingdates").toString().contains(expectedMap.get("checkin").toString()));
		Assert.assertTrue(actualMap.get("bookingdates").toString().contains(expectedMap.get("checkout").toString()));
		
		//make assertions - soft
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actualMap.get("firstname"), expectedMap.get("firstname"));
		soft.assertEquals(actualMap.get("lastname"), expectedMap.get("lastname"));
		soft.assertEquals(actualMap.get("totalprice"), expectedMap.get("totalprice"));
		soft.assertTrue(actualMap.get("bookingdates").toString().contains(expectedMap.get("checkin").toString()));
		soft.assertTrue(actualMap.get("bookingdates").toString().contains(expectedMap.get("checkout").toString()));
		
		
		soft.assertAll();
		
		/*
		1) ObjectMapper Class is used for Serialization(Java -> Json) and De-Serialization(Json -> Java)
		2) ObjectMapper does the same with GSON.
		3) I created a class in "utilities" package, its name is JsonUtil then I created 2 methods in the class.
		First one is for serialization and scond one is for de-serialization.
		In the first method, to convert Java Object to Json I used writeValueAsString() method. 
		In the scond method, to convert Json data to Java object I used readValue() method.
		I made the second method "generic" because I want my method to return different Java Objects.
		I made the methods static, so I am able to access them just by using class name which is JsonUtil.
		*/
		
	}

}
