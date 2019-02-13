package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		
		features = "src/test/resources/features/LoginNinjaStore.feature",
		glue = "stepDefinitions",
		snippets = SnippetType.CAMELCASE,
		tags = "@Login"
		
)

public class NinjaRunner {

}
