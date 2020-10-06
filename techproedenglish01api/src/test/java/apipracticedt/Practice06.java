package apipracticedt;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import techproedenglish01.techproedenglish01api.TestBaseDt;

public class Practice06 extends TestBaseDt {
	/*
	1)Create base url in TestBase Class for "http://api.agromonitoring.com"
	2)Set the URL to "http://api.agromonitoring.com/agro/1.0/polygons?appid=2cb6803f295233aa579843d9e45599f2"
	by using pathParams() and queryParams() methods
	3)Request Body is: {
	"name":"Polygon Sample",
	"geo_json":{
	"type":"Feature",
	"properties":{},
	"geometry":{
	"type":"Polygon",
	"coordinates":[
	[
	[-121.1958,37.6683],
	[-121.1779,37.6687],
	[-121.1773,37.6792],
	[-121.1958,37.6792],
	[-121.1958,37.6683]
	]
	]
	}
	}
	}
	4)Create POST Request to "http://api.agromonitoring.com/agro/1.0/polygons?appid=2cb6803f295233aa579843d9e45599f2"
	Print the response body on the console
	5)Assert Status Code (201) and Response Body details by using body() method  
	6)Assert Response Body details by using Soft Assert                   
	*/
	
	@Test
	public void postPractice() {
		//set the endpoint
		spec06.pathParams("agro", "agro",
							"id", 1.0,
							"polygons", "polygons")
				.queryParam("appid", "2cb6803f295233aa579843d9e45599f2");
		
		//create request body
		float coordinates[][][] = { { 
									 {-121.1958f,37.6683f},
									 {-121.1779f,37.6687f},
									 {-121.1773f,37.6792f},
									 {-121.1958f,37.6792f},
									 {-121.1958f,37.6683f}
									} };
		
		Map<String, Object> geometry = new HashMap<>();
		geometry.put("type", "Polygon");
		geometry.put("coordinates", coordinates);
		
		Map<String, String> properties = new HashMap<>();
		
		Map<String, Object> geo_json = new HashMap<>();
		geo_json.put("type", "Feature");
		geo_json.put("properties", properties);
		geo_json.put("geometry", geometry);
		
		Map<String, Object> reqBody = new HashMap<>();
		reqBody.put("name", "Polygon Sample");
		reqBody.put("geo_json", geo_json);
		
		//send post request
		Response res = RestAssured.given()
					.contentType(ContentType.JSON)
					.spec(spec06)
					.body(reqBody)
					.when()
					.post("/{agro}/{id}/{polygons}");
		res.prettyPrint();
		
		//hard assertion with body
		String actCrd = "geo_json.geometry.coordinates";
		res.then().assertThat()
				.statusCode(201)
				.contentType(ContentType.JSON)
				.body(actCrd+"[0][0][0]", Matchers.equalTo(coordinates[0][0][0]));
	}

}
