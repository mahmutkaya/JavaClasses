package techproedenglish01.techproedenglish01api;

import org.junit.Before;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class TestBaseDt {
	protected RequestSpecification spec01,spec02,spec03;
	
	@Before
	public void setUp01() {
		spec01 = new RequestSpecBuilder()
					.setBaseUri("https://jsonplaceholder.typicode.com/todos")
					.build();
	}
	@Before
	public void setUp02() {
		spec02 = new RequestSpecBuilder()
					.setBaseUri("https://restful-booker.herokuapp.com/booking")
					.build();
	}
	@Before
	public void setUp03() {
		spec03 = new RequestSpecBuilder().
				             setBaseUri("http://dummy.restapiexample.com/api/v1/employees").
				             build();
	}

}
