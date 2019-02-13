package userInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SubmitAccountInformationPage {
	
	public static final Target EMAIL_ADDRES = Target.the("EmailAddres").located(By.xpath("//*[@id=\"input-FormField_1\"]"));
	public static final Target PASSWORD = Target.the("password").located(By.xpath("//*[@id=\"password-FormField_2\"]"));
	public static final Target CONFIRM_PASSWORD = Target.the("confirmpassword").located(By.xpath("//*[@id=\"password-FormField_3\"]"));
	public static final Target FIRST_NAME = Target.the("firstname").located(By.xpath("//*[@id=\"input-FormField_4\"]"));
	public static final Target LAST_NAME = Target.the("lastname").located(By.xpath("//*[@id=\"input-FormField_5\"]"));
	public static final Target COMPANY_NAME = Target.the("companyname").located(By.xpath("//*[@id=\"input-FormField_6\"]"));
	public static final Target ADDRESS_LINE1 = Target.the("addresline1").located(By.xpath("//*[@id=\"input-FormField_8\"]"));
	public static final Target ADDRESS_LINE2 = Target.the("addresline2").located(By.xpath("//*[@id=\"input-FormField_9\"]"));
	public static final Target CITY = Target.the("city").located(By.xpath("//*[@id=\"input-FormField_10\"]"));
	public static final Target STATE = Target.the("state").located(By.xpath("//*[@id=\"select-FormField_12\"]/option[13]"));
	public static final Target COUNTRY = Target.the("country").located(By.xpath("//*[@id=\"select-FormField_11\"]/option[232]"));
	public static final Target ZIP = Target.the("zip").located(By.xpath("//*[@id=\"input-FormField_13\"]"));
	public static final Target NUMBER = Target.the("number").located(By.xpath("//*[@id=\"input-FormField_7\"]"));
	public static final Target NINJAS_FIRST_NAME = Target.the("ninjasfirstname").located(By.xpath("//*[@id=\"input-FormField_46\"]"));
	public static final Target NINJAS_LAST_NAME = Target.the("ninjaslastname").located(By.xpath("//*[@id=\"input-FormField_38\"]"));
	public static final Target BDAY_YEAR= Target.the("bdayyear").located(By.xpath("//*[@id=\"date-year-FormField_42\"]"));
	public static final Target BDAY_MONTH= Target.the("bdaymonth").located(By.xpath("//*[@id=\"date-month-FormField_42\"]"));
	public static final Target BDAY_DAY= Target.the("bdayday").located(By.xpath("//*[@id=\"date-day-FormField_42\"]"));
	public static final Target CHILD_NAME= Target.the("childname").located(By.xpath("//*[@id=\"input-FormField_32\"]"));
	public static final Target CHOOSE_GYM_NAME= Target.the("choosegymname").located(By.xpath("//*[@id=\"select-FormField_36\"]/option[1]"));
	public static final Target CREATE_ACCOUNT= Target.the("createaccount").located(By.xpath("/html/body/div[2]/main/div/article/section/div/div[2]/form/div[3]/input"));
	
	
	
	
	
	

}
