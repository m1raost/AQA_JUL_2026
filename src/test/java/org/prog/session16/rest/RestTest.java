package org.prog.session16.rest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.prog.session16.rest.dto.ResultsDto;
import org.testng.annotations.Test;

public class RestTest {

    @Test
    public void myRestTest() {
        RequestSpecification specification = RestAssured.given();
        specification.baseUri("https://randomuser.me/");
        specification.basePath("/api");
        specification.header("Accept", "application/json");
        specification.queryParam("inc", "gender,nat,name");
        specification.queryParam("noinfo");
        specification.queryParam("results", 100);

        Response response = specification.get();
        response.statusCode();
        response.body().prettyPrint();
//        JsonPath path = response.jsonPath();
//        List<String> nats = path.getList("results.nat");
//        System.out.println(nats);

        ValidatableResponse validatableResponse = response.then();
        validatableResponse.statusCode(200);
        validatableResponse.contentType(ContentType.JSON);
        validatableResponse.body("results.findAll { it.gender == 'male' }.nat",
                Matchers.hasItem("GB"));
    }

    @Test
    public void myRestTest2() {
        RequestSpecification specification = RestAssured.given();
        specification.baseUri("https://randomuser.me/");
        specification.basePath("/api");
        specification.header("Accept", "application/json");
        specification.queryParam("inc", "gender,nat,name");
        specification.queryParam("noinfo");
        specification.queryParam("results", 100);

        Response response = specification.get();
        ResultsDto results = response.as(ResultsDto.class);
        results.results.get(0).gender = "male";
        results.results.get(1).gender = "female";
    }

    @Test
    public void myRestTest3() {
        RestAssured.given()
                .baseUri("https://randomuser.me/")
                .basePath("/api")
                .header("Accept", "application/json")
                .queryParam("inc", "gender,nat,name")
                .queryParam("noinfo")
                .queryParam("results", 3)
                .get()
                .prettyPeek()
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("results.gender", Matchers.hasItem("female"));
    }
}
