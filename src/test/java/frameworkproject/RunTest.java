package frameworkproject;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"frameworkproject.stepdefinitions", "frameworkproject.hooks"},
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class RunTest {
    
}
