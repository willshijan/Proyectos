package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.CreateAccountPage;

public class CreateAccount implements Task {
	
	private WebDriver webdriver;

	public CreateAccount(WebDriver hisbrowser) {
		this.webdriver = hisbrowser;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CreateAccountPage.CREATE_ACCOUNT));
	}
	public static CreateAccount on(WebDriver hisbrowser) {
		return instrumented(CreateAccount.class, hisbrowser);
	}
}
