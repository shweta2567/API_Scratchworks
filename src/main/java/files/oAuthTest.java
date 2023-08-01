package files;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.jsonMethod;
import files.payload;

import static io.restassured.RestAssured.*;

public class oAuthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url ="https://rahulshettyacademy.com/getCourse.php?code=4%2F0AZEOvhW-knvCm4LDz8v2HbuyLXsAvJ30LUFS5xzOs210sUP_IkmEHbKnRaWTt4kRFhCJYA&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=consent";



		String partialcode=url.split("code=")[1];

		String code=partialcode.split("&scope")[0];

		System.out.println(code);
		
		
		String accesstokenresponse =given().urlEncodingEnabled(false)
		.queryParams("code",code)
		.queryParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParams("client_secret","erZOWM9g3UtwNRj340YYaK_W")
		.queryParams("redirect_uri","https://rahulshettyacademy.com/getCourse.php")
		.queryParams("grant_type","authorization_code")
		.when().log().all()
		.post("https://www.googleapis.com/oauth2/v4/token").asString();
		
		JsonPath js = new JsonPath(accesstokenresponse);
		String accessToken = js.getString("access_token");
		
		
		
		
		String response =given().queryParam("access_token", accesstokenresponse)
		.when().log().all()
		.get("https://rahulshettyacademy.com/getCourse.php").asString();
		

	}

}
