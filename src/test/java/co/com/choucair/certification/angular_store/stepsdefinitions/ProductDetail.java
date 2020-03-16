package co.com.choucair.certification.angular_store.stepsdefinitions;

import co.com.choucair.certification.angular_store.model.Phone;
import co.com.choucair.certification.angular_store.tasks.OpenThe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ProductDetail {
    private String actorName = "Jose";
    @Given("^I am out shopping online$")
    public void iAmOutShoppingOnline()  {
        theActorCalled(actorName).wasAbleTo(OpenThe.page());
    }


    @When("^I open details of phone$")
    public void iOpenDetailsOfPhone(List<Phone> phones)  {

    }

    @Then("^I would see the detail$")
    public void iWouldSeeTheDetail(List<Phone> phones) {

    }
}
