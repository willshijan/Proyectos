package co.bancolombia.certificacion.googlesuite.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import co.bancolombia.certificacion.googlesuite.tasks.GoTo;
import co.bancolombia.certificacion.googlesuite.tasks.OpenTheBrowser;
import co.bancolombia.certificacion.googlesuite.tasks.Translate;
import co.bancolombia.certificacion.googlesuite.userinterfaces.GoogleAppsComponent;
import co.bancolombia.certificacion.googlesuite.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepsDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser; //his si es Hombre
	
	private Actor susan = Actor.named("Susan");
	
	private GoogleHomePage googleHomePage;
	
	@Before
	public void setUp() {
		susan.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^thaht susan wants to translate  a word$")
	public void thahtSusanWantsToTranslateAWord() {
//	    Precondiciones: Estar en Google Translate
		/* 1: Abrir el navegador en el home de Google: https://www.google.com
		 * 2: Ir a google Translate(Click googleApps, click Google Translate, etc...)  
		 */
		
//		wasAbleTo "Fu� capaz de" @Given		�	attempts "Intenta Hacer" @When
		susan.wasAbleTo(OpenTheBrowser.on(googleHomePage),GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));
	}

	@When("^She translates the word cheese from english to spanish$")
	public void sheTranslatesTheWordCheeseFromEnglishToSpanish() {
//	   Condiciones: Traducir una palabra de ingles a espa�ol 
		susan.wasAbleTo(Translate.the());
	}

	@Then("^she should see the word queso in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen() {
//	   Consecuencias: Aparece la palabra traducida -> Verificarlo
	}

}
