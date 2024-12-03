package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features",
    tags = "@Test1",
    glue = {"StepDefinitions"},
    monochrome = true,
    plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber-reports.html"}
)
public class TestRunner {

}
 