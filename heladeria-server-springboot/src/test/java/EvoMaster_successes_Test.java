import  org.junit.AfterClass;
import  org.junit.BeforeClass;
import  org.junit.Before;
import  org.junit.Test;
import static org.junit.Assert.*;
import  java.util.Map;
import  io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import  io.restassured.response.ValidatableResponse;
import static org.evomaster.client.java.controller.api.EMTestUtils.*;
import  org.evomaster.client.java.controller.SutHandler;
import static org.evomaster.client.java.controller.db.dsl.SqlDsl.sql;
import  org.evomaster.client.java.controller.api.dto.database.operations.InsertionResultsDto;
import  org.evomaster.client.java.controller.api.dto.database.operations.InsertionDto;
import  java.util.List;
import static org.hamcrest.Matchers.*;
import  io.restassured.config.JsonConfig;
import  io.restassured.path.json.config.JsonPathConfig;
import static io.restassured.config.RedirectConfig.redirectConfig;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;
import static org.evomaster.client.java.controller.expect.ExpectationHandler.expectationHandler;
import  org.evomaster.client.java.controller.expect.ExpectationHandler;
import  io.restassured.path.json.JsonPath;
import  java.util.Arrays;




/**
 * This file was automatically generated by EvoMaster on 2022-06-11T13:47:48.605-03:00[America/Argentina/Buenos_Aires]
 * <br>
 * The generated test suite contains 1 tests
 * <br>
 * Covered targets: 2
 * <br>
 * Used time: 0h 10m 0s
 * <br>
 * Needed budget for current results: 97%
 * <br>
 * This file contains test cases that represent successful calls.
 */
public class EvoMaster_successes_Test {

    
    private static String baseUrlOfSut = "http://localhost:8080";
    
    
    @BeforeClass
    public static void initClass() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.urlEncodingEnabled = false;
        RestAssured.config = RestAssured.config()
            .jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.DOUBLE))
            .redirect(redirectConfig().followRedirects(false));
    }
    
    
    
    
    
    
    
    
    @Test
    public void test_0() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"direccion_entrega\": \"yQpDI\" " + 
                    " } ")
                .post(baseUrlOfSut + "/guidodecaso/heladeria/1.0.0/pedidos")
                .then()
                .statusCode(201)
                .assertThat()
                .contentType("application/json")
                .body("'direccion_entrega'", containsString("yQpDI"))
                .body("'_links'.'potes'.'verb'", containsString("GET"))
                .body("'_links'.'pagar'.'verb'", containsString("POST"))
                .body("'_links'.'pago'.'verb'", containsString("GET"));
        
    }


}
