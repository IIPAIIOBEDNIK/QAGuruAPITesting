/*

    Занятие 18 Поток 18

 */


package test.homework;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.is;

public class firstHomeworkAPI {

    @Test
    void checkSingleUser() {
        given()
                .log().uri()
                .when()
                .get("https://reqres.in/api/users/2")
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .body("data.last_name", is("Weaver"))
                .body("data.email", is("janet.weaver@reqres.in"));
    }


    @Test
    void checkCreateUser() {

        String UserBody = "{ \"name\": \"morpheus\", \"job\": \"leader\" }";

        given()
                .log().uri()
                .body(UserBody)
                .contentType(JSON)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .log().status()
                .log().body()
                .statusCode(201)
                .body("name", is("morpheus"))
                .body("job", is("leader"));
    }


    @Test
    void checkCreateUserWithEmptyData() {
        given()
                .log().uri()
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .log().status()
                .log().body()
                .statusCode(415);
    }





}







