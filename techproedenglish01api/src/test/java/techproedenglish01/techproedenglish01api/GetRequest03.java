package techproedenglish01.techproedenglish01api;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.response.Response;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class GetRequest03 {
	/*
	 * 1) Create a class and name it as GetRequest03 
	 * 2) When I send a GET Request to
	 * https://restful-booker.herokuapp.com/booking/5 
	 * Then HTTP Status code should be "200" 
	 * And Content type should be in "JSON" format 
	 * And Status Line should be "HTTP/1.1 200 OK" 
	 * And response body does not contain "Not Found" 
	 * And response body contains "bookingdates"
	 */
	
	@Test
	public void getReq() {
		Response res = given().
					when().
					get("https://restful-booker.herokuapp.com/booking/5");
		res.prettyPrint();
		
		res.then().assertThat().
				statusCode(200).
				contentType(ContentType.JSON)
				.statusLine("HTTP/1.1 200 OK");
		//response body does not contain "Not Found"
		assertFalse(res.asString().contains("Not Found"));
		//response body contains "bookingdates"
		assertTrue(res.asString().contains("bookingdates"));
		
				
	}

}
