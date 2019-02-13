package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.LoginButtonPage;

public class ButtonLogin implements Task {

	public ButtonLogin() {

	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(LoginButtonPage.LOGGIN_BUTTON));

	}

	public static ButtonLogin on() {
		return instrumented(ButtonLogin.class);
	}

}
