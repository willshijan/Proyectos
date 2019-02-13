package co.com.qvision.capacitacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import co.com.qvision.capacitacion.interactions.Get;
import net.thucydides.core.annotations.Step;

public class FetchUser implements Task {

    private final int userId;

    public FetchUser(int userId) {
        this.userId = userId;
    }

    public static FetchUser withId(int userId) {
        return instrumented(FetchUser.class, userId);
    }

    @Override
    @Step("{0} fetches the user with id #userId")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource("/api/users/" + userId)
        );
    }
}
