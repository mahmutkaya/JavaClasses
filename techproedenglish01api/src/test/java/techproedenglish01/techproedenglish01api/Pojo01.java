package techproedenglish01.techproedenglish01api;

import static io.restassured.RestAssured.given;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Pojo01 extends TestBaseDt {
	
	/*
	 POJO stands for Plain Old Java Object
	 POJO is a class created by using Json Data
	 Json Data ==> Pojo Class ==> Object ==> Use the object in Automation
	 
	 When you create a Pojo Class, it should have;
	 	1)private variables
	 	2)getter() and setter() methods for all varibales
	 	3)Construction with all parameters
	 	4)Construction without parameters
	 	5)toString()
	*/
	
	/*             
		 When 
		   I send POST Request to https://restful-booker.herokuapp.com/booking ==> spec02
		   with the request body 
				{
				    "firstname": "Ali",
				    "lastname": "Can",
				    "totalprice": 111,
				    "depositpaid": true,
				    "bookingdates": {
				        "checkin": "2020-09-16",
				        "checkout": "2020-09-18"
				    },
				    "additionalneeds": "Wifi"
			    }
		 Then 
		   Status code is 200
		   Content Type is "application/json"
		   Assert all response body details
		   
		 Note: Create Request Body by using POJO  
	*/
	
	@Test
	public void post01() {
		
		BookingDatesDt bookingDates = new BookingDatesDt("2020-09-16", "2020-09-18");
		BookingDt booking = new BookingDt("Ali", "Can", 111, true, bookingDates, "Wifi");
		
		Response res = given()
						.contentType(ContentType.JSON)
						.spec(spec02)
						.body(booking)
					  .when()
						.post();
		res.prettyPrint();
		
		//store actual data into a JsonPath object
		JsonPath actualData = res.jsonPath();
		
		res.then()
			.statusCode(200)
			.contentType(ContentType.JSON);
		Assert.assertEquals(booking.getFirstname(), actualData.getString("booking.firstname"));
		Assert.assertEquals(booking.getLastname(), actualData.getString("booking.lastname"));
		Assert.assertEquals(booking.getTotalprice(), actualData.get("booking.totalprice"));
		Assert.assertEquals(booking.getDepositpaid(), actualData.getBoolean("booking.depositpaid"));
		
		Assert.assertEquals(bookingDates.getCheckin(), actualData.getString("booking.bookingdates.checkin"));
		Assert.assertEquals(bookingDates.getCheckout(), actualData.getString("booking.bookingdates.checkout"));
		
		Assert.assertEquals(booking.getAdditionalneeds(), actualData.getString("booking.additionalneeds"));
		
	}

}
