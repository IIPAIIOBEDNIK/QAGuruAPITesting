/*

    Занятие 18 Поток 18

 */


package tests.Lesson;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatusTest {
    /*
    @Test
    void checkTotal() {
        get("https://selenoid.autotests.cloud/status")
                .then()
                .body("total", is(20));
        //55:50
    }

    @Test
    //BDD
    void checkWithGivenTotal() {
                given()
                        // Задает предусловие, параметры body указываются здесь
                .when()
                        .get("https://selenoid.autotests.cloud/status")
                .then()
                        .body("total", is(20));
        //55:50
    }

    @Test
    //BDD
    void checkWithStatusTotal() {
            given()
                    // Задает предусловие, параметры body указываются здесь
                    .when()
                        .get("https://selenoid.autotests.cloud/status")
                    .then()
                        .statusCode(200)
                        .body("total", is(20));
            }
            //1:04:50

    @Test
    void checkWithAllLogsTotal() {
        given()
                // Задает предусловие, параметры body указываются здесь
                //.log().all()
                .when()
                .get("https://selenoid.autotests.cloud/status")
                .then()
                .log().all()
                .statusCode(200)
                .body("total", is(20));
    }





    @Test
    void checkWithSomeLogsTotal() {
        given()
                // Задает предусловие, параметры body указываются здесь
                .log().uri()
                //.log().body() // for POST requests
                .when()
                .get("https://selenoid.autotests.cloud/status")
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .body("total", is(20));
    }





    @Test
    void checkVersionBrowser() {
        given()
                // Задает предусловие, параметры body указываются здесь
                .log().uri()
                //.log().body() // for POST requests
                .when()
                .get("https://selenoid.autotests.cloud/status")
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .body("total", is(20))
                .body("browsers.chrome", hasKey("100.0"));
    }

    @Test
    void checkResponseBadPractice() {  // Bad Practice. todo move to models
        String expectedResponce = "{\"total\":20,\"used\":0,\"queued\":0,\"pending\":0,\"browsers\":" +
                "{\"android\":{\"8.1\":{}},\"chrome\":{\"100.0\":{},\"99.0\":{}},\"chrome-mobile\":{\"86.0\":{}}," +
                "\"firefox\":{\"97.0\":{},\"98.0\":{}},\"opera\":{\"84.0\":{},\"85.0\":{}}}}\n";

        String actualResponse = given()
                // Задает предусловие, параметры body указываются здесь
                .log().uri()
                //.log().body() // for POST requests
                .when()
                .get("https://selenoid.autotests.cloud/status")
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().response().asString();

        assertEquals(expectedResponce, actualResponse);
    }



    @Test
    void checkResponseGoodPractice() {
        Integer expectedTotal = 20;

        Integer actualResponse = given()
                // Задает предусловие, параметры body указываются здесь
                .log().uri()
                //.log().body() // for POST requests
                .when()
                .get("https://selenoid.autotests.cloud/status")
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().path("total");

        assertEquals(expectedTotal, actualResponse);

    }


    @Test
    void checkJSONSchema() {
        given()
                // Задает предусловие, параметры body указываются здесь
                .log().uri()
                //.log().body() // for POST requests
                .when()
                .get("https://selenoid.autotests.cloud/status")
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .body("total", is(20))
                .body("browsers.chrome", hasKey("100.0"))
                .body(matchesJsonSchemaInClasspath("schemas/status-schema-responce.json"));
    }




//1:41:20


*/

    @Test
    void checkAPIUsers() {
        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("page", is(2));
                //.body("data.id", hasKey("8"));
    }


















}

