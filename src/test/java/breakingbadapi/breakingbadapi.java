package breakingbadapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class breakingbadapi {

	@BeforeTest
	public void beforeTest() {
	}

	@Test
	public void f() {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		String response = given().header("Content-Type", "application/json").when().get("/posts/1").then().log().all()
				.assertThat().statusCode(200).header("Server", "cloudflare").extract().response().asString();

		JsonPath js = new JsonPath(response);

		String userid = js.getString("userId");
		System.out.println("este es el id de usuario: " + userid);

		String id = js.getString("id");
		System.out.println("este es el id: " + id);

		String title = js.getString("title");
		System.out.println("este es el titulo: " + title);

		String body = js.getString("body");
		System.out.println("este es el body:  " + body);
	}

	@AfterTest
	public void afterTest() {
	}

}
