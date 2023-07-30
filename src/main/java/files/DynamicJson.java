package files;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DynamicJson {

	@Test(dataProvider="BooksData")
	public void addBook(String isbn , String aisle)
	{
		RestAssured.baseURI="http://216.10.245.166";
		String response = given().log().all().header("Content-Type","application/json").
		body(payload.Addbook(isbn,aisle)).
		when()
		.post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		JsonPath js = jsonMethod.rawToJson(response);
		String ID = js.get("ID");
		System.out.println(ID);
	}
	@DataProvider(name="BooksData")
	public Object[][] getData()
	{
		return new Object[][] {{"ojfwty","9363"},{"cwetee","4253"},{"okmfet","533"	}};
}
	}
