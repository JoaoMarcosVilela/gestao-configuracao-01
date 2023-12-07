package testes;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class RestAssuredTest {

    @Test
    void testJspContent() {
        RestAssured.baseURI = "http://localhost:8080";  // Atualize para a URL do seu aplicativo
        given().when().get("/project-webapp/index.jsp").then()
                .statusCode(200)
                .body(containsString("<h2>Hello World!</h2>"));
    }
}

