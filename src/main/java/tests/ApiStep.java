package tests;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import core.BaseTest;



public class ApiStep extends BaseTest {

	@Test
	public void deveBuscarClimaPorCidade() {

		given().log().all().queryParam("q", "Barueri,BR").queryParam("appid", "cc9a5b3d34d37c6723a37b6f85a5625c")
				.queryParam("units", "metric")

				.when().get("/")

				.then().log().all().statusCode(200);

	}

	@Test
	public void deveValidarSemPermissao() {

		given().log().all().queryParam("appid", "401")

				.when().get("/")

				.then().log().all().statusCode(401);

	}


}
