package co.com.qvision.capacitacion.questions;

import io.restassured.response.Response;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import co.com.qvision.capacitacion.abilities.CallAnApi;

@Subject("the response received")
public class LastResponse implements Question<Response> {

    @Override
    public Response answeredBy(Actor actor) {
        return CallAnApi.as(actor).getLastResponse();
    }

    public static LastResponse received() {
        return new LastResponse();
    }
}
