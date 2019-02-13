package co.com.qvision.capacitacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.qvision.capacitacion.abilities.CallAnApi.as;

public class Get extends RestInteraction{

    private final String resource;

    public Get(String resource) {
        this.resource = resource;
    }

    @Step("{0} ejecuta un GET la accion sobre el recurso #resource")
    @Override
    public <T extends Actor> void performAs(T actor) {
        rest().get(as(actor).resolve(resource));
        
    }

    public static Get resource(String resource) {
        return instrumented(Get.class, resource);
    }
}
