import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
    features = {"classpath:Features/RestAssuredAPI.feature"},
    format = {"json:target/cucumber-parallel/5.json", "html:target/cucumber-parallel/5.html", "pretty"},
    monochrome = false,
    tags = {"~@ignored"},
    glue = { "com.sample_MAVEN.Pages", "com.sample_MAVEN.StepDefinitions" })
public class Parallel05IT {
}