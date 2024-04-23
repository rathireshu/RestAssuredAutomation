package apiTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {

	@Test
	public void getReqTest() {
		
		//method 1:- without static import of RestAssured
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");		
		System.out.println("response code is :"+response.statusCode());
		System.out.println("response body is :"+response.getBody().asString());	
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	
}
