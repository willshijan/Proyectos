package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.LoginPage;

public class Login	implements Task {
	
	private WebDriver webdriver;
	
	public Login(WebDriver hisbrowser) {
		this.webdriver = hisbrowser;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(LoginPage.LOGIN_BUTTON));
	}
	
	public static Login on(WebDriver hisbrowser) {
		return instrumented(Login.class,hisbrowser);
	}

}
