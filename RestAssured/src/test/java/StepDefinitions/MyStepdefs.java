package StepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Apiutil;
public class MyStepdefs {
    @Given("^I want to get value of primary address$")
    public void i_want_to_get_value_of_primary_address() throws Throwable {

    }

    @When("^I want to get primary address of the \"([^\"]*)\"$")
    public void i_want_to_get_primary_address_of_the(String url) throws Throwable {
       Apiutil.performGetOps(url);
      //  Apiutil.performGetWithPathparams("1");
    }


    @Given("^I perform POST opeartion for the URL \"([^\"]*)\"$")
    public void iPerformPOSTOpeartionForTheURL(String URL) throws Throwable {
        Apiutil.performPostwithBodyParameter(URL);
    }

    @Given("^I perform POST opeartion for the URL \"([^\"]*)\" with Datatable$")
    public void i_perform_POST_opeartion_for_the_URL_with_Datatable(String url,DataTable table) throws Throwable {
        Apiutil.performPostwithBodyParameterasDatatable(table,url);
    }

    @Then("^I want to print the response for the URL \"([^\"]*)\" on the console$")
    public void iWantToPrintTheResponseForTheURLOnTheConsole(String url) throws Throwable {
        Apiutil.performGetOps(url);
    }

    @Given("^I perform delete operation for the URL \"([^\"]*)\" with Datatable$")
    public void iPerformDeleteOperationForTheURLWithDatatable(String value) throws Throwable {
        Apiutil.performDeleteWithPathparams(value);

    }

    @Given("^I perform PUT opeartion for the URL \"([^\"]*)\" with Datatable$")
    public void iPerformPUTOpeartionForTheURLWithDatatable(String url,DataTable table) throws Throwable {
        Apiutil.performPUTtwithBodyParameterasDatatable(table,url);
    }
}
