package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import models.DatosUbicacion;
import models.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.SubmitAccountPage;
import utils.Country;
import utils.State;

public class SubmitAccount implements Task{
	private DatosUsuario usuario;
	private DatosUbicacion ubicacion;
	
	public SubmitAccount(DatosUsuario usuario, DatosUbicacion ubicacion) {
		this.usuario = usuario;
		this.ubicacion = ubicacion;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(usuario.getCorreo()).into(SubmitAccountPage.EMAIL_ADDRES),
				Enter.theValue(usuario.getContraseña()).into(SubmitAccountPage.PASSWORD),
				Enter.theValue(usuario.getContraseña()).into(SubmitAccountPage.CONFIRM_PASSWORD),
				Enter.theValue(usuario.getNombre()).into(SubmitAccountPage.FIRST_NAME),
				Enter.theValue(usuario.getApellido()).into(SubmitAccountPage.LAST_NAME),
				Enter.theValue("Devco").into(SubmitAccountPage.COMPANY_NAME),
				Enter.theValue(ubicacion.getDireccion()).into(SubmitAccountPage.ADDRESS_LINE1),
				Enter.theValue(ubicacion.getDireccion()).into(SubmitAccountPage.ADDRESS_LINE2),
				Enter.theValue(ubicacion.getCiudad()).into(SubmitAccountPage.CITY),
				Click.on(SubmitAccountPage.STATE.of(State.valueOf(ubicacion.getEstado().replace(" ", "_").toUpperCase()).state())),
				Click.on(SubmitAccountPage.COUNTRY.of(Country.valueOf(ubicacion.getPais().replace(" ", "_").toUpperCase()).country())),
				Enter.theValue("1010223").into(SubmitAccountPage.ZIP),
				Enter.theValue("3322443").into(SubmitAccountPage.NUMBER),
				Enter.theValue("Santiago").into(SubmitAccountPage.NINJAS_FIRST_NAME),
				Enter.theValue("Botero").into(SubmitAccountPage.NINJAS_LAST_NAME),
				Click.on(SubmitAccountPage.BDAY_YEAR),
				Click.on(SubmitAccountPage.BDAY_MONTH),
				Click.on(SubmitAccountPage.BDAY_DAY),
				Enter.theValue(usuario.getNombre()).into(SubmitAccountPage.CHILD_NAME),
				Click.on(SubmitAccountPage.CHOOSE_GYM_NAME),
				Click.on(SubmitAccountPage.CREATE_ACCOUNT));
		
	}
	
	public static SubmitAccount on(DatosUsuario usuario, DatosUbicacion ubicacion) {
		return instrumented(SubmitAccount.class,usuario,ubicacion);
	}

}
