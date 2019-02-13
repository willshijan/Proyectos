package co.com.qvision.capacitacion.stepdefinitions;

import static co.com.qvision.capacitacion.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

import co.com.qvision.capacitacion.abilities.CallAnApi;
import co.com.qvision.capacitacion.interactions.Get;
import co.com.qvision.capacitacion.models.User;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;

public class CallRestServiceWithScreenplay {

	Actor jorge = Actor.named("Jorge el curioso").whoCan(CallAnApi.at("https://reqres.in/api"));

	@Given("^that jorge calls a REST API with Screenplay$")
	public void thatJorgeCallsARESTAPIWithScreenplay() {
		jorge.attemptsTo(Get.resource("/users/1"));
	}

	@When("^jorge obtains the response$")
	public void jorgeObtainsTheResponse() {
		User user = SerenityRest.lastResponse().jsonPath().getObject("data", User.class);
		System.out.println("El primer nombre es: " + user.getFirstName());

	}

	@Then("^jorge verifies the quality response$")
	public void jorgeVerifiesTheQualityResponse() {
		jorge.should(seeThatResponse("User details should be correct",
				response ->response.statusCode(200).body("data.first_Name", equalTo("George")).body("data.last.name", equalTo("Bluth"))));

	}

}
