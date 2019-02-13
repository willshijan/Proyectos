package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.LoginPage;
import userInterface.SubmitAccountInformationPage;

public class SubmitAccountInformation implements Task{
	
	private WebDriver webdriver;
	
	public SubmitAccountInformation(WebDriver hisbrowser) {
		this.webdriver = hisbrowser;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue("correo@hotmail.com").into(SubmitAccountInformationPage.EMAIL_ADDRES),
				Enter.theValue("Password1234").into(SubmitAccountInformationPage.PASSWORD),
				Enter.theValue("Password1234").into(SubmitAccountInformationPage.CONFIRM_PASSWORD));
		
		
	}
	public static SubmitAccountInformation on(WebDriver hisbrowser) {
		return instrumented(SubmitAccountInformation.class, hisbrowser);
	}

}
