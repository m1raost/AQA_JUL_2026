package org.prog.session18.steps;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import org.prog.session17.dto.ResultsDto;

public class RestSteps {

    public static ResultsDto resultsDto;

    @Given("I request {int} random people from service")
    public void getRandomPeopleFromService(int amount) {
        resultsDto = RestAssured.given()
                .baseUri("https://randomuser.me/")
                .basePath("/api")
                .header("Accept", "application/json")
                .queryParam("inc", "gender,nat,name")
                .queryParam("noinfo")
                .queryParam("results", amount)
                .get()
                .as(ResultsDto.class);
    }
}
