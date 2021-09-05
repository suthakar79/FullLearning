package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"Resources/Features/"},
	glue={"Pages","StepDefinitions"},
	dryRun=false,
	tags={"@Discount"},
			//tags={"@Discount , @No-Discount"},
	plugin={"pretty","html:target/cucumber","json:target/cucumber-detailed-reports/json/Temp.json",}
	)
public class CompanyJunit extends AbstractTestNGCucumberTests {

}



/*To run Cucumber test as TestNG
	1.Install the maven dependency like 
	<dependency>
		<groupId>info.cukes</groupId>
		<artifactId>cucumber-testng</artifactId>
		<version>1.2.4</version>
		<scope>test</scope>
	</dependency>

	<!-- https://mvnrepository.com/artifact/org.testng/testng -->
	<dependency>
		<groupId>org.testng</groupId>
		<artifactId>testng</artifactId>
		<version>6.14.3</version>
		<scope>test</scope>
	</dependency>

	2.Extends AbstractTestNGCucumberTests
	3.Comment @RunWith options
	4.RunAs -TestNG 
	5.If you are not getting TestNG option you can install TestNG-Eclipse option
	 */
