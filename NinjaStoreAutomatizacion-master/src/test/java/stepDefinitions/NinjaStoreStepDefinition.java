package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.DatosUbicacion;
import models.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.Validate;
import tasks.ButtonLogin;
import tasks.CreateAccountButton;
import tasks.OpenTheBrowser;
import tasks.SubmitAccount;
import ui.NinjaHomePage;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class NinjaStoreStepDefinition {

	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor santiago = Actor.named("Santiago");
	private NinjaHomePage ninjaHomePage;

	@Before
	public void setUp() {
		santiago.can(BrowseTheWeb.with(hisBrowser));
		hisBrowser.manage().window().maximize();
		hisBrowser.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

	@Given("^que un usuario se quiere registrar en la pagina de ninja para comprar articulos$")
	public void queUnUsuarioSeQuiereRegistrarEnLaPaginaDeNinjaParaComprarArticulos() throws Exception {
		santiago.wasAbleTo(OpenTheBrowser.on(ninjaHomePage));
	}
	private String correo;
	
	@When("^el usuario se autentique en la pagina llenando los campos \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" correspondientes$")
	public void elUsuarioSeAutentiqueEnLaPaginaLlenandoLosCamposCorrespondientes(String nombre, String apellido, String direccion, String ciudad, String pais, String estado, String correo, String contrasena) throws Exception {		
		DatosUsuario usuario = new DatosUsuario(nombre,apellido,correo,contrasena);
		DatosUbicacion ubicacion = new DatosUbicacion(direccion, ciudad, pais, estado);
		this.correo = correo; 
		santiago.attemptsTo(ButtonLogin.on(),
				CreateAccountButton.on(),
				SubmitAccount.on(usuario, ubicacion));

	}

	@Then("^debe ver un mensaje de registro exitoso$")
	public void debeVerUnMensajeDeRegistroExitoso() throws Exception {

		santiago.should(seeThat(Validate.is(),
				equalTo("THE EMAIL ADDRESS " + correo.toUpperCase() + " IS ALREADY IN USE. PLEASE ENTER A DIFFERENT ONE.")));
	}

}
