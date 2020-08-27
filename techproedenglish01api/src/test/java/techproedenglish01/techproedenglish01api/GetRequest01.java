package techproedenglish01.techproedenglish01api;

import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetRequest01 {
	String uri = "https://restful-booker.herokuapp.com/booking";

	@Test
	public void getMethod01() {
		Response response = given().
							when().
								get(uri);
		response.prettyPrint();

		System.out.println(response.getStatusCode());
		
		response.
			then().
			assertThat().
			statusCode(200).
			contentType(ContentType.JSON);
	}
	@Test
	public void getMethod02() {
		Response res = given().
					   when().
					   	get(uri+"/3");
		
		res.prettyPrint();
		
		res.
			then().
			assertThat().
			statusCode(200).
			contentType(ContentType.JSON);
	}

}
