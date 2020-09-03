package techproedenglish01.techproedenglish01api;

import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class GetRequest10 extends TestBaseDt{
	/*
	 * * When I send a GET request to REST API URL
	 * https://restful-booker.herokuapp.com/booking/5
	 * Then HTTP Status Code should be 200
	 * And response content type is “application/JSON”
	 * And response body should be like;
	 * {"firstname": "Sally",
	 *   "lastname": "Ericsson",
	 *   "totalprice": 111,
	 *   "depositpaid": false,
	 *   "bookingdates": { "checkin": "2017-05-23",
	 *                     "checkout":"2019-07-02" }
	 * }
	 */
	@Test
	public void get01() {
		spec02.pathParam("bookingid", 5);
		
		Response res = given().spec(spec02).when().get("/{bookingid}");
		res.prettyPrint();
		
		res.then().assertThat()
				.statusCode(200)
				.contentType(ContentType.JSON);
		
		JsonPath json = res.jsonPath();
		System.out.println(json.getString("lastname"));
		System.out.println(json.getString("firstname"));
		System.out.println(json.getInt("totalprice"));
		System.out.println(json.getBoolean("depositpaid"));
		//print the checkin 
		System.out.println(json.getString("bookingdates.checkin"));
		System.out.println(json.getString( "additionalneeds"));
	}

}
