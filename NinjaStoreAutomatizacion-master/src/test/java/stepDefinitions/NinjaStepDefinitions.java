package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import tasks.CreateAccount;
import tasks.Login;
import tasks.OpenTheBrowser;
import tasks.SubmitAccountInformation;
import userInterface.NinjaHomePage;

public class NinjaStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor santiago = Actor.named("Santiago");
	private NinjaHomePage ninjaHomePage;
	
	@Before
	public void setUp() throws InterruptedException {
		santiago.can(BrowseTheWeb.with(hisBrowser));
		hisBrowser.manage().window().maximize();
		hisBrowser.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}
	
	@Given("^que un usuario quiere comprar productos de la pagina de ninja store$")
	public void queUnUsuarioQuiereComprarProductosDeLaPaginaDeNinjaStore() throws Exception {
		santiago.wasAbleTo(OpenTheBrowser.on(ninjaHomePage));
	    
	}


	@When("^el usuario ingrese las credenciales en la pagina$")
	public void elUsuarioIngreseLasCredencialesEnLaPagina() throws Exception {
	   santiago.attemptsTo(Login.on(hisBrowser),
			   CreateAccount.on(hisBrowser),
			   SubmitAccountInformation.on(hisBrowser));
	   
	}

	@Then("^el vera el catalogo de los productos$")
	public void elVeraElCatalogoDeLosProductos() throws Exception {
	   
	}


}
