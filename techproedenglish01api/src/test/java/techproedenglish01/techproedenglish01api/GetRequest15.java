package techproedenglish01.techproedenglish01api;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import io.restassured.response.Response;

public class GetRequest15 extends TestBaseDt {
	
	//GSON
	
	@Test
	public void get01() {
		Response res = given().spec(spec01).when().get();
//		res.prettyPrint();
		
		List<Map<Object,Object>> listOfMaps = res.as(ArrayList.class);
		System.out.println(listOfMaps);
	}

}
