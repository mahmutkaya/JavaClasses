package techproedenglish01.techproedenglish01api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class GetRequest04 {
	/*
	 * How to get all headers data
	 * How to get a specific Header
	 * How to assert Headers
	 */
	
	@Test
	public void get01() {
		Response res = given().when().get("https://restful-booker.herokuapp.com/booking");
		res.prettyPrint();
		
		Headers headers = res.getHeaders();
		System.out.println("headers: "+headers);
		//assert if headers contain Etag
		System.out.println(headers.get("Etag"));
		assertNotEquals(headers.get("Etag"), null);
		//Assert that Via header has the value "1.1 vegur"
		System.out.println(headers.get("Via").getValue());
		assertEquals(headers.get("Via").getValue(),"1.1 vegur");
	}

}
