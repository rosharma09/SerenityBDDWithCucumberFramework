package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

		// specify the feature file location
		features = "src/test/resources/features/NewCarFeatures/Background.feature",
		glue = "stepdefinations"

)
public class FindNewCarFeatureRunner {

}
