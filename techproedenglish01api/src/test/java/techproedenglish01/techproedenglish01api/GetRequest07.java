package techproedenglish01.techproedenglish01api;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class GetRequest07 extends TestBaseDt{
	/**
	 * When I send a GET request to REST API URL
	 * https://jsonplaceholder.typicode.com/todos/123 
	 * Then HTTP Status Code should be 200 
	 * And "Server" in Headers should be "cloudflare" 
	 * And response content type is “application/JSON” 
	 * And "userId" should be 7, 
	 * And "title" should be "esse et quis iste est earum aut impedit" 
	 * And "completed" should be false
	 */
	
	@Test
	public void get01() {
		spec01.pathParam("id", 123);
		Response res = given()
						.spec(spec01)
					   .when()
					   	.get("/{id}");
		res.prettyPrint();
		
		res.then().assertThat()
			.statusCode(200)
			.header("Server", "cloudflare")
			.contentType(ContentType.JSON)
			.body("userId", equalTo(7),
					"title", equalTo("esse et quis iste est earum aut impedit"),
					"completed", equalTo(false)
					);
	}

}
