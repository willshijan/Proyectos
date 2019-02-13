package co.com.qvision.capacitacion.abilities;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

public class CallAnApi implements Ability {

    private final String baseURL;

    private CallAnApi(String baseURL) {
        this.baseURL = baseURL;
    }


    public static CallAnApi at(String baseURL) {
        return new CallAnApi(baseURL);
    }

    public static CallAnApi as(Actor actor) {
        return actor.abilityTo(CallAnApi.class);
    }

    public String resolve(String resource) {
        return baseURL + resource;
    }

    public Response getLastResponse() {
        return SerenityRest.lastResponse();
    }

    @Override
    public String toString() {
        return "call an API at " + baseURL;
    }
}
