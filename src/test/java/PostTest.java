import io.restassured.RestAssured;
import jdk.jfr.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostTest {

    @Test
    public void testPostmanEcho() {
        RestAssured.baseURI = "https://postman-echo.com";

        given()
                .body("some data")
        .when()
                .post("/post")
        .then()
                .statusCode(200)
                .body("data", equalTo("wrong data"));
                //.body("data", equalTo("some data"));

    }
}