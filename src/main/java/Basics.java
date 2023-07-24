import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.jsonMethod;
import files.payload;

import static io.restassured.RestAssured.*;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//given= all input details like base urol,query, paramenter,body
		//when Submit the API= resource ,http method will be given here
		//then =validate the response
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(payload.addPlace()).when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		//Add place-> Update Place with New address -> Get place to validate if new address is present in response
		System.out.println(response);
		JsonPath js=jsonMethod.rawToJson(response);
		String placeId=js.getString("place_id");
		System.out.println(placeId);
		
		//Update Place address
		String newAddress = "70 winter walk, USA";
		given().log().all().queryParam("key", "qaclcik123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeId+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "").
		when().put("maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200).body("msg",equalTo("Address successfully updated"));
		
		//get place 
		String getPlaceResponse = given().log().all().queryParam("key", "qaclick123")
		.queryParam("place_id", placeId)
		.when().get("maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		JsonPath js1 = jsonMethod.rawToJson(getPlaceResponse);
		String actualAddress = js1.getString("address");
		Assert.assertEquals(actualAddress, "");
		
		
	}

	
}
