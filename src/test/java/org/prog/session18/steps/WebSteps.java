package org.prog.session18.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.prog.session16.page.GooglePage;
import org.testng.Assert;

public class WebSteps {

    public static GooglePage googlePage;

    @Given("I load google page")
    public void loadGooglePage() {
        googlePage.loadPage();
        googlePage.acceptCookies();
    }

    @When("I set google page search to random person's first and last name")
    public void setGoogleSearch() {
        String firstName = TestDataSteps.personData.getName().getFirst();
        String lastName = TestDataSteps.personData.getName().getLast();
        googlePage.setSearchFieldValue(firstName + " " + lastName);
    }

    @Then("Google search has that person's first and last name in search input")
    public void assertGoogleSearchValue() {
        String firstName = TestDataSteps.personData.getName().getFirst();
        String lastName = TestDataSteps.personData.getName().getLast();
        Assert.assertEquals(googlePage.getSearchFieldValue(), firstName + " " + lastName);
    }
}
