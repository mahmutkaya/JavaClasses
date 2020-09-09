package techproedenglish01.techproedenglish01api;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

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
     *  4)Print all employee salaries whose ids are less than 11
     *  Assert that max salary is 433060
     */
	
	@Test
	public void get01() {
		Response res = given().spec(spec03).when().get();
		res.prettyPrint();
		
		res.then()
			.assertThat()
			.statusCode(200);
		
		JsonPath json = res.jsonPath();
		SoftAssert softAssert = new SoftAssert();
		
		// 1)Print all ids greater than 10 on the console
		List<String> idList = json.getList("data.findAll{Integer.valueOf(it.id)>10}.id"); // data.id
		System.out.println(idList);
		//Assert that there are 14 ids greater than 10
		softAssert.assertTrue(idList.size()>10);
		
		// 2)Print all ages less than 30 on the console
		List<String> ageList = json.getList("data.findAll{Integer.valueOf(it.employee_age)<30}.employee_age");
		System.out.println(ageList);
		//Assert that maximum age is 23
		Collections.sort(ageList);
		softAssert.assertTrue(ageList.get(ageList.size()-1).equals("23"));
		
		//3)Print all employee names whose salaries are greater than 350000
		List<String> nameList = json.getList("data.findAll{Integer.valueOf(it.employee_salary)>35000}.employee_name");
		System.out.println(nameList);
		//Assert that Charde Marshall is one of the employees whose salary is greater than 350,000
		softAssert.assertTrue(nameList.contains("Charde Marshall"), "name list does not contain Charde Marshall");
		
		//4)Print all employee salaries whose ids are less than 11
		List<String> salaryList = json.getList("data.findAll{Integer.valueOf(it.id)<11}.employee_salary");
		System.out.println(salaryList);
		//Assert that max salary is 433060
		List<Integer> intList = new ArrayList<>();
		for(String w : salaryList) {
			intList.add(Integer.valueOf(w));
		}
		softAssert.assertTrue(Collections.max(intList)==433060);
		
		softAssert.assertAll();
		
	}

}
