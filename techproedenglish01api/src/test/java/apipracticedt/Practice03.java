package apipracticedt;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import techproedenglish01.techproedenglish01api.TestBaseDt;

public class Practice03 extends TestBaseDt{
	/*
	When 
	I send a GET request to REST API URL 
	http://dummy.restapiexample.com/api/v1/employee/3  
	Then 
	HTTP Status Code should be 200
	And Response format should be "application/json"
	And "employee_name" should be "Ashton Cox"
	And "employee_salary" should be 86000
	And "employee_age" should be 66
	Note: For Base URL use spec04
	Note: For actual data use JsonPath
	Note: For expected data use JSONObject
	Note: Use Hard Assertion and Soft Assertion
	*/
	
	@Test
	public void practice() {
		spec04.pathParams("employee", "employee",
						  "id", 3);
		
		Response res = RestAssured.given().spec(spec04).when().get("/{employee}/{id}");
		res.prettyPrint();
	}

}
