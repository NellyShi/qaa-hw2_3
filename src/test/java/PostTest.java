import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostTest {
    @Test
    public void shouldBodyMatch() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/json")
                .body("{ \"name\" : \"John\", \"age\" : 30, \"city\" : \"New York\"}")
                .when()
                .post("/post")
                .then()
                .body("data.name", equalTo("Joh"))
                .body("data.age", equalTo(30))
                .body("data.city", equalTo("New York"));
    }
}
