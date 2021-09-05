package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions {
	WebDriver driver;
	
	@Given("^I want to launch the application with the URL  \"([^\"]*)\"$")
	public void setup(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get(url);
	    
	    
	}

	@When("^I click  the \"([^\"]*)\" in shipping table$")
	public void testShippingDetails(String LinkText) throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/center/h2")).getText().contains("Shipping Details");
		driver.findElement(By.linkText(LinkText)).click(); 
		
	}

	@Then("^I verify the \"([^\"]*)\" shipping page$")
	public void validateResult(String customerName) throws Throwable {
		driver.findElement(By.xpath("//[@id='result']/table/tbody/tr[2]/td[1]")).getText().equals(customerName);
	    
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	//Cucumber Exercise 
	@Given("^I want to navigate to the url \"([^\"]*)\"$")
	public void i_want_to_navigate_to_the_url(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get(url);
	}

	@When("^I enter username into searchbox$")
	public void i_enter_username_into_searchbox() throws Throwable {
	   driver.findElement(By.id("userId")).sendKeys("Shamili");
	}

	@And("^I click the search Button$")
	public void i_click_the_search_Button() throws Throwable {
	  driver.findElement(By.id("track")).click(); 
	}

	@Then("^I validate the userdetails$")
	public void i_validate_the_userdetails(DataTable table) throws Throwable {
	boolean match=false;
	List<List<String>> sdata=table.raw();
		int j;
	  for(int i=0;i<4;i++){
		  j=i+1;
		  WebElement searchElements=driver.findElement(By.xpath("//div[@id='result']/text()["+j+"]"));
	   if(searchElements.getText().equalsIgnoreCase(sdata.get(i).get(i)))
		   match=true;
	   else
		  match=false;
	}
	  if(match)
		  System.out.println("Datatable values are matched with SearchResults");
	  else
		  System.out.println("Datatable values are not matched with SearchResults");
	}


	//cucumber Excerise-4
	
	@Given("^I want to navigate to the \"([^\"]*)\"$")
	public void i_want_to_navigate_to_the(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get(url);
	}

	@When("^I pass the value \"([^\"]*)\" and \"([^\"]*)\" to the page$")
	public void i_pass_the_value_and_to_the_page(String weight, String height) throws Throwable {
		driver.findElement(By.id("weight")).sendKeys(weight);
		driver.findElement(By.id("distance")).sendKeys(height);
		driver.findElement(By.id("submit")).click();
	}

	@Then("^I verify the \"([^\"]*)\" as result$")
	public void i_verify_the_as_result(String arg1) throws Throwable {
		if(driver.findElement(By.id("result")).getText().equalsIgnoreCase(arg1))
			System.out.println("Results match with Expected Results");
		else
			System.out.println("Results does not match with Expected Results");
				
	}

//cucumber CC
	@When("^I enter the values for Address Book$")
	public void i_enter_the_values_for_Address_Book(DataTable table) throws Throwable {
		List<List<String>> sdata=table.raw();
		driver.findElement(By.id("nickname")).sendKeys(sdata.get(0).get(0));
		driver.findElement(By.id("contact")).sendKeys(sdata.get(0).get(1));
		driver.findElement(By.id("company")).sendKeys(sdata.get(0).get(2));
		driver.findElement(By.id("city")).sendKeys(sdata.get(0).get(3));
		driver.findElement(By.id("country")).sendKeys(sdata.get(0).get(4));
		driver.findElement(By.id("type")).sendKeys(sdata.get(0).get(5));
	}

	@When("^I click the Add Button$")
	public void i_click_the_Add_Button() throws Throwable {
		driver.findElement(By.id("add")).click();
	}

	@Then("^I verify the Address book page displayed$")
	public void i_verify_the_Address_book_page_displayed(String text) throws Throwable {
		WebElement sTable=driver.findElement(By.xpath("//div[@id='result']/table/tbody"));
		int n=sTable.findElements(By.tagName("tr")).size();
		boolean found=false;
		for(int i=0;i<n;i++){
		if(driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr["+i+"]/td[2]")).getText().equals(text))
		found=true;}
		if(found){
		System.out.println("Record added");}
	}

	@When("^I click the delete button from the Address Book table$")
	public void i_click_the_delete_button_from_the_Address_Book_table() throws Throwable {
		driver.findElement(By.id("delete")).click();
	   
	}

	@Then("^I verify the Address book records are deleted$")
	public void i_verify_the_Address_book_records_are_deleted() throws Throwable {
	    
	}

	@When("^I click the Editbutton from the Address Book table$")
	public void i_click_the_Editbutton_from_the_Address_Book_table() throws Throwable {
		driver.findElement(By.id("edit")).click();
	}

	@Then("^I verify data are populated in the table$")
	public void i_verify_data_are_populated_in_the_table() throws Throwable {
	    
	}

	@Then("^I update the data \"([^\"]*)\"$")
	public void i_update_the_data(String arg1) throws Throwable {
		driver.findElement(By.id("contact")).sendKeys(arg1);
		driver.findElement(By.id("update")).click();
	}

	@Then("^I verify the edited data are displayed on the Address Book Table$")
	public void i_verify_the_edited_data_are_displayed_on_the_Address_Book_Table(String text) throws Throwable {
		WebElement sTable=driver.findElement(By.xpath("//div[@id='result']/table/tbody"));
		int n=sTable.findElements(By.tagName("tr")).size();
		boolean found=false;
		for(int i=0;i<n;i++){
		if(driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr["+i+"]/td[2]")).getText().equals(text))
		found=true;}
		if(found){
		System.out.println("Record added");}
	   
	}


	
}
