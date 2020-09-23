package techproedenglish01.techproedenglish01api;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class Delete02 extends TestBaseDt{
	
	/*                                  WARM UP (10 minutes)
	1)Create class and name it as "Delete02"                      
	2)When 
	I send DELETE Request to http://dummy.restapiexample.com/api/v1/delete/719
	Then 
	Status code should be 200
	The value of "status" key in response body should be "success"  
	The value of "message" key in response body should be "Successfully! Record has been deleted"
	Note 1: Use hard assertion
	Note 2: After given() please use contentType(ContentType.JSON)
	*/
	
	@Test
	public void delete01() {
		//add path params to the base url
		spec04.pathParams(
						   "delParam", "delete", 
						   "id", 719
						  );
		//store expected data into a map
		Map<String, String> expectedMap = new HashMap<>();
		expectedMap.put("status", "success");
		expectedMap.put("message", "Successfully! Record has been deleted");
		
		//type the script to delete the data
		Response res = given().spec(spec04).when().delete("/{delParam}/{id}");
		res.prettyPrint();
		
		//make assertion for status code
		// 1st way for hard assertion
		res.then()
			.assertThat()
			.statusCode(200)
			.body(
					"status", equalTo(expectedMap.get("status")),
					"message", equalTo(expectedMap.get("message"))
				);
		//2.way for hard assertion by using assertEquals()
		Map<String, String> actualMap = res.as(HashMap.class);
				assertEquals(expectedMap.get("status"),actualMap.get("status"));
				assertEquals(expectedMap.get("message"),actualMap.get("message"));
	}

}
