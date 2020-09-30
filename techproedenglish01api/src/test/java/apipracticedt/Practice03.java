package apipracticedt;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import techproedenglish01.techproedenglish01api.Data;
import techproedenglish01.techproedenglish01api.PojoPractice03;
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
	Note: For expected data use Pojo
	Note: Use Hard Assertion and Soft Assertion
	*/
	
	@Test
	public void getPractice() {
		//1st Step: Set endpoint by using pathParam() or queryParam()
		spec04.pathParams("employee", "employee",
						  "id", 3);
		
		//2nd  Step: Store expected data by using POJO
		Data data = new Data(3, "Ashton Cox", 86000, 66, "");
		PojoPractice03 expectedData = new PojoPractice03("success", data, "Successfully! Record has been fetched.");
		
		//3rd Step: Send GET Request to the end point
		Response res = RestAssured.given().contentType(ContentType.JSON).spec(spec04).when().get("/{employee}/{id}");
		res.prettyPrint();
		
		//4rd Step: make assertions - hard
		res.then().assertThat()
				.statusCode(200)
				.contentType(ContentType.JSON)
				.body("data.employee_name", equalTo(data.getEmployeeName()),
						"data.employee_salary", equalTo(data.getEmployeeSalary()),
						"data.employee_age", equalTo(data.getEmployeeAge())
						);
		//5th Step Hard Assertion by using assertEquals(), assertTrue(), assertFalse()
				JsonPath json = res.jsonPath();
				assertEquals(data.getEmployeeName(), json.getString("data.employee_name"));
				assertEquals(data.getEmployeeSalary(),json.get("data.employee_salary"));
				assertEquals(data.getEmployeeAge(), json.get("data.employee_age"));
				assertEquals(data.getProfileImage(), json.getString("data.profile_image"));
				assertEquals(expectedData.getStatus(), json.getString("status"));
				assertEquals(expectedData.getMessage(), json.getString("message"));
				
		//6rd Step: make assertions - soft
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(json.getString("status"), expectedData.getStatus());
		soft.assertEquals(json.getString("message"), expectedData.getMessage());
		soft.assertEquals(json.getString("data.employee_name"), data.getEmployeeName());
		soft.assertEquals(json.get("data.employee_salary"), data.getEmployeeSalary());
		soft.assertEquals(json.get("data.employee_age"), data.getEmployeeAge());
		
		soft.assertAll();
	}

}
