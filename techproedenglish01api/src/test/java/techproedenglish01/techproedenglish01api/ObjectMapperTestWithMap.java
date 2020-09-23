package techproedenglish01.techproedenglish01api;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import utilities.JsonUtils;

public class ObjectMapperTestWithMap extends TestBaseDt{
	
	@Test
	public void javaToJson() {
		
		// 1. Serialization: convert java to json
		Map<Integer, String> map = new HashMap<>();
		map.put(101,  "Mark");
		map.put(102,  "Angie");
		map.put(103,  "Alexandre");
		map.put(104,  "Ted");
		
		System.out.println(map);
		
		String jsonFromMap = JsonUtils.convertJavaToJson(map);
		System.out.println(jsonFromMap);
		
		//let's convert jsonFromMap to java object(map) again
		Map<Integer, String> mapFromJson = JsonUtils.convertJsonToJava(jsonFromMap, HashMap.class);
		System.out.println(mapFromJson);
		
	}
	
	@Test
	public void jsonFromApiToJava() {
		
		//use get method with spec01
		//add path param "1" to spec01
		//after getting Json response body convert it to a map
		
		spec01.pathParam("id", 1);
		
		Response res = given().spec(spec01).when().get("/{id}");
		res.prettyPrint();
		
		Map<String, Object> mapFromJsonApi = JsonUtils.convertJsonToJava(res.asString(), HashMap.class);
		System.out.println(mapFromJsonApi);
		
		Map<String, Object> expectedValues = new HashMap<>();
		expectedValues.put("userId", 1);
		expectedValues.put("id", 1);
		expectedValues.put("title", "delectus aut autem");
		expectedValues.put("completed", false);
		
		res.then().assertThat().statusCode(200);
		
		Assert.assertEquals(expectedValues.get("userId"), mapFromJsonApi.get("userId"));
		Assert.assertEquals(expectedValues.get("id"), mapFromJsonApi.get("id"));
		Assert.assertEquals(expectedValues.get("title"), mapFromJsonApi.get("title"));
		Assert.assertEquals(expectedValues.get("completed"), mapFromJsonApi.get("completed"));
		
	}

}
