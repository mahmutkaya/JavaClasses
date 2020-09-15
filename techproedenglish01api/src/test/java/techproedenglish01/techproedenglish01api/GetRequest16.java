package techproedenglish01.techproedenglish01api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

public class GetRequest16 extends TestBaseDt{
	/*
	 * When I send GET Request to https://restful-booker.herokuapp.com/booking/3
	 * Then Status code is 200 And Content type is "application/json" And Status
	 * line is "HTTP/1.1 200 OK" And First name is Jim And Total price is 623 And
	 * Deposit paid is true And Checkin date is 2020-03-18
	 * 
	 * Use De-Serialization to convert Json response body to a Map. Then by using
	 * the map and soft-assertion make assertions.
	 */
	
	@Test
	public void get01() {
		spec02.pathParam("bookingId", 3);
		
		Response res = given().spec(spec02).when().get("/{bookingId}");
//		res.prettyPrint();
		res.then()
			.assertThat()
			.statusCode(200)
			.contentType(ContentType.JSON)
			.statusLine("HTTP/1.1 200 OK");
		
		HashMap<String, Object> resMap = res.as(HashMap.class);
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(resMap.get("firstname"), "Mary");
		soft.assertEquals(resMap.get("totalprice"), 615.0);
		soft.assertEquals(resMap.get("depositpaid"), false);
		soft.assertTrue(resMap.get("bookingdates").toString().contains("checkin=2017-01-15"));
		
		soft.assertAll();

		

	}

}
