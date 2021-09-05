package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GooglePages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Googleclass {
	
	public WebDriver driver;
	GooglePages gPages;
//	Googleclass g=null;
	public Googleclass(){}
	public void init(){
		String executionPath = System.getProperty("user.dir");
		System.out.println("Path : "+executionPath);
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		gPages=new GooglePages(driver);
//		g=new Googleclass();
	}
	
	@Given("^I want to navigate Google Feature with \"([^\"]*)\"$")
	public void i_want_to_navigate_Google_Feature_with(String url) throws Throwable {
		init();
		gPages.launchApplication(url);
	}

	@And("^I enter value on \"([^\"]*)\" box$")
	public void i_enter_and(String value) throws Throwable {
		gPages.clearandEnterValue(gPages.getInputBox(), value);
	}

	@When("^I click on search Button$")
	public void i_click_on_signin_Button() throws Throwable {
		//gPages.clickObject(gPages.getSearchButton());
	    
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
	    
	}
}
