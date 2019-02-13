package userInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	
	public static final Target LOGIN_BUTTON = Target.the("LoginButton").located(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/a"));

}
