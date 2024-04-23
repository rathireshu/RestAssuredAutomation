package apiTests;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class DeleteReq {

	@Test
	public void deleteReqTest() {
		
		//method 2:- with static import of RestAssured
		
		baseURI = "https://reqres.in/api";
		
		given().
		  delete("/users/2").
		then().
		  statusCode(204);		 
		
	}
	
	
}
