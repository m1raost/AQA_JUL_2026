package org.prog.session18.steps.HomeWork18;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlloSteps {

    public static AlloPage alloPage;

    @Given("I load allo.ua page")
    public void loadAlloPage() {
        alloPage.loadPage();
    }

    @When("I search allo.ua for {string}")
    public void searchFor(String text) {
        alloPage.search(text);
    }

    @Then("I print first phones")
    public void printFirstPhones() {
        alloPage.printFirstPhones();
    }


}
