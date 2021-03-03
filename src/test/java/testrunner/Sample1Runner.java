package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features/NewCarFeatures/SampleFeature1.feature" }, glue = {
		"stepdefinations" })
public class Sample1Runner {

}
