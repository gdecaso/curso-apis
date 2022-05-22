package com.heladeriaapilia.integration;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.hamcrest.Matchers.equalTo;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class RestAssuredTest {

  public static final String BASE_URI = "/guidodecaso/heladeria/1.0.0";
  @LocalServerPort
  private Integer port;

  @Test
  void hayDulceDeLeche() {

    RestAssured
            .given()
              .filter(new RequestLoggingFilter())
              .contentType(ContentType.JSON)
            .when()
              .get("http://localhost:" + port + BASE_URI + "/gustos")
            .then()
              .statusCode(200)
              .body("[0].id", equalTo("ddl"))
              .body("[0].name", equalTo("Dulce de leche"))
              .body("[0].tipo", equalTo("dulce de leches"));



//            ExtractableResponse<Response> response = RestAssured
//      .given()
//        .filter(new RequestLoggingFilter())
//        .auth().preemptive().basic("duke", "secret")
//        .contentType("application/json")
//        .body("{\"title\": \"Effective Java\", \"isbn\":\"978-0-13-468599-1\", \"author\":\"Joshua Bloch\"}")
//      .when()
//        .post("http://localhost:" + port + "/api/books")
//      .then()
//        .statusCode(201)
//        .extract();

//    RestAssured
//      .when()
//        .get(response.header("Location"))
//      .then()
//        .statusCode(200)
//        .body("id", Matchers.notNullValue())
//        .body("isbn", Matchers.equalTo("978-0-13-468599-1"))
//        .body("author", Matchers.equalTo("Joshua Bloch"))
//        .body("title", Matchers.equalTo("Effective Java"));
  }
}
