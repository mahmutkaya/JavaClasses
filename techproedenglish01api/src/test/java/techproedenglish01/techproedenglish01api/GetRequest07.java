package techproedenglish01.techproedenglish01api;

import org.junit.Test;
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
		Response res = given()
						.spec(spec01)
					   .when()
					   	.get("/123");
		res.prettyPrint();
	}

}
