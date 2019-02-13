package co.bancolombia.certificacion.googlesuite.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.bancolombia.certificacion.googlesuite.userinterfaces.GoogleAppsComponent;
import co.bancolombia.certificacion.googlesuite.userinterfaces.GoogleHomePage;

public class GoTo implements Task{
	
	private Target googleApp;
	
	public GoTo(Target googleApp) {
		this.googleApp = googleApp;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
//		OSe hace Click		
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APPS),
				Click.on(googleApp));
	}

	public static GoTo theApp(Target googleApp) {
		return instrumented(GoTo.class, googleApp);
	}

}
