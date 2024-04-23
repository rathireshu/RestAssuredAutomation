package apiTests;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


import org.json.simple.JSONObject;

public class PutPatchReq{

	@Test
	public void putReqTest() {
		
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
		  put("/users/2").		  
		then().
		  statusCode(200).log().all();
		  		
	}
	@Test
	public void patchReqTest() {
		
			
		JSONObject reqBody = new JSONObject();
		reqBody.put("Name", "Reshu");
		reqBody.put("Job", "engineer");	
		System.out.println(reqBody.toJSONString());
		baseURI = "https://reqres.in/api";
		
		given().
		  body(reqBody.toJSONString()).
		  contentType(ContentType.JSON).
		when().
		  patch("/users/2").		  
		then().
		  statusCode(200).log().all();
		  
		
		
	}
	
	
	
}
