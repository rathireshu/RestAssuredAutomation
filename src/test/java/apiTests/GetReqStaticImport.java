package apiTests;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetReqStaticImport {

	@Test
	public void getReqTeat() {
		
		//method 2:- with static import of RestAssured
		
		baseURI = "https://reqres.in/api";
		
		given().
		  get("/users?page=2").
		then().
		  statusCode(200).
		  body("data[1].id", equalTo(8)).
		  body("total", equalTo(12)).body("data.first_name", hasItems("Michael","Lindsay"));
		
		
		
	}
	
	
}
