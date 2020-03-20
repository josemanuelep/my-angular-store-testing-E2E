package co.com.choucair.certification.angular_store.stepsdefinitions;

import co.com.choucair.certification.angular_store.model.Phone;
import co.com.choucair.certification.angular_store.tasks.OpenDetail;
import co.com.choucair.certification.angular_store.tasks.OpenThe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static co.com.choucair.certification.angular_store.util.Constants.ACTOR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ProductDetailRunner {
    @Given("^I am out shopping online$")
    public void iAmOutShoppingOnline()  {
        theActorCalled(ACTOR).wasAbleTo(OpenThe.page());
    }


    @When("^I open details of phone$")
    public void iOpenDetailsOfPhone(List<Phone> phones) {
        theActorCalled(ACTOR).attemptsTo(OpenDetail.of(phones));
    }

    @Then("^I would see the detail$")
    public void iWouldSeeTheDetail(List<Phone> phones)  {

    }

}
