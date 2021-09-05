package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition1 {
	public WebDriver driver;
	
//	@Before
//	public void setUp(){
//		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
//		driver=new ChromeDriver();
//	}
	@Given("^I want to launch Application with \"([^\"]*)\"$")
	public void i_want_to_launch_Application_with(String url) throws Throwable {
	    loadUrl(url);
	}

	@Given("^I want to select the Transport mode as \"([^\"]*)\"$")
	public void i_want_to_select_the_Transport_mode_as(String transportType) throws Throwable {
		driver.findElement(By.id("weight")).sendKeys("100");
	    driver.findElement(By.id(transportType)).click();
	}

	@When("^I calcualte the cost of the total shipping$")
	public void i_calcualte_the_cost_of_the_total_shipping() throws Throwable {
		testCalculateCost();
	}

	@Then("^I validate cost of the travel with the Message \"([^\"]*)\"$")
	public void i_validate_cost_of_the_travel_with_the_Message(String txt) throws Throwable {
		validateResult(txt);
	}
	 public void loadUrl(String url){
		 driver.get(url);
	 }
	public void testCalculateCost()
	{
		driver.findElement(By.id("calculate")).click();
	}
	public void validateResult(String txt){
		driver.findElement(By.id("result")).getText().equalsIgnoreCase(txt);
	}
	@After
	public void tearDown()
	{
  
	}
}
