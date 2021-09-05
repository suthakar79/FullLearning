import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
    features = {"classpath:Features/gmail.feature"},
    format = {"json:target/cucumber-parallel/3.json", "html:target/cucumber-parallel/3.html", "pretty"},
    monochrome = false,
    tags = {"~@ignored"},
    glue = { "com.sample_MAVEN.Pages", "com.sample_MAVEN.StepDefinitions" })
public class Parallel03IT {
}