package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"Resources/Features/RestAssuredAPI.feature"},
	glue={"Pages","StepDefinitions"},
	dryRun=true,
	tags={"@Get"},
	plugin={"pretty","html:target/cucumber","json:target/cucumber-detailed-reports/json/Temp.json",}
	)
public class REST_Assured {

}
