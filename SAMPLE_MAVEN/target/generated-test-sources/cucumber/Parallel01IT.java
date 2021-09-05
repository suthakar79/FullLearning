import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
    features = {"classpath:Features/Address.feature"},
    format = {"json:target/cucumber-parallel/1.json", "html:target/cucumber-parallel/1.html", "pretty"},
    monochrome = false,
    tags = {"~@ignored"},
    glue = { "com.sample_MAVEN.Pages", "com.sample_MAVEN.StepDefinitions" })
public class Parallel01IT {
}