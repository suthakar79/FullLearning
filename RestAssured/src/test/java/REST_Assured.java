import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/test/Features/RestAssured.feature"},
	glue={"StepDefinitions"},
	tags={"@put"},
	plugin={"pretty","html:target/cucumber","json:target/cucumber-detailed-reports/json/Temp.json",}
	)
public class REST_Assured {

}
