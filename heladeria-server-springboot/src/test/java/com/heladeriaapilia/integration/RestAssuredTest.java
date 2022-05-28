package com.heladeriaapilia.integration;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;

import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class RestAssuredTest {

  public static final String BASE_URI = "/guidodecaso/heladeria/1.0.0";
  @BeforeAll
  static void beforeAll() {
    RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
  }

  @LocalServerPort
  private Integer port;

  private String apiPath() {
    return "http://localhost:" + port + BASE_URI;
  }

  @Test
  void tieneQueHaberDulceDeLeche() {
    RestAssured
            .when()
              .get(apiPath() + "/gustos")
            .then()
              .statusCode(200)
              .body("[0].id", equalTo("ddl"))
              .body("[0].nombre", equalTo("Dulce de leche"))
              .body("[0].tipo", equalTo("dulce de leches"));
  }

  @Test
  void unPedidoRecienCreadoSeTieneQuePoderObtener() {
    String direccionEntrega = "Rivadavia 1234 5B";
    ExtractableResponse<Response> pedidoCreado = RestAssured
            .given()
              .contentType(ContentType.JSON)
              .body(Map.of("direccion_entrega", direccionEntrega))
            .when()
              .post(apiPath() + "/pedidos")
            .then()
              .statusCode(201)
              .body("direccion_entrega", equalTo(direccionEntrega))
              .extract();
    RestAssured
            .when()
              .get(pedidoCreado.header("Location"))
            .then()
              .statusCode(200)
              .body("id", notNullValue())
              .body("direccion_entrega", equalTo(direccionEntrega));
  }
}
