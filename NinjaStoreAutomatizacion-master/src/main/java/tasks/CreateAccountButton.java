package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.CreateAccountButtonPage;

public class CreateAccountButton implements Task{

	public CreateAccountButton() {
		
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(CreateAccountButtonPage.CEATE_ACCOUNT_BUTTON));
		
	}
	public static CreateAccountButton on() {
		return instrumented(CreateAccountButton.class);
	}


}
