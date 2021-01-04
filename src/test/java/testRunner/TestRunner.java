package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "G:\\AutomationPractice\\CucumberFramework\\src\\test\\java\\features\\MakeMyTripHomePage.feature", glue = {
		"stepdefinations" }, tags = "@test_1", monochrome = true, plugin = { "pretty",
				"json:target/cucumber-json/cucumber.json", "junit:target/cucumber-reports/Cucumber.xml",
				"html:target/cucumber-reports/Cucumber.html" }, dryRun = false)

public class TestRunner {

}
