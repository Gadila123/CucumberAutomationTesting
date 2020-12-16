package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "G:\\AutomationPractice\\CucumberFramework\\src\\test\\java\\features\\login.feature", glue = { "stepDefinition" })
public class TestRunner {

}
