package techproedenglish01.techproedenglish01api;

import org.junit.Before;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class TestBaseDt {
	protected RequestSpecification spec01;
	
	@Before
	public void setUp() {
		spec01 = new RequestSpecBuilder()
					.setBaseUri("https://jsonplaceholder.typicode.com/todos")
					.build();
	}

}
