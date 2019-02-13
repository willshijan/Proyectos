package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CreateAccountButtonPage {
	
	public static final Target CEATE_ACCOUNT_BUTTON = Target.the("create account button").located(By.xpath("/html/body/div[2]/main/div/article/section/div/div/div/div[2]/a"));

}
