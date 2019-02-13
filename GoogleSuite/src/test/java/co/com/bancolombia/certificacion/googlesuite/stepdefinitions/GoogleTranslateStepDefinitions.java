package co.com.bancolombia.certificacion.googlesuite.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certificacion.googlesuite.task.GoTo;
import co.com.bancolombia.certificacion.googlesuite.task.OpenTheBrowser;
import co.com.bancolombia.certificacion.googlesuite.task.Translate;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleAppsComponent;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver = "chrome", options="--start-maximixed")
	private WebDriver herBrowser;
	
	private Actor susan = Actor.named("Susan");
	
	private GoogleHomePage googleHomePage;
	
	@Before
	public void SetUp(){
		herBrowser.manage().window().maximize();
		susan.can(BrowseTheWeb.with(herBrowser));
	}
	
	
	@Given("^that susan wants to traslate a words$")
	public void thatSusanWantsToTraslateAWords() throws Exception {
		
//		OpenTheBrowser open = new OpenTheBrowser();
		susan.wasAbleTo(OpenTheBrowser.on(googleHomePage), 
				GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));
	    
	}


	@When("^she translates the word cheese from English to Spanish$")
	public void sheTranslatesTheWordCheeseFromEnglishToSpanish() throws Exception {
		susan.wasAbleTo(Translate.the());
	    
	}

	@Then("^she should see the word queso in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen() throws Exception {
	    
	}

}
