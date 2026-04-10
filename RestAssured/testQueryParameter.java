package RestAssured;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class testQueryParameter {

    final static String ROOT_URI = "http://ip-api.com/json";

    @Test
    public void testQueryParameter() {

        Response response =
                given()
                    .contentType(ContentType.JSON)
                .when()
                    .queryParam("fields", "query,country,city,timezone")
                    .get(ROOT_URI + "/125.219.5.94");

        // Print response
        System.out.println(response.getBody().asPrettyString());
    }
}