package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "G:\\AutomationPractice\\CucumberFramework\\src\\test\\java\\features\\Loginfeature.feature", glue = {
		"stepdefinations" }, monochrome = true, plugin = { "pretty",
				"json:target/cucumber-json/cucumber.json", "junit:target/cucumber-reports/Cucumber.xml",
				"html:target/cucumber-reports/Cucumber.html"}, dryRun = false)

public class TestRunner {

}
