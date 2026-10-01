package org.prog.session17.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MySteps {

    @Given("My Given Step")
    public void myGivenStep() {
        System.out.println("Given a user exists");
    }

    @When("My When Step")
    public void myWhenStep() {
        System.out.println("When that user does something");
    }

    @Then("My Then Step")
    public void myThenStep() {
        System.out.println("Then I validate action results");
    }
}
