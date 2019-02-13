package co.com.qvision.capacitacion.interactions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Interaction;
import co.com.qvision.capacitacion.questions.RestQueryFunction;

/**
 * A base class for all Screenplay REST interactions, which gives direct access to the RestAssured API.
 */
public abstract class RestInteraction implements Interaction {

    List<Function<RequestSpecification, RequestSpecification>> restConfigurations = new ArrayList<>();

    public RestInteraction with(RestQueryFunction restConfiguration) {
        this.restConfigurations.add(restConfiguration);
        return this;
    }

    public RestInteraction with(List<RestQueryFunction> restConfigurations) {
        this.restConfigurations.addAll(restConfigurations);
        return this;
    }

    protected RequestSpecification rest() {
        RequestSpecification requestSpecification = SerenityRest.given();
        for(Function<RequestSpecification, RequestSpecification> restConfiguration : restConfigurations) {
            requestSpecification = restConfiguration.apply(requestSpecification);
        }
        return requestSpecification;
    }
}