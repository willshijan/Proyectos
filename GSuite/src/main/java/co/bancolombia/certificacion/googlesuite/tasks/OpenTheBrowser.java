package co.bancolombia.certificacion.googlesuite.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.bancolombia.certificacion.googlesuite.userinterfaces.GoogleHomePage;

public class OpenTheBrowser implements Task{

	private PageObject page;
	//Constructor ó Setters
	
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}
	
	@Override
	@Step("{0} open the browser on Google Home Page")
	public <T extends Actor> void performAs(T actor) {	
		actor.attemptsTo(Open.browserOn(page));
	}

	public static OpenTheBrowser on(PageObject pageObject) {
//		return new OpenTheBrowser();
		return instrumented(OpenTheBrowser.class, pageObject);
	}

}
