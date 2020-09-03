package techproedenglish01.techproedenglish01api;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.response.Response;

public class GetRequest09 extends TestBaseDt{
	/*
	 * Among the data there should be someone whose first name is Jim
	 URL: https://restful-booker.herokuapp.com/booking
	 */

	@Test
	public void get01() {
		spec02.queryParams("firstname", "Jim",
							"totalprice", 2);
		Response res = given()
					.spec(spec02).when().get();
		res.prettyPrint();
		
		//Assert that the data whose first name is Jim exists among the data
				assertTrue(res.asString().contains("bookingid"));

	}
}
