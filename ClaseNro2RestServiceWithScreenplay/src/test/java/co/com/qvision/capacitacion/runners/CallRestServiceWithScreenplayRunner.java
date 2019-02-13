package co.com.qvision.capacitacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions
 (
   features ="src\\test\\resources\\features",
   glue = "co.com.qvision.capacitacion.stepdefinitions",
   snippets = SnippetType.CAMELCASE
 )
public class CallRestServiceWithScreenplayRunner {

}
