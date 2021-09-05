import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
    features = {"classpath:Features/shipping1.feature"},
    format = {"json:target/cucumber-parallel/7.json", "html:target/cucumber-parallel/7.html", "pretty"},
    monochrome = false,
    tags = {"~@ignored"},
    glue = { "com.sample_MAVEN.Pages", "com.sample_MAVEN.StepDefinitions" })
public class Parallel07IT {
}