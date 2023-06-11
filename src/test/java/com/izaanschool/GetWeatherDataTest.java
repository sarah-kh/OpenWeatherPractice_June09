package com.izaanschool;

import base.Base;
import io.restassured.response.*;
import io.restassured.http.ContentType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetWeatherDataTest {

    //private static final Logger logger = LogManager.getLogger(GetWeatherDataTest.class);
    @Rule
    public TestName name = new TestName();

    String hostName = "https://api.openweathermap.org";

    @Test
    public void statusTest() {
        String resources = "/data/2.5/weather";
        String queryParameter = "?q=London&appid=d2e12e9a647d151d7b9591a71c9b3cb6";
        String url = Base.buildURL(resources, queryParameter);
        given()
                .contentType(ContentType.JSON)
                //.pathParam("id", "AskJsd8Sd")
                .when()
                .get(url)
                .then()
                .statusCode(200);

        // given().contentType(ContentType.JSON).when().get(url).then().statusCode(200).body("base", equalTo("stations")).body("coord.lon", equalTo(10.99F));
        //requestSpecification.contentType(ContentType.JSON).

        String testMethodName = name.getMethodName();
        System.out.println (testMethodName + ": Test Passed");

        //logger.info( testMethodName + ": Test Passed");
    }

    @Test
    public void contentTypeTest() {
        String resources = "/data/2.5/weather";
        String queryParameter = "?q=London&appid=d2e12e9a647d151d7b9591a71c9b3cb6";
        String url = Base.buildURL(resources, queryParameter);
        given()
                .contentType(ContentType.JSON)
                //.pathParam("id", "AskJsd8Sd")
                .when()
                .get(url)
                .then()
                .contentType("application/json");

        // given().contentType(ContentType.JSON).when().get(url).then().statusCode(200).body("base", equalTo("stations")).body("coord.lon", equalTo(10.99F));
        //requestSpecification.contentType(ContentType.JSON).

        String testMethodName = name.getMethodName();
        System.out.println (testMethodName + ": Test Passed");

        //logger.info( testMethodName + ": Test Passed");
    }

    @Test
    public void weatherDescriptionTest() {
        String resources = "/data/2.5/weather";
        String queryParameter = "?q=London&appid=d2e12e9a647d151d7b9591a71c9b3cb6";
        String url = Base.buildURL(resources, queryParameter);
        given()
                .contentType(ContentType.JSON)
                //.pathParam("id", "AskJsd8Sd")
                .when()
                .get(url)
                .then()
                .header("Content-Length", "519");
        String testMethodName = name.getMethodName();
        System.out.println (testMethodName + ": Test Passed");
        //logger.info( testMethodName + ": Test Passed");
    }

    @Test
    public void countryTest() {
        String resources = "/data/2.5/weather";
        String queryParameter = "?q=London&appid=d2e12e9a647d151d7b9591a71c9b3cb6";
        String url = Base.buildURL(resources, queryParameter);
        given()
                .contentType(ContentType.JSON)
                //.pathParam("id", "AskJsd8Sd")
                .when()
                .get(url)
                .then()
                .body("sys.country", equalTo("GB"));

        String testMethodName = name.getMethodName ();

        System.out.println (testMethodName + ": Test Passed");

        //logger.info( name.getMethodName() + ": Test Passed");
    }


    @Test
    public void weatherTest() {
        String resources = "/data/2.5/weather";
        String queryParameter = "?lat=44.34&lon=10.99&appid=87af3508c443016e851bee3ba091fd3c";
        String url = Base.buildURL(resources, queryParameter);
//        given()
//                .contentType(ContentType.JSON)
//                .pathParam("id", "AskJsd8Sd")
//                .when()
//                .get(url)
////              .then()
//                .body("description", equalTo("clear sky")); 
//                .then()
//                .extract().response();

        String testMethodName = name.getMethodName ();
        System.out.println (testMethodName + ": test done");

        //logger.info( name.getMethodName() + ": Test Passed");
    }

}
