package techproedenglish01.techproedenglish01api;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.junit.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetRequest12 extends TestBaseDt{
	/*
     * When I send GET Request to URL
     * http://dummy.restapiexample.com/api/v1/employees
     * Then
     * Status code is 200
     *  1)Print all ids greater than 10 on the console
     *  Assert that there are 14 ids greater than 10
     *  2)Print all ages less than 30 on the console
     *  Assert that maximum age is 23
     *  3)Print all employee names whose salaries are greater than 350000 
     *  Assert that Charde Marshall is one of the employees whose salary is greater than 350,000
     */
	
	@Test
	public void get01() {
		Response res = given().spec(spec03).when().get();
		res.prettyPrint();
		
		res.then()
			.assertThat()
			.statusCode(200);
		
		JsonPath json = res.jsonPath();
		
		List<String> idList = json.getList("data.findAll{Integer.valueOf(it.id)>10}.id"); // data.id
		System.out.println(idList);
		
	}

}
