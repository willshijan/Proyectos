package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginButtonPage {
	
	public static final Target LOGGIN_BUTTON = Target.the("login button").located(By.xpath("/html/body/div[2]/header/div[1]/div/div[2]/a"));

}
