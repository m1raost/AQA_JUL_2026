package org.prog.session19.steps.TestHomeWork19;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.prog.session19.steps.DataHolder;

import java.util.List;

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


    @When("I get first {int} goods as {string}")
    public void getFirstAmountOf(int amount, String alias) {
        List<PhoneDto> phoneList = alloPage.getFirstGoods(amount);
        DataHolder.data.put(alias, phoneList);
    }


    @Then("I print first phones")
    public void printFirstPhones() {
        alloPage.printFirstPhones();
    }


}
