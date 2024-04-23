package apiTests;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class PostReq{

	@Test
	public void postReqTest() {
		
		//method 2:- with static import of RestAssured
		//and to write post request payload in JSOn format we will use one more lib called "json-simple"
		
		//after adding this lib now create json payload 
		
		JSONObject reqBody = new JSONObject();
		reqBody.put("Name", "Reshu");
		reqBody.put("Job", "engineer");	
		System.out.println(reqBody.toJSONString());
		baseURI = "https://reqres.in/api";
		
		given().
		  body(reqBody.toJSONString()).
		  contentType(ContentType.JSON).
		when().
		  post("/users").		  
		then().
		  statusCode(201).log().all();
		  
		
		
	}
	
	
}
