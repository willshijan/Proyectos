package userInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CreateAccountPage {
	
	public static final Target CREATE_ACCOUNT = Target.the("CreateAccount").located(By.xpath("/html/body/div[2]/main/div/article/section/div/div/div/div[2]/a"));

}
